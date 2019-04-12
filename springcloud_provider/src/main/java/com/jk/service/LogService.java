package com.jk.service;

import com.jk.model.Log;

import java.util.List;

public interface LogService {

    List<Log> queryLog();

    /**
     * 查询
     * @return
     */
    List<Log> queryLogAll(Log log);

    /**
     * 新增
     * @param log
     */
    void addLog(Log log);

    /**
     * 删除及批删
     * @param ids
     * @return
     */
    Boolean deleteLog(Integer[] ids);

    /**
     * 回显
     * @param logId
     * @return
     */
    Log queryLogId(String logId);



}
