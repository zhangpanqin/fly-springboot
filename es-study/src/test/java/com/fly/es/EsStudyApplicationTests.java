package com.fly.es;

import com.fly.es.moudle.user.entity.EsProductDO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.query.GetQuery;

@SpringBootTest
public class EsStudyApplicationTests {

    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Test
    public void contextLoads() {
        GetQuery byId = GetQuery.getById("1");
        EsProductDO esProductDO = elasticsearchRestTemplate.queryForObject(byId, EsProductDO.class);
        System.out.println(esProductDO);
    }

}
