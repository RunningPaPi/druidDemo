package com.artqiyi.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GamePkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GamePkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGameFiledIdIsNull() {
            addCriterion("game_filed_id is null");
            return (Criteria) this;
        }

        public Criteria andGameFiledIdIsNotNull() {
            addCriterion("game_filed_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameFiledIdEqualTo(Integer value) {
            addCriterion("game_filed_id =", value, "gameFiledId");
            return (Criteria) this;
        }

        public Criteria andGameFiledIdNotEqualTo(Integer value) {
            addCriterion("game_filed_id <>", value, "gameFiledId");
            return (Criteria) this;
        }

        public Criteria andGameFiledIdGreaterThan(Integer value) {
            addCriterion("game_filed_id >", value, "gameFiledId");
            return (Criteria) this;
        }

        public Criteria andGameFiledIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_filed_id >=", value, "gameFiledId");
            return (Criteria) this;
        }

        public Criteria andGameFiledIdLessThan(Integer value) {
            addCriterion("game_filed_id <", value, "gameFiledId");
            return (Criteria) this;
        }

        public Criteria andGameFiledIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_filed_id <=", value, "gameFiledId");
            return (Criteria) this;
        }

        public Criteria andGameFiledIdIn(List<Integer> values) {
            addCriterion("game_filed_id in", values, "gameFiledId");
            return (Criteria) this;
        }

        public Criteria andGameFiledIdNotIn(List<Integer> values) {
            addCriterion("game_filed_id not in", values, "gameFiledId");
            return (Criteria) this;
        }

        public Criteria andGameFiledIdBetween(Integer value1, Integer value2) {
            addCriterion("game_filed_id between", value1, value2, "gameFiledId");
            return (Criteria) this;
        }

        public Criteria andGameFiledIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_filed_id not between", value1, value2, "gameFiledId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRivalUserIdIsNull() {
            addCriterion("rival_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRivalUserIdIsNotNull() {
            addCriterion("rival_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRivalUserIdEqualTo(Long value) {
            addCriterion("rival_user_id =", value, "rivalUserId");
            return (Criteria) this;
        }

        public Criteria andRivalUserIdNotEqualTo(Long value) {
            addCriterion("rival_user_id <>", value, "rivalUserId");
            return (Criteria) this;
        }

        public Criteria andRivalUserIdGreaterThan(Long value) {
            addCriterion("rival_user_id >", value, "rivalUserId");
            return (Criteria) this;
        }

        public Criteria andRivalUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("rival_user_id >=", value, "rivalUserId");
            return (Criteria) this;
        }

        public Criteria andRivalUserIdLessThan(Long value) {
            addCriterion("rival_user_id <", value, "rivalUserId");
            return (Criteria) this;
        }

        public Criteria andRivalUserIdLessThanOrEqualTo(Long value) {
            addCriterion("rival_user_id <=", value, "rivalUserId");
            return (Criteria) this;
        }

        public Criteria andRivalUserIdIn(List<Long> values) {
            addCriterion("rival_user_id in", values, "rivalUserId");
            return (Criteria) this;
        }

        public Criteria andRivalUserIdNotIn(List<Long> values) {
            addCriterion("rival_user_id not in", values, "rivalUserId");
            return (Criteria) this;
        }

        public Criteria andRivalUserIdBetween(Long value1, Long value2) {
            addCriterion("rival_user_id between", value1, value2, "rivalUserId");
            return (Criteria) this;
        }

        public Criteria andRivalUserIdNotBetween(Long value1, Long value2) {
            addCriterion("rival_user_id not between", value1, value2, "rivalUserId");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andRivalScoreIsNull() {
            addCriterion("rival_score is null");
            return (Criteria) this;
        }

        public Criteria andRivalScoreIsNotNull() {
            addCriterion("rival_score is not null");
            return (Criteria) this;
        }

        public Criteria andRivalScoreEqualTo(Integer value) {
            addCriterion("rival_score =", value, "rivalScore");
            return (Criteria) this;
        }

        public Criteria andRivalScoreNotEqualTo(Integer value) {
            addCriterion("rival_score <>", value, "rivalScore");
            return (Criteria) this;
        }

        public Criteria andRivalScoreGreaterThan(Integer value) {
            addCriterion("rival_score >", value, "rivalScore");
            return (Criteria) this;
        }

        public Criteria andRivalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("rival_score >=", value, "rivalScore");
            return (Criteria) this;
        }

        public Criteria andRivalScoreLessThan(Integer value) {
            addCriterion("rival_score <", value, "rivalScore");
            return (Criteria) this;
        }

        public Criteria andRivalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("rival_score <=", value, "rivalScore");
            return (Criteria) this;
        }

        public Criteria andRivalScoreIn(List<Integer> values) {
            addCriterion("rival_score in", values, "rivalScore");
            return (Criteria) this;
        }

        public Criteria andRivalScoreNotIn(List<Integer> values) {
            addCriterion("rival_score not in", values, "rivalScore");
            return (Criteria) this;
        }

        public Criteria andRivalScoreBetween(Integer value1, Integer value2) {
            addCriterion("rival_score between", value1, value2, "rivalScore");
            return (Criteria) this;
        }

        public Criteria andRivalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("rival_score not between", value1, value2, "rivalScore");
            return (Criteria) this;
        }

        public Criteria andLevelCountIsNull() {
            addCriterion("level_count is null");
            return (Criteria) this;
        }

        public Criteria andLevelCountIsNotNull() {
            addCriterion("level_count is not null");
            return (Criteria) this;
        }

        public Criteria andLevelCountEqualTo(Short value) {
            addCriterion("level_count =", value, "levelCount");
            return (Criteria) this;
        }

        public Criteria andLevelCountNotEqualTo(Short value) {
            addCriterion("level_count <>", value, "levelCount");
            return (Criteria) this;
        }

        public Criteria andLevelCountGreaterThan(Short value) {
            addCriterion("level_count >", value, "levelCount");
            return (Criteria) this;
        }

        public Criteria andLevelCountGreaterThanOrEqualTo(Short value) {
            addCriterion("level_count >=", value, "levelCount");
            return (Criteria) this;
        }

        public Criteria andLevelCountLessThan(Short value) {
            addCriterion("level_count <", value, "levelCount");
            return (Criteria) this;
        }

        public Criteria andLevelCountLessThanOrEqualTo(Short value) {
            addCriterion("level_count <=", value, "levelCount");
            return (Criteria) this;
        }

        public Criteria andLevelCountIn(List<Short> values) {
            addCriterion("level_count in", values, "levelCount");
            return (Criteria) this;
        }

        public Criteria andLevelCountNotIn(List<Short> values) {
            addCriterion("level_count not in", values, "levelCount");
            return (Criteria) this;
        }

        public Criteria andLevelCountBetween(Short value1, Short value2) {
            addCriterion("level_count between", value1, value2, "levelCount");
            return (Criteria) this;
        }

        public Criteria andLevelCountNotBetween(Short value1, Short value2) {
            addCriterion("level_count not between", value1, value2, "levelCount");
            return (Criteria) this;
        }

        public Criteria andRecoverTimesIsNull() {
            addCriterion("recover_times is null");
            return (Criteria) this;
        }

        public Criteria andRecoverTimesIsNotNull() {
            addCriterion("recover_times is not null");
            return (Criteria) this;
        }

        public Criteria andRecoverTimesEqualTo(Byte value) {
            addCriterion("recover_times =", value, "recoverTimes");
            return (Criteria) this;
        }

        public Criteria andRecoverTimesNotEqualTo(Byte value) {
            addCriterion("recover_times <>", value, "recoverTimes");
            return (Criteria) this;
        }

        public Criteria andRecoverTimesGreaterThan(Byte value) {
            addCriterion("recover_times >", value, "recoverTimes");
            return (Criteria) this;
        }

        public Criteria andRecoverTimesGreaterThanOrEqualTo(Byte value) {
            addCriterion("recover_times >=", value, "recoverTimes");
            return (Criteria) this;
        }

        public Criteria andRecoverTimesLessThan(Byte value) {
            addCriterion("recover_times <", value, "recoverTimes");
            return (Criteria) this;
        }

        public Criteria andRecoverTimesLessThanOrEqualTo(Byte value) {
            addCriterion("recover_times <=", value, "recoverTimes");
            return (Criteria) this;
        }

        public Criteria andRecoverTimesIn(List<Byte> values) {
            addCriterion("recover_times in", values, "recoverTimes");
            return (Criteria) this;
        }

        public Criteria andRecoverTimesNotIn(List<Byte> values) {
            addCriterion("recover_times not in", values, "recoverTimes");
            return (Criteria) this;
        }

        public Criteria andRecoverTimesBetween(Byte value1, Byte value2) {
            addCriterion("recover_times between", value1, value2, "recoverTimes");
            return (Criteria) this;
        }

        public Criteria andRecoverTimesNotBetween(Byte value1, Byte value2) {
            addCriterion("recover_times not between", value1, value2, "recoverTimes");
            return (Criteria) this;
        }

        public Criteria andPassThroughTimesIsNull() {
            addCriterion("pass_through_times is null");
            return (Criteria) this;
        }

        public Criteria andPassThroughTimesIsNotNull() {
            addCriterion("pass_through_times is not null");
            return (Criteria) this;
        }

        public Criteria andPassThroughTimesEqualTo(Short value) {
            addCriterion("pass_through_times =", value, "passThroughTimes");
            return (Criteria) this;
        }

        public Criteria andPassThroughTimesNotEqualTo(Short value) {
            addCriterion("pass_through_times <>", value, "passThroughTimes");
            return (Criteria) this;
        }

        public Criteria andPassThroughTimesGreaterThan(Short value) {
            addCriterion("pass_through_times >", value, "passThroughTimes");
            return (Criteria) this;
        }

        public Criteria andPassThroughTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("pass_through_times >=", value, "passThroughTimes");
            return (Criteria) this;
        }

        public Criteria andPassThroughTimesLessThan(Short value) {
            addCriterion("pass_through_times <", value, "passThroughTimes");
            return (Criteria) this;
        }

        public Criteria andPassThroughTimesLessThanOrEqualTo(Short value) {
            addCriterion("pass_through_times <=", value, "passThroughTimes");
            return (Criteria) this;
        }

        public Criteria andPassThroughTimesIn(List<Short> values) {
            addCriterion("pass_through_times in", values, "passThroughTimes");
            return (Criteria) this;
        }

        public Criteria andPassThroughTimesNotIn(List<Short> values) {
            addCriterion("pass_through_times not in", values, "passThroughTimes");
            return (Criteria) this;
        }

        public Criteria andPassThroughTimesBetween(Short value1, Short value2) {
            addCriterion("pass_through_times between", value1, value2, "passThroughTimes");
            return (Criteria) this;
        }

        public Criteria andPassThroughTimesNotBetween(Short value1, Short value2) {
            addCriterion("pass_through_times not between", value1, value2, "passThroughTimes");
            return (Criteria) this;
        }

        public Criteria andIsWinIsNull() {
            addCriterion("is_win is null");
            return (Criteria) this;
        }

        public Criteria andIsWinIsNotNull() {
            addCriterion("is_win is not null");
            return (Criteria) this;
        }

        public Criteria andIsWinEqualTo(Boolean value) {
            addCriterion("is_win =", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinNotEqualTo(Boolean value) {
            addCriterion("is_win <>", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinGreaterThan(Boolean value) {
            addCriterion("is_win >", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_win >=", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinLessThan(Boolean value) {
            addCriterion("is_win <", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinLessThanOrEqualTo(Boolean value) {
            addCriterion("is_win <=", value, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinIn(List<Boolean> values) {
            addCriterion("is_win in", values, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinNotIn(List<Boolean> values) {
            addCriterion("is_win not in", values, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinBetween(Boolean value1, Boolean value2) {
            addCriterion("is_win between", value1, value2, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsWinNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_win not between", value1, value2, "isWin");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNull() {
            addCriterion("is_finish is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNotNull() {
            addCriterion("is_finish is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishEqualTo(Boolean value) {
            addCriterion("is_finish =", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotEqualTo(Boolean value) {
            addCriterion("is_finish <>", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThan(Boolean value) {
            addCriterion("is_finish >", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_finish >=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThan(Boolean value) {
            addCriterion("is_finish <", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThanOrEqualTo(Boolean value) {
            addCriterion("is_finish <=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishIn(List<Boolean> values) {
            addCriterion("is_finish in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotIn(List<Boolean> values) {
            addCriterion("is_finish not in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishBetween(Boolean value1, Boolean value2) {
            addCriterion("is_finish between", value1, value2, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_finish not between", value1, value2, "isFinish");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRivalUpdateTimeIsNull() {
            addCriterion("rival_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRivalUpdateTimeIsNotNull() {
            addCriterion("rival_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRivalUpdateTimeEqualTo(Date value) {
            addCriterion("rival_update_time =", value, "rivalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRivalUpdateTimeNotEqualTo(Date value) {
            addCriterion("rival_update_time <>", value, "rivalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRivalUpdateTimeGreaterThan(Date value) {
            addCriterion("rival_update_time >", value, "rivalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRivalUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rival_update_time >=", value, "rivalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRivalUpdateTimeLessThan(Date value) {
            addCriterion("rival_update_time <", value, "rivalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRivalUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("rival_update_time <=", value, "rivalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRivalUpdateTimeIn(List<Date> values) {
            addCriterion("rival_update_time in", values, "rivalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRivalUpdateTimeNotIn(List<Date> values) {
            addCriterion("rival_update_time not in", values, "rivalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRivalUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("rival_update_time between", value1, value2, "rivalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRivalUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("rival_update_time not between", value1, value2, "rivalUpdateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}