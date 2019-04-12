package com.jk.controller;

import com.jk.model.Log;
import com.jk.service.LogService;
import jdk.nashorn.internal.scripts.JD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class LogController {
     @Autowired
    private LogService logService;
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private MongoTemplate mongoTemplate;





    /**
     * 查询
     * @return
     */
    @RequestMapping("queryLogAll")
    public List<Log> queryLogAll(Log log){
      /*    List<Log> user =new ArrayList<>();
        Boolean user1 = redisTemplate.hasKey("user");
        if (user1) {
            user = (List<Log>) redisTemplate.opsForValue().get("user");
        }else{
            user=logService.queryLogAll(log);
        }
        redisTemplate.opsForValue().set("user",user,1 , TimeUnit.MINUTES);
        return user;*/
         return logService.queryLogAll(log);
    }

    /**
     * 新增
     * @param log
     */
   @RequestMapping("addLogAll")
    public void addLog(@RequestBody Log log){

       logService.addLog(log);
   }

    /**
     * 删除及批删
     * @param ids
     * @return
     */
    @RequestMapping("deleteLog")
    public Boolean deleteLog(@RequestBody Integer[] ids){

        return logService.deleteLog(ids);
   }

    /**
     * 回显
     * @param logId
     * @return
     */
    @RequestMapping("queryLogId")
    public Log queryLogId(@RequestBody String logId){

     return logService.queryLogId(logId);
    }

}
