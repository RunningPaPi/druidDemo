package com.artqiyi.dao.mapper;

import com.artqiyi.dao.model.GameUserRecords;
import com.artqiyi.dao.model.GameUserRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface GameUserRecordsMapper {
    @SelectProvider(type=GameUserRecordsSqlProvider.class, method="countByExample")
    int countByExample(GameUserRecordsExample example);

    @DeleteProvider(type=GameUserRecordsSqlProvider.class, method="deleteByExample")
    int deleteByExample(GameUserRecordsExample example);

    @Delete({
        "delete from game_user_records",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into game_user_records (game_field_id, game_no, ",
        "user_id, nick_name, ",
        "head_url, is_robot, is_out, ",
        "game_round, score, ",
        "note, rank, create_time, ",
        "update_time)",
        "values (#{gameFieldId,jdbcType=BIGINT}, #{gameNo,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=BIGINT}, #{nickName,jdbcType=VARCHAR}, ",
        "#{headUrl,jdbcType=VARCHAR}, #{isRobot,jdbcType=BIT}, #{isOut,jdbcType=BIT}, ",
        "#{gameRound,jdbcType=SMALLINT}, #{score,jdbcType=INTEGER}, ",
        "#{note,jdbcType=VARCHAR}, #{rank,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GameUserRecords record);

    @InsertProvider(type=GameUserRecordsSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GameUserRecords record);

    @SelectProvider(type=GameUserRecordsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="game_field_id", property="gameFieldId", jdbcType=JdbcType.BIGINT),
        @Result(column="game_no", property="gameNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="head_url", property="headUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_robot", property="isRobot", jdbcType=JdbcType.BIT),
        @Result(column="is_out", property="isOut", jdbcType=JdbcType.BIT),
        @Result(column="game_round", property="gameRound", jdbcType=JdbcType.SMALLINT),
        @Result(column="score", property="score", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="rank", property="rank", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GameUserRecords> selectByExample(GameUserRecordsExample example);

    @Select({
        "select",
        "id, game_field_id, game_no, user_id, nick_name, head_url, is_robot, is_out, ",
        "game_round, score, note, rank, create_time, update_time",
        "from game_user_records",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="game_field_id", property="gameFieldId", jdbcType=JdbcType.BIGINT),
        @Result(column="game_no", property="gameNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="head_url", property="headUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_robot", property="isRobot", jdbcType=JdbcType.BIT),
        @Result(column="is_out", property="isOut", jdbcType=JdbcType.BIT),
        @Result(column="game_round", property="gameRound", jdbcType=JdbcType.SMALLINT),
        @Result(column="score", property="score", jdbcType=JdbcType.INTEGER),
        @Result(column="note", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="rank", property="rank", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GameUserRecords selectByPrimaryKey(Long id);

    @UpdateProvider(type=GameUserRecordsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GameUserRecords record, @Param("example") GameUserRecordsExample example);

    @UpdateProvider(type=GameUserRecordsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GameUserRecords record, @Param("example") GameUserRecordsExample example);

    @UpdateProvider(type=GameUserRecordsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GameUserRecords record);

    @Update({
        "update game_user_records",
        "set game_field_id = #{gameFieldId,jdbcType=BIGINT},",
          "game_no = #{gameNo,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "nick_name = #{nickName,jdbcType=VARCHAR},",
          "head_url = #{headUrl,jdbcType=VARCHAR},",
          "is_robot = #{isRobot,jdbcType=BIT},",
          "is_out = #{isOut,jdbcType=BIT},",
          "game_round = #{gameRound,jdbcType=SMALLINT},",
          "score = #{score,jdbcType=INTEGER},",
          "note = #{note,jdbcType=VARCHAR},",
          "rank = #{rank,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GameUserRecords record);
}