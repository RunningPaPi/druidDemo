package com.artqiyi.dao.model;

import java.util.Date;

public class GamePk {
    private Long id;

    private Integer gameFiledId;

    private Long userId;

    private Long rivalUserId;

    private Integer score;

    private Integer rivalScore;

    private Short levelCount;

    private Byte recoverTimes;

    private Short passThroughTimes;

    private Boolean isWin;

    private Boolean isFinish;

    private Date createTime;

    private Date updateTime;

    private Date rivalUpdateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getGameFiledId() {
        return gameFiledId;
    }

    public void setGameFiledId(Integer gameFiledId) {
        this.gameFiledId = gameFiledId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRivalUserId() {
        return rivalUserId;
    }

    public void setRivalUserId(Long rivalUserId) {
        this.rivalUserId = rivalUserId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getRivalScore() {
        return rivalScore;
    }

    public void setRivalScore(Integer rivalScore) {
        this.rivalScore = rivalScore;
    }

    public Short getLevelCount() {
        return levelCount;
    }

    public void setLevelCount(Short levelCount) {
        this.levelCount = levelCount;
    }

    public Byte getRecoverTimes() {
        return recoverTimes;
    }

    public void setRecoverTimes(Byte recoverTimes) {
        this.recoverTimes = recoverTimes;
    }

    public Short getPassThroughTimes() {
        return passThroughTimes;
    }

    public void setPassThroughTimes(Short passThroughTimes) {
        this.passThroughTimes = passThroughTimes;
    }

    public Boolean getIsWin() {
        return isWin;
    }

    public void setIsWin(Boolean isWin) {
        this.isWin = isWin;
    }

    public Boolean getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Boolean isFinish) {
        this.isFinish = isFinish;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getRivalUpdateTime() {
        return rivalUpdateTime;
    }

    public void setRivalUpdateTime(Date rivalUpdateTime) {
        this.rivalUpdateTime = rivalUpdateTime;
    }
}