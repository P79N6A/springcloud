package com.jk.model;

import java.io.Serializable;

public class Log implements Serializable {
    private static final long serialVersionUID = -6502782114978426282L;
    private Integer logId;
    private String  logName;
    private String  logType;
    private String  logInfo;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }

    @Override
    public String toString() {
        return "Log{" +
                "logId=" + logId +
                ", logName='" + logName + '\'' +
                ", logType='" + logType + '\'' +
                ", logInfo='" + logInfo + '\'' +
                '}';
    }
}
