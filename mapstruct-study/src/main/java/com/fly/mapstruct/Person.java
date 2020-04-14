package com.fly.mapstruct;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2020-03-31-17:22
 */
@Data
public class Person implements Serializable {
    private static final long serialVersionUID = 4462429395057198997L;

    private String name;
    private Integer age;
    private String birthday;
}
