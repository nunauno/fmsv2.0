package com.uwu.fmsii.exception;

import org.springframework.http.HttpStatus;

import com.uwu.fmsii.utils.ExceptionCode;

import lombok.Getter;

	@Getter
	public final class BaseException extends RuntimeException {

	    /**
	     *
	     */
	    private static final long serialVersionUID = 1L;

	    private final String errorCode;

	    private final String errorMessage;

	    private final HttpStatus httpStatus;

	    public BaseException(final ExceptionCode errorCode) {
	        this.errorCode = errorCode.getErrorCode();
	        this.errorMessage = errorCode.getErrorMessage();
	        this.httpStatus = errorCode.getHttpStatus();
	    }
	}

