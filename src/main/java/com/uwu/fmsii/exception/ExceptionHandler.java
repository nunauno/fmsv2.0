package com.uwu.fmsii.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler  extends ResponseEntityExceptionHandler {

   @org.springframework.web.bind.annotation.ExceptionHandler(BaseException.class)
    public ResponseEntity<ServiceResult> springHandler(BaseException exception) {
        return new ResponseEntity<>(
                ServiceResult.builder().message(exception.getErrorMessage())
                        .status(exception.getHttpStatus())
                        .errorCode(exception.getErrorCode()).build(),
                exception.getHttpStatus());
    }

   @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ResponseEntity<ServiceResult> springHandler(Exception exception) {
        return new ResponseEntity<>(
                ServiceResult.builder().message(exception.getMessage()).build(),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
