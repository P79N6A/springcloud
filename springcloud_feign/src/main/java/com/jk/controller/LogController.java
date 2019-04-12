package com.jk.controller;

import com.jk.model.Log;
import com.jk.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LogController {
    @Autowired
    private LogService logService;

    @GetMapping("select")
    public String select(){

        String result = logService.select(123);

        return result;
    }

    /**
     * 查询
     * @return
     */
    @GetMapping("queryAll")
    public List<Log> queryAll(Log log){

        return  logService.queryAll(log);
    }

    /**
     * 新增
     * @param log
     */
    @RequestMapping("addLog")
    public void addLog(Log log){

        logService.addLog(log);
    }

    /**
     * 删除及批删
     * @param ids
     * @return
     */
    @RequestMapping("deleteLog")
    public Boolean deleteLog(Integer[] ids){

        return logService.deleteLog(ids);
    }

    /**
     * 回显
     * @param logId
     * @return
     */
    @RequestMapping("queryId")
    public Log queryId(String logId){

        return logService.queryId(logId);
    }

}
