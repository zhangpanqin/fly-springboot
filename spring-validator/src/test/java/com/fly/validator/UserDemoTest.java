package com.fly.validator;

import com.fly.validator.entity.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;

import java.util.List;

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
        Car car = new Car(null, "DD-AB-123", 1);
        Errors errors = new BeanPropertyBindingResult(car, "person");
        validator.validate(car, errors);
        List<FieldError> fieldError = errors.getFieldErrors();
        fieldError.forEach(item -> System.out.println(item.getDefaultMessage()));
    }
}
