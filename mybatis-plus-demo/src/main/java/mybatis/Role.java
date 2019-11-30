package mybatis;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2019/11/28-21:30
 * 角色名称
 */

@Data
public class Role implements Serializable {
    private static final long serialVersionUID = -499662796634411552L;
    private Long id;
    private String roleName;
    private String note;

}