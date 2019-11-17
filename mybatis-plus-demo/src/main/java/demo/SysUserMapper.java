package demo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 张攀钦
 * @date 2019-10-22-10:50
 * @description ${description}
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    List<SysUser> selectBy();

    int updateSysUser(@Param("sysUser") SysUser sysUser);

    void updateSysUsers();
}