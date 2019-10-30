package com.fly.validator.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {

    @NotNull(message = "car 的 manufacturer 不能为空")
    private String manufacturer;

    @NotNull(message = "licensePlate 不能为空")
    @Size(min = 2, max = 14, message = "最大14，最小2")
    private String licensePlate;

    @Min(value = 2, message = "最小2")
    private int seatCount;

    public Car(String manufacturer, String licencePlate, int seatCount) {
        this.manufacturer = manufacturer;
        this.licensePlate = licencePlate;
        this.seatCount = seatCount;
    }

}