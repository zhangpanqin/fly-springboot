package com.fly.mapstruct;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author 张攀钦
 * @date 2020-03-31-17:22
 */
@Data
public class Student implements Serializable {
    private static final long serialVersionUID = 4462429395057198997L;

    private String studentName;
    private Integer age;
    private LocalDateTime birthday;
}
