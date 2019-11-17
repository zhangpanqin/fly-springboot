package demo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019-10-22-11:07
 * @description 用户信息
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 7426034384525760560L;

    private Integer id;
    private String name;
    private String age;
}
