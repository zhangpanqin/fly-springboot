package com.fly.swagger2.common.util;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2018-12-22-10:20
 * 服务统一返回json
 */
@Data
public class ResponseUtil<T> implements Serializable {

    private static final long serialVersionUID = -2986502900753534575L;

    private static final Integer SUCCESS_CODE = HttpStatus.OK.value();

    /**
     * 请求失败的状态码
     */
    private Integer code;

    /**
     * 错误的提示信息
     */
    private String message;

    /**
     * 放回数据统一放到这里
     */
    private T data;

    public static <T> ResponseUtil<T> ok() {
        ResponseUtil<T> ret = new ResponseUtil<>();
        ret.setCode(SUCCESS_CODE);
        return ret;
    }

    public static <T> ResponseUtil<T> ok(T data) {
        ResponseUtil<T> ret = new ResponseUtil<>();
        ret.setData(data);
        ret.setCode(SUCCESS_CODE);
        return ret;
    }

    public ResponseUtil<T> data(T data) {
        this.setData(data);
        return this;
    }

    public static <T> ResponseUtil<T> fail() {
        ResponseUtil<T> ret = new ResponseUtil<>();
        return ret;
    }

    public ResponseUtil<T> code(Integer code) {
        this.setCode(code);
        return this;
    }

    public ResponseUtil message(String message) {
        this.setMessage(message);
        return this;
    }
}
