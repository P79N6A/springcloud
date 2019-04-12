package com.jk.service;


import com.jk.model.Log;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("springcloud-user") //指定生产者的实例名称
public interface LogService {



    @GetMapping("select/{id}")
    public String select(@PathVariable Integer id);

    /**
     * 查询
     * @return
     */
    @GetMapping("queryLogAll")
    List<Log> queryAll(Log log);

    /**
     * 新增
     * @param log
     */
    @GetMapping("addLogAll")
    void addLog(Log log);

    /**
     * 删除及批删
     * @param ids
     * @return
     */
    @GetMapping("deleteLog")
    Boolean deleteLog(Integer[] ids);

    /**
     * 回显
     * @param logId
     * @return
     */
    @GetMapping("queryLogId")
    Log queryId(String logId);
}
