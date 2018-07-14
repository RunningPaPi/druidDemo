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

import com.artqiyi.dao.model.GameRecords;
import com.artqiyi.dao.model.GameRecordsExample.Criteria;
import com.artqiyi.dao.model.GameRecordsExample.Criterion;
import com.artqiyi.dao.model.GameRecordsExample;
import java.util.List;
import java.util.Map;

public class GameRecordsSqlProvider {

    public String countByExample(GameRecordsExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("game_records");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(GameRecordsExample example) {
        BEGIN();
        DELETE_FROM("game_records");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(GameRecords record) {
        BEGIN();
        INSERT_INTO("game_records");
        
        if (record.getGameNo() != null) {
            VALUES("game_no", "#{gameNo,jdbcType=VARCHAR}");
        }
        
        if (record.getGameFiledId() != null) {
            VALUES("game_filed_id", "#{gameFiledId,jdbcType=BIGINT}");
        }
        
        if (record.getGameFiledName() != null) {
            VALUES("game_filed_name", "#{gameFiledName,jdbcType=VARCHAR}");
        }
        
        if (record.getContestNum() != null) {
            VALUES("contest_num", "#{contestNum,jdbcType=INTEGER}");
        }
        
        if (record.getRealContestNum() != null) {
            VALUES("real_contest_num", "#{realContestNum,jdbcType=INTEGER}");
        }
        
        if (record.getRobotContestNum() != null) {
            VALUES("robot_contest_num", "#{robotContestNum,jdbcType=INTEGER}");
        }
        
        if (record.getCurrentContestNum() != null) {
            VALUES("current_contest_num", "#{currentContestNum,jdbcType=INTEGER}");
        }
        
        if (record.getCurrentRound() != null) {
            VALUES("current_round", "#{currentRound,jdbcType=SMALLINT}");
        }
        
        if (record.getGameStatus() != null) {
            VALUES("game_status", "#{gameStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getStartTime() != null) {
            VALUES("start_time", "#{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            VALUES("end_time", "#{endTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(GameRecordsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("game_no");
        SELECT("game_filed_id");
        SELECT("game_filed_name");
        SELECT("contest_num");
        SELECT("real_contest_num");
        SELECT("robot_contest_num");
        SELECT("current_contest_num");
        SELECT("current_round");
        SELECT("game_status");
        SELECT("start_time");
        SELECT("end_time");
        SELECT("create_time");
        SELECT("update_time");
        FROM("game_records");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GameRecords record = (GameRecords) parameter.get("record");
        GameRecordsExample example = (GameRecordsExample) parameter.get("example");
        
        BEGIN();
        UPDATE("game_records");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getGameNo() != null) {
            SET("game_no = #{record.gameNo,jdbcType=VARCHAR}");
        }
        
        if (record.getGameFiledId() != null) {
            SET("game_filed_id = #{record.gameFiledId,jdbcType=BIGINT}");
        }
        
        if (record.getGameFiledName() != null) {
            SET("game_filed_name = #{record.gameFiledName,jdbcType=VARCHAR}");
        }
        
        if (record.getContestNum() != null) {
            SET("contest_num = #{record.contestNum,jdbcType=INTEGER}");
        }
        
        if (record.getRealContestNum() != null) {
            SET("real_contest_num = #{record.realContestNum,jdbcType=INTEGER}");
        }
        
        if (record.getRobotContestNum() != null) {
            SET("robot_contest_num = #{record.robotContestNum,jdbcType=INTEGER}");
        }
        
        if (record.getCurrentContestNum() != null) {
            SET("current_contest_num = #{record.currentContestNum,jdbcType=INTEGER}");
        }
        
        if (record.getCurrentRound() != null) {
            SET("current_round = #{record.currentRound,jdbcType=SMALLINT}");
        }
        
        if (record.getGameStatus() != null) {
            SET("game_status = #{record.gameStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getStartTime() != null) {
            SET("start_time = #{record.startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
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
        UPDATE("game_records");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("game_no = #{record.gameNo,jdbcType=VARCHAR}");
        SET("game_filed_id = #{record.gameFiledId,jdbcType=BIGINT}");
        SET("game_filed_name = #{record.gameFiledName,jdbcType=VARCHAR}");
        SET("contest_num = #{record.contestNum,jdbcType=INTEGER}");
        SET("real_contest_num = #{record.realContestNum,jdbcType=INTEGER}");
        SET("robot_contest_num = #{record.robotContestNum,jdbcType=INTEGER}");
        SET("current_contest_num = #{record.currentContestNum,jdbcType=INTEGER}");
        SET("current_round = #{record.currentRound,jdbcType=SMALLINT}");
        SET("game_status = #{record.gameStatus,jdbcType=SMALLINT}");
        SET("start_time = #{record.startTime,jdbcType=TIMESTAMP}");
        SET("end_time = #{record.endTime,jdbcType=TIMESTAMP}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        GameRecordsExample example = (GameRecordsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(GameRecords record) {
        BEGIN();
        UPDATE("game_records");
        
        if (record.getGameNo() != null) {
            SET("game_no = #{gameNo,jdbcType=VARCHAR}");
        }
        
        if (record.getGameFiledId() != null) {
            SET("game_filed_id = #{gameFiledId,jdbcType=BIGINT}");
        }
        
        if (record.getGameFiledName() != null) {
            SET("game_filed_name = #{gameFiledName,jdbcType=VARCHAR}");
        }
        
        if (record.getContestNum() != null) {
            SET("contest_num = #{contestNum,jdbcType=INTEGER}");
        }
        
        if (record.getRealContestNum() != null) {
            SET("real_contest_num = #{realContestNum,jdbcType=INTEGER}");
        }
        
        if (record.getRobotContestNum() != null) {
            SET("robot_contest_num = #{robotContestNum,jdbcType=INTEGER}");
        }
        
        if (record.getCurrentContestNum() != null) {
            SET("current_contest_num = #{currentContestNum,jdbcType=INTEGER}");
        }
        
        if (record.getCurrentRound() != null) {
            SET("current_round = #{currentRound,jdbcType=SMALLINT}");
        }
        
        if (record.getGameStatus() != null) {
            SET("game_status = #{gameStatus,jdbcType=SMALLINT}");
        }
        
        if (record.getStartTime() != null) {
            SET("start_time = #{startTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndTime() != null) {
            SET("end_time = #{endTime,jdbcType=TIMESTAMP}");
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

    protected void applyWhere(GameRecordsExample example, boolean includeExamplePhrase) {
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