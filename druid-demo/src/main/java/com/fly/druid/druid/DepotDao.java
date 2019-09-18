package com.fly.druid.druid;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author 张攀钦
 * @date 2019-09-12-12:00
 * @description
 */
@Mapper
public interface DepotDao {

    List<Map<String,Object>>allDepots();
}
