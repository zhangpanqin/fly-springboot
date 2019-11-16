package com.fly.exception.common.handle.exception;

import com.fly.exception.common.util.RetUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.util.WebUtils;

/**
 * @author 张攀钦
 * @date 2019-11-16-13:23
 * @description 处理 controller 抛出的异常
 */
@Component
@RestControllerAdvice
public class HandleActionException extends ResponseEntityExceptionHandler {
    public HandleActionException(){

    }

    @Override
    protected ResponseEntity handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        if (HttpStatus.INTERNAL_SERVER_ERROR.equals(status)) {
            request.setAttribute(WebUtils.ERROR_EXCEPTION_ATTRIBUTE, ex, WebRequest.SCOPE_REQUEST);
        }
        final ResponseEntity<RetUtil> retUtilResponseEntity = new ResponseEntity<>(RetUtil.build().code(5000), headers, status);
        return retUtilResponseEntity;
    }

    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<RetUtil> handleRunTimeException(){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(RetUtil.build().code(5000));
    }
}
