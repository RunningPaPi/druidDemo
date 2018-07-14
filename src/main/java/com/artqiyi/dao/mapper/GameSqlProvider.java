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

import com.artqiyi.dao.model.Game;
import com.artqiyi.dao.model.GameExample.Criteria;
import com.artqiyi.dao.model.GameExample.Criterion;
import com.artqiyi.dao.model.GameExample;
import java.util.List;
import java.util.Map;

public class GameSqlProvider {

    public String countByExample(GameExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("game");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(GameExample example) {
        BEGIN();
        DELETE_FROM("game");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(Game record) {
        BEGIN();
        INSERT_INTO("game");
        
        if (record.getGameKey() != null) {
            VALUES("game_key", "#{gameKey,jdbcType=VARCHAR}");
        }
        
        if (record.getGameName() != null) {
            VALUES("game_name", "#{gameName,jdbcType=VARCHAR}");
        }
        
        if (record.getIconUrl() != null) {
            VALUES("icon_url", "#{iconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            VALUES("sort", "#{sort,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=SMALLINT}");
        }
        
        if (record.getDeleted() != null) {
            VALUES("deleted", "#{deleted,jdbcType=BIT}");
        }
        
        if (record.getRemark() != null) {
            VALUES("remark", "#{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getExtentstr1() != null) {
            VALUES("extentStr1", "#{extentstr1,jdbcType=VARCHAR}");
        }
        
        if (record.getExtentstr2() != null) {
            VALUES("extentStr2", "#{extentstr2,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateId() != null) {
            VALUES("create_id", "#{createId,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatorId() != null) {
            VALUES("updator_id", "#{updatorId,jdbcType=BIGINT}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(GameExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("game_key");
        SELECT("game_name");
        SELECT("icon_url");
        SELECT("sort");
        SELECT("status");
        SELECT("deleted");
        SELECT("remark");
        SELECT("extentStr1");
        SELECT("extentStr2");
        SELECT("create_id");
        SELECT("create_time");
        SELECT("updator_id");
        SELECT("update_time");
        FROM("game");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Game record = (Game) parameter.get("record");
        GameExample example = (GameExample) parameter.get("example");
        
        BEGIN();
        UPDATE("game");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getGameKey() != null) {
            SET("game_key = #{record.gameKey,jdbcType=VARCHAR}");
        }
        
        if (record.getGameName() != null) {
            SET("game_name = #{record.gameName,jdbcType=VARCHAR}");
        }
        
        if (record.getIconUrl() != null) {
            SET("icon_url = #{record.iconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            SET("sort = #{record.sort,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{record.status,jdbcType=SMALLINT}");
        }
        
        if (record.getDeleted() != null) {
            SET("deleted = #{record.deleted,jdbcType=BIT}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getExtentstr1() != null) {
            SET("extentStr1 = #{record.extentstr1,jdbcType=VARCHAR}");
        }
        
        if (record.getExtentstr2() != null) {
            SET("extentStr2 = #{record.extentstr2,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateId() != null) {
            SET("create_id = #{record.createId,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatorId() != null) {
            SET("updator_id = #{record.updatorId,jdbcType=BIGINT}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("game");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("game_key = #{record.gameKey,jdbcType=VARCHAR}");
        SET("game_name = #{record.gameName,jdbcType=VARCHAR}");
        SET("icon_url = #{record.iconUrl,jdbcType=VARCHAR}");
        SET("sort = #{record.sort,jdbcType=SMALLINT}");
        SET("status = #{record.status,jdbcType=SMALLINT}");
        SET("deleted = #{record.deleted,jdbcType=BIT}");
        SET("remark = #{record.remark,jdbcType=VARCHAR}");
        SET("extentStr1 = #{record.extentstr1,jdbcType=VARCHAR}");
        SET("extentStr2 = #{record.extentstr2,jdbcType=VARCHAR}");
        SET("create_id = #{record.createId,jdbcType=BIGINT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("updator_id = #{record.updatorId,jdbcType=BIGINT}");
        SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        GameExample example = (GameExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(Game record) {
        BEGIN();
        UPDATE("game");
        
        if (record.getGameKey() != null) {
            SET("game_key = #{gameKey,jdbcType=VARCHAR}");
        }
        
        if (record.getGameName() != null) {
            SET("game_name = #{gameName,jdbcType=VARCHAR}");
        }
        
        if (record.getIconUrl() != null) {
            SET("icon_url = #{iconUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getSort() != null) {
            SET("sort = #{sort,jdbcType=SMALLINT}");
        }
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=SMALLINT}");
        }
        
        if (record.getDeleted() != null) {
            SET("deleted = #{deleted,jdbcType=BIT}");
        }
        
        if (record.getRemark() != null) {
            SET("remark = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getExtentstr1() != null) {
            SET("extentStr1 = #{extentstr1,jdbcType=VARCHAR}");
        }
        
        if (record.getExtentstr2() != null) {
            SET("extentStr2 = #{extentstr2,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateId() != null) {
            SET("create_id = #{createId,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatorId() != null) {
            SET("updator_id = #{updatorId,jdbcType=BIGINT}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(GameExample example, boolean includeExamplePhrase) {
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