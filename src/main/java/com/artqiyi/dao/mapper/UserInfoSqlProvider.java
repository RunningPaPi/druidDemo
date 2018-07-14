package com.artqiyi.dao.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.artqiyi.dao.model.UserInfo;
import com.artqiyi.dao.model.UserInfoExample.Criteria;
import com.artqiyi.dao.model.UserInfoExample.Criterion;
import com.artqiyi.dao.model.UserInfoExample;
import java.util.List;
import java.util.Map;

public class UserInfoSqlProvider {

    public String countByExample(UserInfoExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("user_info");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(UserInfoExample example) {
        BEGIN();
        DELETE_FROM("user_info");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(UserInfo record) {
        BEGIN();
        INSERT_INTO("user_info");
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getUserRandomNo() != null) {
            VALUES("user_random_no", "#{userRandomNo,jdbcType=INTEGER}");
        }
        
        if (record.getHeadPicUrl() != null) {
            VALUES("head_pic_url", "#{headPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            VALUES("gender", "#{gender,jdbcType=SMALLINT}");
        }
        
        if (record.getBirthday() != null) {
            VALUES("birthday", "#{birthday,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceCode() != null) {
            VALUES("province_code", "#{provinceCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCityCode() != null) {
            VALUES("city_code", "#{cityCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAreaCode() != null) {
            VALUES("area_code", "#{areaCode,jdbcType=VARCHAR}");
        }
        
        if (record.getInvaiteCode() != null) {
            VALUES("invaite_code", "#{invaiteCode,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            VALUES("level", "#{level,jdbcType=VARCHAR}");
        }
        
        if (record.getCoin() != null) {
            VALUES("coin", "#{coin,jdbcType=INTEGER}");
        }
        
        if (record.getPoint() != null) {
            VALUES("point", "#{point,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            VALUES("balance", "#{balance,jdbcType=BIGINT}");
        }
        
        if (record.getBalanceWithdrawable() != null) {
            VALUES("balance_withdrawable", "#{balanceWithdrawable,jdbcType=BIGINT}");
        }
        
        if (record.getBalanceFreezed() != null) {
            VALUES("balance_freezed", "#{balanceFreezed,jdbcType=BIGINT}");
        }
        
        if (record.getAlipayAccount() != null) {
            VALUES("alipay_account", "#{alipayAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getAlipayRealname() != null) {
            VALUES("alipay_realname", "#{alipayRealname,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneValidated() != null) {
            VALUES("phone_validated", "#{phoneValidated,jdbcType=BIT}");
        }
        
        if (record.getRealnameValidated() != null) {
            VALUES("realname_validated", "#{realnameValidated,jdbcType=BIT}");
        }
        
        if (record.getAlipayAccountValidated() != null) {
            VALUES("alipay_account_validated", "#{alipayAccountValidated,jdbcType=BIT}");
        }
        
        if (record.getLastLoginTime() != null) {
            VALUES("last_login_time", "#{lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(UserInfoExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("user_id");
        SELECT("user_random_no");
        SELECT("head_pic_url");
        SELECT("gender");
        SELECT("birthday");
        SELECT("province_code");
        SELECT("city_code");
        SELECT("area_code");
        SELECT("invaite_code");
        SELECT("level");
        SELECT("coin");
        SELECT("point");
        SELECT("balance");
        SELECT("balance_withdrawable");
        SELECT("balance_freezed");
        SELECT("alipay_account");
        SELECT("alipay_realname");
        SELECT("phone_validated");
        SELECT("realname_validated");
        SELECT("alipay_account_validated");
        SELECT("last_login_time");
        SELECT("create_time");
        SELECT("update_time");
        FROM("user_info");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserInfo record = (UserInfo) parameter.get("record");
        UserInfoExample example = (UserInfoExample) parameter.get("example");
        
        BEGIN();
        UPDATE("user_info");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getUserRandomNo() != null) {
            SET("user_random_no = #{record.userRandomNo,jdbcType=INTEGER}");
        }
        
        if (record.getHeadPicUrl() != null) {
            SET("head_pic_url = #{record.headPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            SET("gender = #{record.gender,jdbcType=SMALLINT}");
        }
        
        if (record.getBirthday() != null) {
            SET("birthday = #{record.birthday,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceCode() != null) {
            SET("province_code = #{record.provinceCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCityCode() != null) {
            SET("city_code = #{record.cityCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAreaCode() != null) {
            SET("area_code = #{record.areaCode,jdbcType=VARCHAR}");
        }
        
        if (record.getInvaiteCode() != null) {
            SET("invaite_code = #{record.invaiteCode,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            SET("level = #{record.level,jdbcType=VARCHAR}");
        }
        
        if (record.getCoin() != null) {
            SET("coin = #{record.coin,jdbcType=INTEGER}");
        }
        
        if (record.getPoint() != null) {
            SET("point = #{record.point,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            SET("balance = #{record.balance,jdbcType=BIGINT}");
        }
        
        if (record.getBalanceWithdrawable() != null) {
            SET("balance_withdrawable = #{record.balanceWithdrawable,jdbcType=BIGINT}");
        }
        
        if (record.getBalanceFreezed() != null) {
            SET("balance_freezed = #{record.balanceFreezed,jdbcType=BIGINT}");
        }
        
        if (record.getAlipayAccount() != null) {
            SET("alipay_account = #{record.alipayAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getAlipayRealname() != null) {
            SET("alipay_realname = #{record.alipayRealname,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneValidated() != null) {
            SET("phone_validated = #{record.phoneValidated,jdbcType=BIT}");
        }
        
        if (record.getRealnameValidated() != null) {
            SET("realname_validated = #{record.realnameValidated,jdbcType=BIT}");
        }
        
        if (record.getAlipayAccountValidated() != null) {
            SET("alipay_account_validated = #{record.alipayAccountValidated,jdbcType=BIT}");
        }
        
        if (record.getLastLoginTime() != null) {
            SET("last_login_time = #{record.lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("user_info");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("user_id = #{record.userId,jdbcType=BIGINT}");
        SET("user_random_no = #{record.userRandomNo,jdbcType=INTEGER}");
        SET("head_pic_url = #{record.headPicUrl,jdbcType=VARCHAR}");
        SET("gender = #{record.gender,jdbcType=SMALLINT}");
        SET("birthday = #{record.birthday,jdbcType=VARCHAR}");
        SET("province_code = #{record.provinceCode,jdbcType=VARCHAR}");
        SET("city_code = #{record.cityCode,jdbcType=VARCHAR}");
        SET("area_code = #{record.areaCode,jdbcType=VARCHAR}");
        SET("invaite_code = #{record.invaiteCode,jdbcType=VARCHAR}");
        SET("level = #{record.level,jdbcType=VARCHAR}");
        SET("coin = #{record.coin,jdbcType=INTEGER}");
        SET("point = #{record.point,jdbcType=INTEGER}");
        SET("balance = #{record.balance,jdbcType=BIGINT}");
        SET("balance_withdrawable = #{record.balanceWithdrawable,jdbcType=BIGINT}");
        SET("balance_freezed = #{record.balanceFreezed,jdbcType=BIGINT}");
        SET("alipay_account = #{record.alipayAccount,jdbcType=VARCHAR}");
        SET("alipay_realname = #{record.alipayRealname,jdbcType=VARCHAR}");
        SET("phone_validated = #{record.phoneValidated,jdbcType=BIT}");
        SET("realname_validated = #{record.realnameValidated,jdbcType=BIT}");
        SET("alipay_account_validated = #{record.alipayAccountValidated,jdbcType=BIT}");
        SET("last_login_time = #{record.lastLoginTime,jdbcType=TIMESTAMP}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        UserInfoExample example = (UserInfoExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(UserInfo record) {
        BEGIN();
        UPDATE("user_info");
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getUserRandomNo() != null) {
            SET("user_random_no = #{userRandomNo,jdbcType=INTEGER}");
        }
        
        if (record.getHeadPicUrl() != null) {
            SET("head_pic_url = #{headPicUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            SET("gender = #{gender,jdbcType=SMALLINT}");
        }
        
        if (record.getBirthday() != null) {
            SET("birthday = #{birthday,jdbcType=VARCHAR}");
        }
        
        if (record.getProvinceCode() != null) {
            SET("province_code = #{provinceCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCityCode() != null) {
            SET("city_code = #{cityCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAreaCode() != null) {
            SET("area_code = #{areaCode,jdbcType=VARCHAR}");
        }
        
        if (record.getInvaiteCode() != null) {
            SET("invaite_code = #{invaiteCode,jdbcType=VARCHAR}");
        }
        
        if (record.getLevel() != null) {
            SET("level = #{level,jdbcType=VARCHAR}");
        }
        
        if (record.getCoin() != null) {
            SET("coin = #{coin,jdbcType=INTEGER}");
        }
        
        if (record.getPoint() != null) {
            SET("point = #{point,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            SET("balance = #{balance,jdbcType=BIGINT}");
        }
        
        if (record.getBalanceWithdrawable() != null) {
            SET("balance_withdrawable = #{balanceWithdrawable,jdbcType=BIGINT}");
        }
        
        if (record.getBalanceFreezed() != null) {
            SET("balance_freezed = #{balanceFreezed,jdbcType=BIGINT}");
        }
        
        if (record.getAlipayAccount() != null) {
            SET("alipay_account = #{alipayAccount,jdbcType=VARCHAR}");
        }
        
        if (record.getAlipayRealname() != null) {
            SET("alipay_realname = #{alipayRealname,jdbcType=VARCHAR}");
        }
        
        if (record.getPhoneValidated() != null) {
            SET("phone_validated = #{phoneValidated,jdbcType=BIT}");
        }
        
        if (record.getRealnameValidated() != null) {
            SET("realname_validated = #{realnameValidated,jdbcType=BIT}");
        }
        
        if (record.getAlipayAccountValidated() != null) {
            SET("alipay_account_validated = #{alipayAccountValidated,jdbcType=BIT}");
        }
        
        if (record.getLastLoginTime() != null) {
            SET("last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(UserInfoExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}