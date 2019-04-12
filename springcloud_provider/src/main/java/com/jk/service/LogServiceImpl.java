package com.jk.service;


import com.jk.mapper.LogMapper;
import com.jk.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Service
public class LogServiceImpl implements LogService{
    @Autowired
    private LogMapper logMapper;
    @Override
    public List<Log> queryLog() {
        return logMapper.queryLog();
    }

    /**
     * 查询
     * @return
     */
    @Override
    public List<Log> queryLogAll(Log log) {

        return logMapper.queryLogAll(log);
    }

    /**
     * 新增 及 修改
     * @param log
     */
    @Override
    public void addLog(Log log) {
        Integer logId = log.getLogId();
        if(logId==null){
          logMapper.addLog(log);
        }else{
          logMapper.updateLog(log);
        }

    }

    /**
     * 删除及批删
     * @param ids
     * @return
     */
    @Override
    public Boolean deleteLog(Integer[] ids) {
        int count = logMapper.deleteLog(ids);
        if(count > 0){
            return true;
        }else{
            return false;
        }

    }

    /**
     * 回显
     * @param logId
     * @return
     */
    @Override
    public Log queryLogId(String logId) {

        return logMapper.queryLogId(logId);
    }



}
