package com.uwu.fmsii.exception;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Builder;
import lombok.Data;

@JsonInclude(Include.NON_NULL)
@Data
@Builder
public class ServiceResult
{
    private String message;

    private HttpStatus status;

    private String errorCode;
}