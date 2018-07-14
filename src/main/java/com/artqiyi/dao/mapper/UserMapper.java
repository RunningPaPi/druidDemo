package com.artqiyi.dao.mapper;

import com.artqiyi.dao.model.User;
import com.artqiyi.dao.model.UserExample;
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

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    int countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user (nick_name, password, ",
        "phone, email, token, ",
        "union_id, token_id, ",
        "registe_type, status, ",
        "is_robot, create_time, ",
        "update_time)",
        "values (#{nickName,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, #{token,jdbcType=VARCHAR}, ",
        "#{unionId,jdbcType=VARCHAR}, #{tokenId,jdbcType=VARCHAR}, ",
        "#{registeType,jdbcType=SMALLINT}, #{status,jdbcType=SMALLINT}, ",
        "#{isRobot,jdbcType=BIT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="union_id", property="unionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="token_id", property="tokenId", jdbcType=JdbcType.VARCHAR),
        @Result(column="registe_type", property="registeType", jdbcType=JdbcType.SMALLINT),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_robot", property="isRobot", jdbcType=JdbcType.BIT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "id, nick_name, password, phone, email, token, union_id, token_id, registe_type, ",
        "status, is_robot, create_time, update_time",
        "from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="token", property="token", jdbcType=JdbcType.VARCHAR),
        @Result(column="union_id", property="unionId", jdbcType=JdbcType.VARCHAR),
        @Result(column="token_id", property="tokenId", jdbcType=JdbcType.VARCHAR),
        @Result(column="registe_type", property="registeType", jdbcType=JdbcType.SMALLINT),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_robot", property="isRobot", jdbcType=JdbcType.BIT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    User selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set nick_name = #{nickName,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "token = #{token,jdbcType=VARCHAR},",
          "union_id = #{unionId,jdbcType=VARCHAR},",
          "token_id = #{tokenId,jdbcType=VARCHAR},",
          "registe_type = #{registeType,jdbcType=SMALLINT},",
          "status = #{status,jdbcType=SMALLINT},",
          "is_robot = #{isRobot,jdbcType=BIT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(User record);
}