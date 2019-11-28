package com.fly.es.moudle.user.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 张攀钦
 * @date 2019-11-21-11:49
 * @description ProductRepository 实现类
 */
@Repository
public class ProductRepositoryImpl {
    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

}
