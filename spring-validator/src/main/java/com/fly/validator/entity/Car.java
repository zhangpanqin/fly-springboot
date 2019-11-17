package com.fly.validator.entity;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019/11/17-17:40
 * 实体类
 */

@Data
public class Car implements Serializable {

    private static final long serialVersionUID = 1971285167877603810L;
    @NotNull(message = "car 的 manufacturer 不能为空")
    private String manufacturer;

    @NotNull(message = "licensePlate 不能为空")
    @Size(min = 2, max = 14, message = "最大14，最小2")
    private String licensePlate;

    @Min(value = 2, message = "最小2")
    private int seatCount;

}