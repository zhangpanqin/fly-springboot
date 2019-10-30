package com.fly.validator;

import com.fly.validator.entity.Car;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class CarTest {

    private static Validator validator;

    @Before
    public void setUpValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void manufacturerIsNull() {
        Car car = new Car(null, "DD-AB-123", 1);

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        for (ConstraintViolation<Car> constraintViolation : constraintViolations) {
            System.out.println(constraintViolation.getMessage());
        }
    }
}