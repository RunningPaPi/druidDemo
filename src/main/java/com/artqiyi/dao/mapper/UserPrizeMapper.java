package com.artqiyi.dao.mapper;

import com.artqiyi.dao.model.UserPrize;
import com.artqiyi.dao.model.UserPrizeExample;
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

public interface UserPrizeMapper {
    @SelectProvider(type=UserPrizeSqlProvider.class, method="countByExample")
    int countByExample(UserPrizeExample example);

    @DeleteProvider(type=UserPrizeSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserPrizeExample example);

    @Delete({
        "delete from user_prize",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_prize (user_id, good_id, ",
        "prize_name, prize_type, ",
        "is_received, create_time, ",
        "update_time)",
        "values (#{userId,jdbcType=BIGINT}, #{goodId,jdbcType=BIGINT}, ",
        "#{prizeName,jdbcType=VARCHAR}, #{prizeType,jdbcType=SMALLINT}, ",
        "#{isReceived,jdbcType=BIT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(UserPrize record);

    @InsertProvider(type=UserPrizeSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(UserPrize record);

    @SelectProvider(type=UserPrizeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="good_id", property="goodId", jdbcType=JdbcType.BIGINT),
        @Result(column="prize_name", property="prizeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="prize_type", property="prizeType", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_received", property="isReceived", jdbcType=JdbcType.BIT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserPrize> selectByExample(UserPrizeExample example);

    @Select({
        "select",
        "id, user_id, good_id, prize_name, prize_type, is_received, create_time, update_time",
        "from user_prize",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="good_id", property="goodId", jdbcType=JdbcType.BIGINT),
        @Result(column="prize_name", property="prizeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="prize_type", property="prizeType", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_received", property="isReceived", jdbcType=JdbcType.BIT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    UserPrize selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserPrizeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserPrize record, @Param("example") UserPrizeExample example);

    @UpdateProvider(type=UserPrizeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserPrize record, @Param("example") UserPrizeExample example);

    @UpdateProvider(type=UserPrizeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserPrize record);

    @Update({
        "update user_prize",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "good_id = #{goodId,jdbcType=BIGINT},",
          "prize_name = #{prizeName,jdbcType=VARCHAR},",
          "prize_type = #{prizeType,jdbcType=SMALLINT},",
          "is_received = #{isReceived,jdbcType=BIT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserPrize record);
}