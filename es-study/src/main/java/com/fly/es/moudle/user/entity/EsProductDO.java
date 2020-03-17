package com.fly.es.moudle.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author 张攀钦
 * @date 2019/11/21-11:44
 * 测试api
 */

@Document(indexName = "product", shards = 1)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EsProductDO implements Serializable {

    private static final long serialVersionUID = 5541472903751872567L;
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 名字
     */
    @Field(type = FieldType.Keyword)
    private String name;

    /**
     * 国家
     */
    @Field(type = FieldType.Keyword)
    private String country;

    /**
     * 年龄
     */
    @Field(type = FieldType.Integer)
    private Integer age;

    /**
     * 生日
     */
    @Field(type = FieldType.Date,format = DateFormat.date)
    private String birthday;

    /**
     * 介绍
     */
    @Field(type = FieldType.Text, analyzer = "ik_smart")
    private String remark;

    /**
     * 介绍2
     */
    @Field(type = FieldType.Text, analyzer = "ik_smart")
    private String remark2;
}