package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张攀钦
 * @date 2019-10-28-16:58
 * @description
 */
@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public int updateUsers() {
        int count = 0;
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "测试1-1");
        map.put(2, "测试2-2");
        SysUser sysUser = new SysUser();
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            sysUser.setSysId(integerStringEntry.getKey());
            sysUser.setSysName(integerStringEntry.getValue());
            int i = sysUserMapper.updateSysUser(sysUser);
            count += i;
        }
        return count;
    }
}
