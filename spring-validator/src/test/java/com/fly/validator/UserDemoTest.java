package com.fly.validator;

import com.fly.validator.entity.UserDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Validator;

/**
 * @author 张攀钦
 * @date 2019-10-24-17:51
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDemoTest {
    @Autowired
    private Validator validator;
    @Test
    public void run3() {
        UserDemo userDemo = new UserDemo();
        DataBinder dataBinder = new DataBinder(validator);
        dataBinder.validate(userDemo);
        BindingResult bindingResult = dataBinder.getBindingResult();
        System.out.println(bindingResult.getModel());
    }
}
