package com.fly.validator;

import com.fly.validator.entity.ErrorInfo;
import com.fly.validator.util.RetUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author 张攀钦
 * @date 2019/11/17-17:37
 * 参数校验
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 统一处理请求参数校验(普通传参)
     *
     * @param e ConstraintViolationException
     * @return FebsResponse
     */
    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity<RetUtil<List<ErrorInfo>>> handleConstraintViolationException(ConstraintViolationException e) {
        StringBuilder message = new StringBuilder();
        Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
        List<ErrorInfo> ret=new ArrayList<>(violations.size());
        for (ConstraintViolation<?> violation : violations) {
            Path path = violation.getPropertyPath();
            ret.add(ErrorInfo.builder().name(path.toString()).message(violation.getMessage()).build());
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(RetUtil.success(ret));
    }
    @ExceptionHandler(BindException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public RetUtil<List<ErrorInfo>> validExceptionHandler(BindException e) {
        StringBuilder message = new StringBuilder();
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        List<ErrorInfo> ret=new ArrayList<>(fieldErrors.size());
        for (FieldError error : fieldErrors) {
            ret.add(ErrorInfo.builder().name(error.getField()).message(error.getDefaultMessage()).build());
        }

        return RetUtil.success(ret);

    }
}