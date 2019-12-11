package com.fly.druid.druid;

import com.fly.druid.BusinessLog;
import com.fly.druid.BusinessLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 张攀钦
 * @date 2019-09-12-11:21
 * @description 测试查询数据
 */
@RestController
public class DruidController {

    @Autowired
    private BusinessLogMapper businessLogMapper;


    @PostMapping(value = "business-log")
    public BusinessLog insertBusinessLog(@RequestBody BusinessLog businessLog) {
        businessLog.setId(UUID.randomUUID().toString());
        int insert = businessLogMapper.insert(businessLog);
        return businessLog;
    }

    @GetMapping(value = "business-log")
    public BusinessLog selectBusinessLog() {
        BusinessLog businessLog = businessLogMapper.selectById("22");
        return businessLog;
    }
}
