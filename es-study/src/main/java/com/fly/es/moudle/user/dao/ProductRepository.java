package com.fly.es.moudle.user.dao;

import com.fly.es.moudle.user.entity.EsProductDO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 张攀钦
 * @date 2019/11/21-11:47
 * dao 层
 */
public interface ProductRepository extends ElasticsearchRepository<EsProductDO, String> {

}