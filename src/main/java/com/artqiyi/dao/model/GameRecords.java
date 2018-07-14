package com.artqiyi.dao.model;

import java.util.Date;

public class GameRecords {
    private Long id;

    private String gameNo;

    private Long gameFiledId;

    private String gameFiledName;

    private Integer contestNum;

    private Integer realContestNum;

    private Integer robotContestNum;

    private Integer currentContestNum;

    private Short currentRound;

    private Short gameStatus;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameNo() {
        return gameNo;
    }

    public void setGameNo(String gameNo) {
        this.gameNo = gameNo == null ? null : gameNo.trim();
    }

    public Long getGameFiledId() {
        return gameFiledId;
    }

    public void setGameFiledId(Long gameFiledId) {
        this.gameFiledId = gameFiledId;
    }

    public String getGameFiledName() {
        return gameFiledName;
    }

    public void setGameFiledName(String gameFiledName) {
        this.gameFiledName = gameFiledName == null ? null : gameFiledName.trim();
    }

    public Integer getContestNum() {
        return contestNum;
    }

    public void setContestNum(Integer contestNum) {
        this.contestNum = contestNum;
    }

    public Integer getRealContestNum() {
        return realContestNum;
    }

    public void setRealContestNum(Integer realContestNum) {
        this.realContestNum = realContestNum;
    }

    public Integer getRobotContestNum() {
        return robotContestNum;
    }

    public void setRobotContestNum(Integer robotContestNum) {
        this.robotContestNum = robotContestNum;
    }

    public Integer getCurrentContestNum() {
        return currentContestNum;
    }

    public void setCurrentContestNum(Integer currentContestNum) {
        this.currentContestNum = currentContestNum;
    }

    public Short getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(Short currentRound) {
        this.currentRound = currentRound;
    }

    public Short getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(Short gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
}