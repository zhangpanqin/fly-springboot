package com.fly.es.moudle.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019/11/21-11:44
 * 测试api
 */

@Document(indexName = "product", type = "video")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EsProductDO implements Serializable {

    private static final long serialVersionUID = 5541472903751872567L;
    /**
     * ID 主键
     */
    @Id
    private String id;

    /**
     * SPU 名字
     */
    @Field
    private String name;
}