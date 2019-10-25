package com.fly.test;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2018-12-22-10:20
 * 服务统一返回参数
 */
@Data
public class ResponseDataUtil<T> implements Serializable {

    private static final long serialVersionUID = -2986502900753534575L;


    private static final Integer SUCCESS_CODE = 200;

    /**
     * @author 张攀钦
     * @date 2018/12/22-10:22
     * 请求的状态码,200 默认成功
     */
    private Integer code;

    /**
     * @author 张攀钦
     * @date 2018/12/22-10:23
     * 错误的提示信息
     */
    private String message;

    /**
     * @author 张攀钦
     * @date 2018/12/22-10:23
     * 放回数据统一放到这里
     */
    private T data;

    public static <T> ResponseDataUtil<T> ok() {
        ResponseDataUtil<T> ret = new ResponseDataUtil<>();
        ret.setCode(SUCCESS_CODE);
        return ret;
    }

    public static <T> ResponseDataUtil<T> ok(T data) {
        ResponseDataUtil<T> ret = new ResponseDataUtil<>();
        ret.setData(data);
        ret.setCode(SUCCESS_CODE);
        return ret;
    }

    public ResponseDataUtil<T> data(T data) {
        this.setData(data);
        return this;
    }

    public static <T> ResponseDataUtil<T> fail() {
        ResponseDataUtil<T> ret = new ResponseDataUtil<>();
        ret.setCode(500);
        return ret;
    }

    public ResponseDataUtil<T> code(Integer code) {
        this.setCode(code);
        return this;
    }

    public ResponseDataUtil message(String message) {
        this.setMessage(message);
        return this;
    }
}
