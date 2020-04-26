package com.uwu.fmsii.utils;

import org.springframework.http.HttpStatus;

public enum ExceptionCode {
	ER0001("ER0001", "Not Found", HttpStatus.BAD_REQUEST),
	ER0002("ER0003", "System Error", HttpStatus.INTERNAL_SERVER_ERROR);



	private String errorCode;

	private String errorMessage;

	private HttpStatus httpStatus;

	/**
	 * @return the errorCode
	 **/
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @return the errorMessage
	 **/
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @return the httpStatus
	 **/
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	/**
	 * @param errorCode
	 * @param errorMessage
	 * @param httpStatus
	 **/
	ExceptionCode(String errorCode, String errorMessage, HttpStatus httpStatus) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.httpStatus = httpStatus;
	}


}