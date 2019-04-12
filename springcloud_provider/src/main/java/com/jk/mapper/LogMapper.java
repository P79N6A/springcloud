package com.jk.mapper;

import com.jk.model.Log;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface LogMapper {
    @Select("select * from log")
    List<Log> queryLog();

    /**
     * 查询
     * @return
     */

    List<Log> queryLogAll(@Param("log")Log log);

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
    int deleteLog(Integer[] ids);

    /**
     * 回显
     * @param logId
     * @return
     */
    @Select("select * from log where logId = #{logId}")
    Log queryLogId(String logId);

    /**
     * 修改
     * @param log
     */
    @Update("update log set logName=#{logName},logType=#{logType},logInfo=#{logInfo} where logId=#{logId}")
    void updateLog(Log log);


}
