package com.artqiyi.dao.mapper;

import com.artqiyi.dao.model.GamePk;
import com.artqiyi.dao.model.GamePkExample;
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

public interface GamePkMapper {
    @SelectProvider(type=GamePkSqlProvider.class, method="countByExample")
    int countByExample(GamePkExample example);

    @DeleteProvider(type=GamePkSqlProvider.class, method="deleteByExample")
    int deleteByExample(GamePkExample example);

    @Delete({
        "delete from game_pk",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into game_pk (game_filed_id, user_id, ",
        "rival_user_id, score, ",
        "rival_score, level_count, ",
        "recover_times, pass_through_times, ",
        "is_win, is_finish, create_time, ",
        "update_time, rival_update_time)",
        "values (#{gameFiledId,jdbcType=INTEGER}, #{userId,jdbcType=BIGINT}, ",
        "#{rivalUserId,jdbcType=BIGINT}, #{score,jdbcType=INTEGER}, ",
        "#{rivalScore,jdbcType=INTEGER}, #{levelCount,jdbcType=SMALLINT}, ",
        "#{recoverTimes,jdbcType=TINYINT}, #{passThroughTimes,jdbcType=SMALLINT}, ",
        "#{isWin,jdbcType=BIT}, #{isFinish,jdbcType=BIT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP}, #{rivalUpdateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(GamePk record);

    @InsertProvider(type=GamePkSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(GamePk record);

    @SelectProvider(type=GamePkSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="game_filed_id", property="gameFiledId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="rival_user_id", property="rivalUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="score", property="score", jdbcType=JdbcType.INTEGER),
        @Result(column="rival_score", property="rivalScore", jdbcType=JdbcType.INTEGER),
        @Result(column="level_count", property="levelCount", jdbcType=JdbcType.SMALLINT),
        @Result(column="recover_times", property="recoverTimes", jdbcType=JdbcType.TINYINT),
        @Result(column="pass_through_times", property="passThroughTimes", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_win", property="isWin", jdbcType=JdbcType.BIT),
        @Result(column="is_finish", property="isFinish", jdbcType=JdbcType.BIT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="rival_update_time", property="rivalUpdateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GamePk> selectByExample(GamePkExample example);

    @Select({
        "select",
        "id, game_filed_id, user_id, rival_user_id, score, rival_score, level_count, ",
        "recover_times, pass_through_times, is_win, is_finish, create_time, update_time, ",
        "rival_update_time",
        "from game_pk",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="game_filed_id", property="gameFiledId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="rival_user_id", property="rivalUserId", jdbcType=JdbcType.BIGINT),
        @Result(column="score", property="score", jdbcType=JdbcType.INTEGER),
        @Result(column="rival_score", property="rivalScore", jdbcType=JdbcType.INTEGER),
        @Result(column="level_count", property="levelCount", jdbcType=JdbcType.SMALLINT),
        @Result(column="recover_times", property="recoverTimes", jdbcType=JdbcType.TINYINT),
        @Result(column="pass_through_times", property="passThroughTimes", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_win", property="isWin", jdbcType=JdbcType.BIT),
        @Result(column="is_finish", property="isFinish", jdbcType=JdbcType.BIT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="rival_update_time", property="rivalUpdateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GamePk selectByPrimaryKey(Long id);

    @UpdateProvider(type=GamePkSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GamePk record, @Param("example") GamePkExample example);

    @UpdateProvider(type=GamePkSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GamePk record, @Param("example") GamePkExample example);

    @UpdateProvider(type=GamePkSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GamePk record);

    @Update({
        "update game_pk",
        "set game_filed_id = #{gameFiledId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "rival_user_id = #{rivalUserId,jdbcType=BIGINT},",
          "score = #{score,jdbcType=INTEGER},",
          "rival_score = #{rivalScore,jdbcType=INTEGER},",
          "level_count = #{levelCount,jdbcType=SMALLINT},",
          "recover_times = #{recoverTimes,jdbcType=TINYINT},",
          "pass_through_times = #{passThroughTimes,jdbcType=SMALLINT},",
          "is_win = #{isWin,jdbcType=BIT},",
          "is_finish = #{isFinish,jdbcType=BIT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "rival_update_time = #{rivalUpdateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(GamePk record);
}