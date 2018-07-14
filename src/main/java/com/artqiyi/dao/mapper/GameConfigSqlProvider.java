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

import com.artqiyi.dao.model.GameConfig;
import com.artqiyi.dao.model.GameConfigExample.Criteria;
import com.artqiyi.dao.model.GameConfigExample.Criterion;
import com.artqiyi.dao.model.GameConfigExample;
import java.util.List;
import java.util.Map;

public class GameConfigSqlProvider {

    public String countByExample(GameConfigExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("game_config");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(GameConfigExample example) {
        BEGIN();
        DELETE_FROM("game_config");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(GameConfig record) {
        BEGIN();
        INSERT_INTO("game_config");
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAliasName() != null) {
            VALUES("alias_name", "#{aliasName,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeKey() != null) {
            VALUES("type_key", "#{typeKey,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeValue() != null) {
            VALUES("type_value", "#{typeValue,jdbcType=VARCHAR}");
        }
        
        if (record.getUnit() != null) {
            VALUES("unit", "#{unit,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            VALUES("sort", "#{sort,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(GameConfigExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("name");
        SELECT("alias_name");
        SELECT("type_key");
        SELECT("code");
        SELECT("type_value");
        SELECT("unit");
        SELECT("sort");
        SELECT("status");
        SELECT("remark");
        SELECT("create_time");
        SELECT("update_time");
        FROM("game_config");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GameConfig record = (GameConfig) parameter.get("record");
        GameConfigExample example = (GameConfigExample) parameter.get("example");
        
        BEGIN();
        UPDATE("game_config");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getAliasName() != null) {
            SET("alias_name = #{record.aliasName,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeKey() != null) {
            SET("type_key = #{record.typeKey,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            SET("code = #{record.code,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeValue() != null) {
            SET("type_value = #{record.typeValue,jdbcType=VARCHAR}");
        }
        
        if (record.getUnit() != null) {
            SET("unit = #{record.unit,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            SET("sort = #{record.sort,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{record.remark,jdbcType=VARCHAR}");
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
        UPDATE("game_config");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("name = #{record.name,jdbcType=VARCHAR}");
        SET("alias_name = #{record.aliasName,jdbcType=VARCHAR}");
        SET("type_key = #{record.typeKey,jdbcType=VARCHAR}");
        SET("code = #{record.code,jdbcType=VARCHAR}");
        SET("type_value = #{record.typeValue,jdbcType=VARCHAR}");
        SET("unit = #{record.unit,jdbcType=VARCHAR}");
        SET("sort = #{record.sort,jdbcType=SMALLINT}");
        SET("status = #{record.status,jdbcType=VARCHAR}");
        SET("remark = #{record.remark,jdbcType=VARCHAR}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        GameConfigExample example = (GameConfigExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(GameConfig record) {
        BEGIN();
        UPDATE("game_config");
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getAliasName() != null) {
            SET("alias_name = #{aliasName,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeKey() != null) {
            SET("type_key = #{typeKey,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getTypeValue() != null) {
            SET("type_value = #{typeValue,jdbcType=VARCHAR}");
        }
        
        if (record.getUnit() != null) {
            SET("unit = #{unit,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            SET("sort = #{sort,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    protected void applyWhere(GameConfigExample example, boolean includeExamplePhrase) {
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