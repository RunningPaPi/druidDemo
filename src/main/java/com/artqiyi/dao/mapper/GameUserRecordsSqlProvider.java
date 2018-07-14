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

import com.artqiyi.dao.model.GameUserRecords;
import com.artqiyi.dao.model.GameUserRecordsExample.Criteria;
import com.artqiyi.dao.model.GameUserRecordsExample.Criterion;
import com.artqiyi.dao.model.GameUserRecordsExample;
import java.util.List;
import java.util.Map;

public class GameUserRecordsSqlProvider {

    public String countByExample(GameUserRecordsExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("game_user_records");
        applyWhere(example, false);
        return SQL();
    }

    public String deleteByExample(GameUserRecordsExample example) {
        BEGIN();
        DELETE_FROM("game_user_records");
        applyWhere(example, false);
        return SQL();
    }

    public String insertSelective(GameUserRecords record) {
        BEGIN();
        INSERT_INTO("game_user_records");
        
        if (record.getGameFieldId() != null) {
            VALUES("game_field_id", "#{gameFieldId,jdbcType=BIGINT}");
        }
        
        if (record.getGameNo() != null) {
            VALUES("game_no", "#{gameNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            VALUES("user_id", "#{userId,jdbcType=BIGINT}");
        }
        
        if (record.getNickName() != null) {
            VALUES("nick_name", "#{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadUrl() != null) {
            VALUES("head_url", "#{headUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getIsRobot() != null) {
            VALUES("is_robot", "#{isRobot,jdbcType=BIT}");
        }
        
        if (record.getIsOut() != null) {
            VALUES("is_out", "#{isOut,jdbcType=BIT}");
        }
        
        if (record.getGameRound() != null) {
            VALUES("game_round", "#{gameRound,jdbcType=SMALLINT}");
        }
        
        if (record.getScore() != null) {
            VALUES("score", "#{score,jdbcType=INTEGER}");
        }
        
        if (record.getNote() != null) {
            VALUES("note", "#{note,jdbcType=VARCHAR}");
        }
        
        if (record.getRank() != null) {
            VALUES("rank", "#{rank,jdbcType=INTEGER}");
        }
        
        if (record.getCreateTime() != null) {
            VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdateTime() != null) {
            VALUES("update_time", "#{updateTime,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    public String selectByExample(GameUserRecordsExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("game_field_id");
        SELECT("game_no");
        SELECT("user_id");
        SELECT("nick_name");
        SELECT("head_url");
        SELECT("is_robot");
        SELECT("is_out");
        SELECT("game_round");
        SELECT("score");
        SELECT("note");
        SELECT("rank");
        SELECT("create_time");
        SELECT("update_time");
        FROM("game_user_records");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        GameUserRecords record = (GameUserRecords) parameter.get("record");
        GameUserRecordsExample example = (GameUserRecordsExample) parameter.get("example");
        
        BEGIN();
        UPDATE("game_user_records");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getGameFieldId() != null) {
            SET("game_field_id = #{record.gameFieldId,jdbcType=BIGINT}");
        }
        
        if (record.getGameNo() != null) {
            SET("game_no = #{record.gameNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{record.userId,jdbcType=BIGINT}");
        }
        
        if (record.getNickName() != null) {
            SET("nick_name = #{record.nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadUrl() != null) {
            SET("head_url = #{record.headUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getIsRobot() != null) {
            SET("is_robot = #{record.isRobot,jdbcType=BIT}");
        }
        
        if (record.getIsOut() != null) {
            SET("is_out = #{record.isOut,jdbcType=BIT}");
        }
        
        if (record.getGameRound() != null) {
            SET("game_round = #{record.gameRound,jdbcType=SMALLINT}");
        }
        
        if (record.getScore() != null) {
            SET("score = #{record.score,jdbcType=INTEGER}");
        }
        
        if (record.getNote() != null) {
            SET("note = #{record.note,jdbcType=VARCHAR}");
        }
        
        if (record.getRank() != null) {
            SET("rank = #{record.rank,jdbcType=INTEGER}");
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
        UPDATE("game_user_records");
        
        SET("id = #{record.id,jdbcType=BIGINT}");
        SET("game_field_id = #{record.gameFieldId,jdbcType=BIGINT}");
        SET("game_no = #{record.gameNo,jdbcType=VARCHAR}");
        SET("user_id = #{record.userId,jdbcType=BIGINT}");
        SET("nick_name = #{record.nickName,jdbcType=VARCHAR}");
        SET("head_url = #{record.headUrl,jdbcType=VARCHAR}");
        SET("is_robot = #{record.isRobot,jdbcType=BIT}");
        SET("is_out = #{record.isOut,jdbcType=BIT}");
        SET("game_round = #{record.gameRound,jdbcType=SMALLINT}");
        SET("score = #{record.score,jdbcType=INTEGER}");
        SET("note = #{record.note,jdbcType=VARCHAR}");
        SET("rank = #{record.rank,jdbcType=INTEGER}");
        SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        SET("update_time = #{record.updateTime,jdbcType=TIMESTAMP}");
        
        GameUserRecordsExample example = (GameUserRecordsExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    public String updateByPrimaryKeySelective(GameUserRecords record) {
        BEGIN();
        UPDATE("game_user_records");
        
        if (record.getGameFieldId() != null) {
            SET("game_field_id = #{gameFieldId,jdbcType=BIGINT}");
        }
        
        if (record.getGameNo() != null) {
            SET("game_no = #{gameNo,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            SET("user_id = #{userId,jdbcType=BIGINT}");
        }
        
        if (record.getNickName() != null) {
            SET("nick_name = #{nickName,jdbcType=VARCHAR}");
        }
        
        if (record.getHeadUrl() != null) {
            SET("head_url = #{headUrl,jdbcType=VARCHAR}");
        }
        
        if (record.getIsRobot() != null) {
            SET("is_robot = #{isRobot,jdbcType=BIT}");
        }
        
        if (record.getIsOut() != null) {
            SET("is_out = #{isOut,jdbcType=BIT}");
        }
        
        if (record.getGameRound() != null) {
            SET("game_round = #{gameRound,jdbcType=SMALLINT}");
        }
        
        if (record.getScore() != null) {
            SET("score = #{score,jdbcType=INTEGER}");
        }
        
        if (record.getNote() != null) {
            SET("note = #{note,jdbcType=VARCHAR}");
        }
        
        if (record.getRank() != null) {
            SET("rank = #{rank,jdbcType=INTEGER}");
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

    protected void applyWhere(GameUserRecordsExample example, boolean includeExamplePhrase) {
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