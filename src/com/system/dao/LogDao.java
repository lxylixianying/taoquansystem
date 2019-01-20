package com.system.dao;

import com.system.entity.SqlLog;

import java.util.List;

public interface LogDao {
    // 获取日志总数
    public Integer getLogNum();

    // 插入日志
    public void insertLog(SqlLog log);

    // 更新日志
    public void updateLog(SqlLog log);

    // 获取未完成任务日志
    public List<SqlLog> getUnFinishWork();

    // 获取正在执行的任务的数量
    public Integer getRunningWorkNum();

    // 获取ID值最小并且处于等待状态的任务
    public SqlLog getWaitWork();
}
