package mybatis;

import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    Role getRole(@Param("id") Long id);

    Role findRole(@Param("roleName") String roleName);

    int deleteRole(@Param("id") Long id);

    int insertRole(@Param("role") Role role);
}