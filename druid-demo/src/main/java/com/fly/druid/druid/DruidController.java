package com.fly.druid.druid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 张攀钦
 * @date 2019-09-12-11:21
 * @description 测试查询数据
 */
@RestController
public class DruidController {

    @Autowired
    private DepotDao depotDao;

    @GetMapping("/api/depots")
    public List<Map<String, Object>> listDepots() {
        return depotDao.allDepots(1);
    }

    @GetMapping("/api/test")
    public Map test() throws InterruptedException {
        int a = 0;
        depotDao.allDepots(1);
        Map map = new HashMap();
        map.put("key", "value3");
        return map;
    }
}
