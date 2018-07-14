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

import com.artqiyi.dao.model.GamePk;
import com.artqiyi.dao.model.GamePkExample.Criteria;
import com.artqiyi.dao.model.GamePkExample.Criterion;
import com.artqiyi.dao.model.GamePkExample;
import java.util.List;
import java.util.Map;

public class GamePkSqlProvider {

    public String countByExample(GamePkExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("game_pk");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(GamePkExample example) {
        BEGIN();
        DELETE_FROM("game_pk");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(GamePk record) {
        BEGIN();
        INSERT_INTO("game_pk");
        
        if (record.getGameFiledId() != null) {
            VALUES("game_filed_id", "#{gameFiledId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getRivalUserId() != null) {
            VALUES("rival_user_id", "#{rivalUserId,jdbcType=BIGINT}");
        }
        
        if (record.getScore() != null) {
            VALUES("score", "#{score,jdbcType=INTEGER}");
        }
        
        if (record.getRivalScore() != null) {
            VALUES("rival_score", "#{rivalScore,jdbcType=INTEGER}");
        }
        
        if (record.getLevelCount() != null) {
            VALUES("level_count", "#{levelCount,jdbcType=SMALLINT}");
        }
        
        if (record.getRecoverTimes() != null) {
            VALUES("recover_times", "#{recoverTimes,jdbcType=TINYINT}");
        }
        
        if (record.getPassThroughTimes() != null) {
            VALUES("pass_through_times", "#{passThroughTimes,jdbcType=SMALLINT}");
        }
        
        if (record.getIsWin() != null) {
            VALUES("is_win", "#{isWin,jdbcType=BIT}");
        }
        
        if (record.getIsFinish() != null) {
            VALUES("is_finish", "#{isFinish,jdbcType=BIT}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRivalUpdateTime() != null) {
            VALUES("rival_update_time", "#{rivalUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(GamePkExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("game_filed_id");
        SELECT("user_id");
        SELECT("rival_user_id");
        SELECT("score");
        SELECT("rival_score");
        SELECT("level_count");
        SELECT("recover_times");
        SELECT("pass_through_times");
        SELECT("is_win");
        SELECT("is_finish");
        SELECT("create_time");
        SELECT("update_time");
        SELECT("rival_update_time");
        FROM("game_pk");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GamePk record = (GamePk) parameter.get("record");
        GamePkExample example = (GamePkExample) parameter.get("example");
        
        BEGIN();
        UPDATE("game_pk");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getGameFiledId() != null) {
            SET("game_filed_id = #{record.gameFiledId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getRivalUserId() != null) {
            SET("rival_user_id = #{record.rivalUserId,jdbcType=BIGINT}");
        }
        
        if (record.getScore() != null) {
            SET("score = #{record.score,jdbcType=INTEGER}");
        }
        
        if (record.getRivalScore() != null) {
            SET("rival_score = #{record.rivalScore,jdbcType=INTEGER}");
        }
        
        if (record.getLevelCount() != null) {
            SET("level_count = #{record.levelCount,jdbcType=SMALLINT}");
        }
        
        if (record.getRecoverTimes() != null) {
            SET("recover_times = #{record.recoverTimes,jdbcType=TINYINT}");
        }
        
        if (record.getPassThroughTimes() != null) {
            SET("pass_through_times = #{record.passThroughTimes,jdbcType=SMALLINT}");
        }
        
        if (record.getIsWin() != null) {
            SET("is_win = #{record.isWin,jdbcType=BIT}");
        }
        
        if (record.getIsFinish() != null) {
            SET("is_finish = #{record.isFinish,jdbcType=BIT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRivalUpdateTime() != null) {
            SET("rival_update_time = #{record.rivalUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("game_pk");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("game_filed_id = #{record.gameFiledId,jdbcType=INTEGER}");
        SET("user_id = #{record.userId,jdbcType=BIGINT}");
        SET("rival_user_id = #{record.rivalUserId,jdbcType=BIGINT}");
        SET("score = #{record.score,jdbcType=INTEGER}");
        SET("rival_score = #{record.rivalScore,jdbcType=INTEGER}");
        SET("level_count = #{record.levelCount,jdbcType=SMALLINT}");
        SET("recover_times = #{record.recoverTimes,jdbcType=TINYINT}");
        SET("pass_through_times = #{record.passThroughTimes,jdbcType=SMALLINT}");
        SET("is_win = #{record.isWin,jdbcType=BIT}");
        SET("is_finish = #{record.isFinish,jdbcType=BIT}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        SET("rival_update_time = #{record.rivalUpdateTime,jdbcType=TIMESTAMP}");
        
        GamePkExample example = (GamePkExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(GamePk record) {
        BEGIN();
        UPDATE("game_pk");
        
        if (record.getGameFiledId() != null) {
            SET("game_filed_id = #{gameFiledId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getRivalUserId() != null) {
            SET("rival_user_id = #{rivalUserId,jdbcType=BIGINT}");
        }
        
        if (record.getScore() != null) {
            SET("score = #{score,jdbcType=INTEGER}");
        }
        
        if (record.getRivalScore() != null) {
            SET("rival_score = #{rivalScore,jdbcType=INTEGER}");
        }
        
        if (record.getLevelCount() != null) {
            SET("level_count = #{levelCount,jdbcType=SMALLINT}");
        }
        
        if (record.getRecoverTimes() != null) {
            SET("recover_times = #{recoverTimes,jdbcType=TINYINT}");
        }
        
        if (record.getPassThroughTimes() != null) {
            SET("pass_through_times = #{passThroughTimes,jdbcType=SMALLINT}");
        }
        
        if (record.getIsWin() != null) {
            SET("is_win = #{isWin,jdbcType=BIT}");
        }
        
        if (record.getIsFinish() != null) {
            SET("is_finish = #{isFinish,jdbcType=BIT}");
        }
        
        if (record.getCreateTime() != null) {
            SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            SET("update_time = #{updateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getRivalUpdateTime() != null) {
            SET("rival_update_time = #{rivalUpdateTime,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    protected void applyWhere(GamePkExample example, boolean includeExamplePhrase) {
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