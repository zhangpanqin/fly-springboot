package com.fly.es;

import com.fly.es.common.util.es.FieldAnalyzer;
import com.fly.es.moudle.user.dao.ProductRepository;
import com.fly.es.moudle.user.entity.EsProductDO;
import org.elasticsearch.index.query.MatchPhraseQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.query.GetQuery;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

@SpringBootTest
public class EsStudyApplicationTests {

    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Autowired
    ProductRepository productRepository;


    @Test
    public void test3(){
        MatchPhraseQueryBuilder matchPhraseQueryBuilder = new MatchPhraseQueryBuilder("name","张攀钦");
        Iterable<EsProductDO> search = productRepository.search(matchPhraseQueryBuilder);
        search.forEach(item->System.out.println(item));
    }
    @Test
    public void run4(){

    }


    @Test
    public void test2(){
        System.out.println(productRepository.findById("20"));
    }


    @Test
    public void contextLoads() {
        EsProductDO esProductDO1 = new EsProductDO();
        esProductDO1.setAge(20);
        esProductDO1.setCountry("北京");
        esProductDO1.setId(22L);
        esProductDO1.setBirthday("2020-06-11");
        esProductDO1.setName("张攀钦");
        esProductDO1.setRemark("好好学习,天天向上2");
        EsProductDO save = productRepository.save(esProductDO1);
        System.out.println(save);
    }

}
