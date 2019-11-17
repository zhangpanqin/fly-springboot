package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 张攀钦
 * @date 2019-10-28-17:02
 * @description
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SysUserServiceTest {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void updateUsers() {
        System.out.println(sysUserService.updateUsers());
    }
}