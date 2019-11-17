package com.fly.validator.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019-11-17-17:23
 * @description 校验异常信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorInfo implements Serializable {
    private static final long serialVersionUID = -1118055076878239104L;
    private String name;
    private String message;
}
