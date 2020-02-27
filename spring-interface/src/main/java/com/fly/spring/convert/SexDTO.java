package com.fly.spring.convert;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author 张攀钦
 * @date 2020-02-27-17:51
 * @description 性别
 */
@Getter
@ToString
public enum SexDTO implements BaseEnum{

    BOY(1),Girl(2);

    private Integer code;
    SexDTO(Integer code){
        this.code=code;
    }
}
