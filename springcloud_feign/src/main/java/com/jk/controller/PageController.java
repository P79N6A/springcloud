package com.jk.controller;

import jdk.nashorn.internal.scripts.JD;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    /**
     * 跳转查询页面
     * @return
     */
    @RequestMapping("toShow")
    public String toShow(){
        return "show";
    }

    /**
     * 跳转新增页面
     * @return
     */
    @RequestMapping("toAddLog")
    public String toAddPage(){
        return "addlog";
    }

    /**
     * 跳转回显修改页面
     * @return
     */
    @RequestMapping("toUpdateLog")
    public String toUpdateBook(){
        return "updateLog";
    }


    @RequestMapping("qq")
    public String qq(){
        return "aaaa";
    }
    @RequestMapping("aa")
    public String aa(){
        return "ssss";
    }

}
