package com.uwu.fmsii.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uwu.fmsii.dto.common.ResponseDTO;
import com.uwu.fmsii.exception.BaseException;
import com.uwu.fmsii.utils.ExceptionCode;

@RestController
public class HealthCheckController {

	
	@GetMapping(value = "/health-check")
	public ResponseDTO<String> healthCheck(@RequestParam String name) {
		ResponseDTO<String> response = new ResponseDTO<>();
		if(name.isEmpty() || name == null) {
			throw new BaseException(ExceptionCode.ER0001);
		}
		response.setData("Hello, World" + name);
		response.setMessage("Success");
		response.setStatus("200");
		return response;
	}
}
