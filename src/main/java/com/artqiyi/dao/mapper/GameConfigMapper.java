package com.artqiyi.dao.mapper;

import com.artqiyi.dao.model.GameConfig;
import com.artqiyi.dao.model.GameConfigExample;
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

public interface GameConfigMapper {
    @SelectProvider(type=GameConfigSqlProvider.class, method="countByExample")
    int countByExample(GameConfigExample example);

    @DeleteProvider(type=GameConfigSqlProvider.class, method="deleteByExample")
    int deleteByExample(GameConfigExample example);

    @Delete({
        "delete from game_config",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into game_config (name, alias_name, ",
        "type_key, code, type_value, ",
        "unit, sort, status, ",
        "remark, create_time, ",
        "update_time)",
        "values (#{name,jdbcType=VARCHAR}, #{aliasName,jdbcType=VARCHAR}, ",
        "#{typeKey,jdbcType=VARCHAR}, #{code,jdbcType=VARCHAR}, #{typeValue,jdbcType=VARCHAR}, ",
        "#{unit,jdbcType=VARCHAR}, #{sort,jdbcType=SMALLINT}, #{status,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(GameConfig record);

    @InsertProvider(type=GameConfigSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(GameConfig record);

    @SelectProvider(type=GameConfigSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="alias_name", property="aliasName", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_key", property="typeKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_value", property="typeValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.SMALLINT),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GameConfig> selectByExample(GameConfigExample example);

    @Select({
        "select",
        "id, name, alias_name, type_key, code, type_value, unit, sort, status, remark, ",
        "create_time, update_time",
        "from game_config",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="alias_name", property="aliasName", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_key", property="typeKey", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="type_value", property="typeValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.SMALLINT),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    GameConfig selectByPrimaryKey(Integer id);

    @UpdateProvider(type=GameConfigSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") GameConfig record, @Param("example") GameConfigExample example);

    @UpdateProvider(type=GameConfigSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") GameConfig record, @Param("example") GameConfigExample example);

    @UpdateProvider(type=GameConfigSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(GameConfig record);

    @Update({
        "update game_config",
        "set name = #{name,jdbcType=VARCHAR},",
          "alias_name = #{aliasName,jdbcType=VARCHAR},",
          "type_key = #{typeKey,jdbcType=VARCHAR},",
          "code = #{code,jdbcType=VARCHAR},",
          "type_value = #{typeValue,jdbcType=VARCHAR},",
          "unit = #{unit,jdbcType=VARCHAR},",
          "sort = #{sort,jdbcType=SMALLINT},",
          "status = #{status,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(GameConfig record);
}