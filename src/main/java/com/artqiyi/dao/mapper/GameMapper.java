package com.artqiyi.dao.mapper;

import com.artqiyi.dao.model.Game;
import com.artqiyi.dao.model.GameExample;
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

public interface GameMapper {
    @SelectProvider(type=GameSqlProvider.class, method="countByExample")
    int countByExample(GameExample example);

    @DeleteProvider(type=GameSqlProvider.class, method="deleteByExample")
    int deleteByExample(GameExample example);

    @Delete({
        "delete from game",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into game (game_key, game_name, ",
        "icon_url, sort, ",
        "status, deleted, remark, ",
        "extentStr1, extentStr2, ",
        "create_id, create_time, ",
        "updator_id, update_time)",
        "values (#{gameKey,jdbcType=VARCHAR}, #{gameName,jdbcType=VARCHAR}, ",
        "#{iconUrl,jdbcType=VARCHAR}, #{sort,jdbcType=SMALLINT}, ",
        "#{status,jdbcType=SMALLINT}, #{deleted,jdbcType=BIT}, #{remark,jdbcType=VARCHAR}, ",
        "#{extentstr1,jdbcType=VARCHAR}, #{extentstr2,jdbcType=VARCHAR}, ",
        "#{createId,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updatorId,jdbcType=BIGINT}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(Game record);

    @InsertProvider(type=GameSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(Game record);

    @SelectProvider(type=GameSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="game_key", property="gameKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="game_name", property="gameName", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon_url", property="iconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.SMALLINT),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.BIT),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="extentStr1", property="extentstr1", jdbcType=JdbcType.VARCHAR),
        @Result(column="extentStr2", property="extentstr2", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_id", property="createId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updator_id", property="updatorId", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Game> selectByExample(GameExample example);

    @Select({
        "select",
        "id, game_key, game_name, icon_url, sort, status, deleted, remark, extentStr1, ",
        "extentStr2, create_id, create_time, updator_id, update_time",
        "from game",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="game_key", property="gameKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="game_name", property="gameName", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon_url", property="iconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.SMALLINT),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="deleted", property="deleted", jdbcType=JdbcType.BIT),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="extentStr1", property="extentstr1", jdbcType=JdbcType.VARCHAR),
        @Result(column="extentStr2", property="extentstr2", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_id", property="createId", jdbcType=JdbcType.BIGINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updator_id", property="updatorId", jdbcType=JdbcType.BIGINT),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    Game selectByPrimaryKey(Long id);

    @UpdateProvider(type=GameSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Game record, @Param("example") GameExample example);

    @UpdateProvider(type=GameSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Game record, @Param("example") GameExample example);

    @UpdateProvider(type=GameSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Game record);

    @Update({
        "update game",
        "set game_key = #{gameKey,jdbcType=VARCHAR},",
          "game_name = #{gameName,jdbcType=VARCHAR},",
          "icon_url = #{iconUrl,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=SMALLINT},",
          "status = #{status,jdbcType=SMALLINT},",
          "deleted = #{deleted,jdbcType=BIT},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "extentStr1 = #{extentstr1,jdbcType=VARCHAR},",
          "extentStr2 = #{extentstr2,jdbcType=VARCHAR},",
          "create_id = #{createId,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "updator_id = #{updatorId,jdbcType=BIGINT},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Game record);
}