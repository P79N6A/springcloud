package com.jk.controller;

import com.jk.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LogController {
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("queryLog2")
    @ResponseBody
    public String queryLog2(){
        String result =  restTemplate.getForObject("http://springcloud-user-reg/queryLog",String.class);
      return result;
    }
    @PostMapping("addLog2")
    @ResponseBody
    public void addLog2(Log log){
         restTemplate.postForObject("http://springcloud-user-reg/addLog",log,Log.class);

    }

    @PostMapping("delete2")
    @ResponseBody
    public void todelete(String logId){
         restTemplate.postForObject("http://springcloud-user-reg/delete",logId,Log.class);

    }
    @PostMapping("deleteuser")
    @ResponseBody
    public String deleteuser(String logId){
        String log = restTemplate.postForObject("http://springcloud-user-reg/delete",logId,String.class);
        return log;
    }
    @PostMapping("queryLogId2")
    @ResponseBody
    public Log queryLogId(String logId){
        Log log2 = restTemplate.postForObject("http://springcloud-user-reg/queryLogId",logId,Log.class);
        return log2;
    }

}
