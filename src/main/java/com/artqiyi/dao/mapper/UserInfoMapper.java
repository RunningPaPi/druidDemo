package com.artqiyi.dao.mapper;

import com.artqiyi.dao.model.UserInfo;
import com.artqiyi.dao.model.UserInfoExample;
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

public interface UserInfoMapper {
    @SelectProvider(type=UserInfoSqlProvider.class, method="countByExample")
    int countByExample(UserInfoExample example);

    @DeleteProvider(type=UserInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserInfoExample example);

    @Delete({
        "delete from user_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user_info (user_id, user_random_no, ",
        "head_pic_url, gender, ",
        "birthday, province_code, ",
        "city_code, area_code, ",
        "invaite_code, level, ",
        "coin, point, balance, ",
        "balance_withdrawable, balance_freezed, ",
        "alipay_account, alipay_realname, ",
        "phone_validated, realname_validated, ",
        "alipay_account_validated, last_login_time, ",
        "create_time, update_time)",
        "values (#{userId,jdbcType=BIGINT}, #{userRandomNo,jdbcType=INTEGER}, ",
        "#{headPicUrl,jdbcType=VARCHAR}, #{gender,jdbcType=SMALLINT}, ",
        "#{birthday,jdbcType=VARCHAR}, #{provinceCode,jdbcType=VARCHAR}, ",
        "#{cityCode,jdbcType=VARCHAR}, #{areaCode,jdbcType=VARCHAR}, ",
        "#{invaiteCode,jdbcType=VARCHAR}, #{level,jdbcType=VARCHAR}, ",
        "#{coin,jdbcType=INTEGER}, #{point,jdbcType=INTEGER}, #{balance,jdbcType=BIGINT}, ",
        "#{balanceWithdrawable,jdbcType=BIGINT}, #{balanceFreezed,jdbcType=BIGINT}, ",
        "#{alipayAccount,jdbcType=VARCHAR}, #{alipayRealname,jdbcType=VARCHAR}, ",
        "#{phoneValidated,jdbcType=BIT}, #{realnameValidated,jdbcType=BIT}, ",
        "#{alipayAccountValidated,jdbcType=BIT}, #{lastLoginTime,jdbcType=TIMESTAMP}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insert(UserInfo record);

    @InsertProvider(type=UserInfoSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Long.class)
    int insertSelective(UserInfo record);

    @SelectProvider(type=UserInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_random_no", property="userRandomNo", jdbcType=JdbcType.INTEGER),
        @Result(column="head_pic_url", property="headPicUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.SMALLINT),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.VARCHAR),
        @Result(column="province_code", property="provinceCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_code", property="cityCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="area_code", property="areaCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="invaite_code", property="invaiteCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.VARCHAR),
        @Result(column="coin", property="coin", jdbcType=JdbcType.INTEGER),
        @Result(column="point", property="point", jdbcType=JdbcType.INTEGER),
        @Result(column="balance", property="balance", jdbcType=JdbcType.BIGINT),
        @Result(column="balance_withdrawable", property="balanceWithdrawable", jdbcType=JdbcType.BIGINT),
        @Result(column="balance_freezed", property="balanceFreezed", jdbcType=JdbcType.BIGINT),
        @Result(column="alipay_account", property="alipayAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="alipay_realname", property="alipayRealname", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_validated", property="phoneValidated", jdbcType=JdbcType.BIT),
        @Result(column="realname_validated", property="realnameValidated", jdbcType=JdbcType.BIT),
        @Result(column="alipay_account_validated", property="alipayAccountValidated", jdbcType=JdbcType.BIT),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<UserInfo> selectByExample(UserInfoExample example);

    @Select({
        "select",
        "id, user_id, user_random_no, head_pic_url, gender, birthday, province_code, ",
        "city_code, area_code, invaite_code, level, coin, point, balance, balance_withdrawable, ",
        "balance_freezed, alipay_account, alipay_realname, phone_validated, realname_validated, ",
        "alipay_account_validated, last_login_time, create_time, update_time",
        "from user_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_random_no", property="userRandomNo", jdbcType=JdbcType.INTEGER),
        @Result(column="head_pic_url", property="headPicUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.SMALLINT),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.VARCHAR),
        @Result(column="province_code", property="provinceCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_code", property="cityCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="area_code", property="areaCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="invaite_code", property="invaiteCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="level", property="level", jdbcType=JdbcType.VARCHAR),
        @Result(column="coin", property="coin", jdbcType=JdbcType.INTEGER),
        @Result(column="point", property="point", jdbcType=JdbcType.INTEGER),
        @Result(column="balance", property="balance", jdbcType=JdbcType.BIGINT),
        @Result(column="balance_withdrawable", property="balanceWithdrawable", jdbcType=JdbcType.BIGINT),
        @Result(column="balance_freezed", property="balanceFreezed", jdbcType=JdbcType.BIGINT),
        @Result(column="alipay_account", property="alipayAccount", jdbcType=JdbcType.VARCHAR),
        @Result(column="alipay_realname", property="alipayRealname", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_validated", property="phoneValidated", jdbcType=JdbcType.BIT),
        @Result(column="realname_validated", property="realnameValidated", jdbcType=JdbcType.BIT),
        @Result(column="alipay_account_validated", property="alipayAccountValidated", jdbcType=JdbcType.BIT),
        @Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    UserInfo selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    @UpdateProvider(type=UserInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    @UpdateProvider(type=UserInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserInfo record);

    @Update({
        "update user_info",
        "set user_id = #{userId,jdbcType=BIGINT},",
          "user_random_no = #{userRandomNo,jdbcType=INTEGER},",
          "head_pic_url = #{headPicUrl,jdbcType=VARCHAR},",
          "gender = #{gender,jdbcType=SMALLINT},",
          "birthday = #{birthday,jdbcType=VARCHAR},",
          "province_code = #{provinceCode,jdbcType=VARCHAR},",
          "city_code = #{cityCode,jdbcType=VARCHAR},",
          "area_code = #{areaCode,jdbcType=VARCHAR},",
          "invaite_code = #{invaiteCode,jdbcType=VARCHAR},",
          "level = #{level,jdbcType=VARCHAR},",
          "coin = #{coin,jdbcType=INTEGER},",
          "point = #{point,jdbcType=INTEGER},",
          "balance = #{balance,jdbcType=BIGINT},",
          "balance_withdrawable = #{balanceWithdrawable,jdbcType=BIGINT},",
          "balance_freezed = #{balanceFreezed,jdbcType=BIGINT},",
          "alipay_account = #{alipayAccount,jdbcType=VARCHAR},",
          "alipay_realname = #{alipayRealname,jdbcType=VARCHAR},",
          "phone_validated = #{phoneValidated,jdbcType=BIT},",
          "realname_validated = #{realnameValidated,jdbcType=BIT},",
          "alipay_account_validated = #{alipayAccountValidated,jdbcType=BIT},",
          "last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(UserInfo record);
}