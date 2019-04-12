package com.jk.service;

import com.jk.model.Log;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //添加注解@Compent 将熔断器类注入spring容器中
public class LogServiceHystrix implements LogService{
    @Override
    public String select(Integer id) {
        return "网络异常";
    }

    @Override
    public List<Log> queryAll(Log log) {
        return null;
    }

    @Override
    public void addLog(Log log) {

    }

    @Override
    public Boolean deleteLog(Integer[] ids) {
        return null;
    }

    @Override
    public Log queryId(String logId) {
        return null;
    }
}
