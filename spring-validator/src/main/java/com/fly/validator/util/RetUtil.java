package com.fly.validator.util;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019-08-21-11:14
 * @description 统一 json 返回数据
 */
@Data
public class RetUtil<T> implements Serializable {

    private static final long serialVersionUID = 5453326120849113004L;

    private static final Integer SUCCESS_CODE = 200;

    private Integer code;

    private String message;

    private T data;

    /**
     * 设置请求成功返回的数据，状态码 已设置
     *
     * @param data 返回的数据
     * @return com.fly.web.springboot.web.common.util.RetUtil<T>
     * @author 张攀钦
     * @date 2019/8/21-11:19
     * @title success
     */

    public static <T> RetUtil<T> success(T data) {
        RetUtil<T> ret = new RetUtil<>();
        ret.setCode(RetUtil.SUCCESS_CODE);
        ret.setData(data);
        return ret;
    }

    /**
     * 设置请求成功返回的数据，状态码已设置成功状态码
     *
     * @return com.fly.web.springboot.web.common.util.RetUtil<T>
     * @author 张攀钦
     * @date 2019/8/21-11:19
     * @title success
     */
    public static <T> RetUtil<T> success() {
        RetUtil<T> ret = new RetUtil<>();
        ret.setCode(RetUtil.SUCCESS_CODE);
        return ret;
    }

    /**
     * 创建RetUtil 没有设置状态码
     *
     * @return com.fly.web.springboot.web.common.util.RetUtil<T>
     * @author 张攀钦
     * @date 2019/8/21-11:20
     * @title build
     */

    public static <T> RetUtil<T> build() {
        RetUtil<T> ret = new RetUtil<>();
        return ret;
    }

    public RetUtil<T> data(T data) {
        this.setData(data);
        return this;
    }

    public RetUtil<T> code(Integer code) {
        this.setCode(code);
        return this;
    }

    public RetUtil message(String message) {
        this.setMessage(message);
        return this;
    }
}
