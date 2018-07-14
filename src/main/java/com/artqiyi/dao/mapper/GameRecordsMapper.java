package com.artqiyi.dao.mapper;

import com.artqiyi.dao.model.GameRecords;
import com.artqiyi.dao.model.GameRecordsExample;
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

public interface GameRecordsMapper {
    @SelectProvider(type=GameRecordsSqlProvider.class, method="countByExample")
    int countByExample(GameRecordsExample example);

    @DeleteProvider(type=GameRecordsSqlProvider.class, method="deleteByExample")
    int deleteByExample(GameRecordsExample example);

    @Delete({
        "delete from game_records",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into game_records (game_no, game_filed_id, ",
        "game_filed_name, contest_num, ",
        "real_contest_num, robot_contest_num, ",
        "current_contest_num, current_round, ",
        "game_status, start_time, ",
        "end_time, create_time, ",
        "update_time)",
        "values (#{gameNo,jdbcType=VARCHAR}, #{gameFiledId,jdbcType=BIGINT}, ",
        "#{gameFiledName,jdbcType=VARCHAR}, #{contestNum,jdbcType=INTEGER}, ",
        "#{realContestNum,jdbcType=INTEGER}, #{robotContestNum,jdbcType=INTEGER}, ",
        "#{currentContestNum,jdbcType=INTEGER}, #{currentRound,jdbcType=SMALLINT}, ",
        "#{gameStatus,jdbcType=SMALLINT}, #{startTime,jdbcType=TIMESTAMP}, ",
        "#{endTime,jdbcType=TIMESTAMP}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GameRecords record);

    @InsertProvider(type=GameRecordsSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GameRecords record);

    @SelectProvider(type=GameRecordsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="game_no", property="gameNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="game_filed_id", property="gameFiledId", jdbcType=JdbcType.BIGINT),
        @Result(column="game_filed_name", property="gameFiledName", jdbcType=JdbcType.VARCHAR),
        @Result(column="contest_num", property="contestNum", jdbcType=JdbcType.INTEGER),
        @Result(column="real_contest_num", property="realContestNum", jdbcType=JdbcType.INTEGER),
        @Result(column="robot_contest_num", property="robotContestNum", jdbcType=JdbcType.INTEGER),
        @Result(column="current_contest_num", property="currentContestNum", jdbcType=JdbcType.INTEGER),
        @Result(column="current_round", property="currentRound", jdbcType=JdbcType.SMALLINT),
        @Result(column="game_status", property="gameStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GameRecords> selectByExample(GameRecordsExample example);

    @Select({
        "select",
        "id, game_no, game_filed_id, game_filed_name, contest_num, real_contest_num, ",
        "robot_contest_num, current_contest_num, current_round, game_status, start_time, ",
        "end_time, create_time, update_time",
        "from game_records",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="game_no", property="gameNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="game_filed_id", property="gameFiledId", jdbcType=JdbcType.BIGINT),
        @Result(column="game_filed_name", property="gameFiledName", jdbcType=JdbcType.VARCHAR),
        @Result(column="contest_num", property="contestNum", jdbcType=JdbcType.INTEGER),
        @Result(column="real_contest_num", property="realContestNum", jdbcType=JdbcType.INTEGER),
        @Result(column="robot_contest_num", property="robotContestNum", jdbcType=JdbcType.INTEGER),
        @Result(column="current_contest_num", property="currentContestNum", jdbcType=JdbcType.INTEGER),
        @Result(column="current_round", property="currentRound", jdbcType=JdbcType.SMALLINT),
        @Result(column="game_status", property="gameStatus", jdbcType=JdbcType.SMALLINT),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GameRecords selectByPrimaryKey(Long id);

    @UpdateProvider(type=GameRecordsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GameRecords record, @Param("example") GameRecordsExample example);

    @UpdateProvider(type=GameRecordsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GameRecords record, @Param("example") GameRecordsExample example);

    @UpdateProvider(type=GameRecordsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GameRecords record);

    @Update({
        "update game_records",
        "set game_no = #{gameNo,jdbcType=VARCHAR},",
          "game_filed_id = #{gameFiledId,jdbcType=BIGINT},",
          "game_filed_name = #{gameFiledName,jdbcType=VARCHAR},",
          "contest_num = #{contestNum,jdbcType=INTEGER},",
          "real_contest_num = #{realContestNum,jdbcType=INTEGER},",
          "robot_contest_num = #{robotContestNum,jdbcType=INTEGER},",
          "current_contest_num = #{currentContestNum,jdbcType=INTEGER},",
          "current_round = #{currentRound,jdbcType=SMALLINT},",
          "game_status = #{gameStatus,jdbcType=SMALLINT},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GameRecords record);
}