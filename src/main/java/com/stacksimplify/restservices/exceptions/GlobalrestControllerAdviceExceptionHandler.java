package com.stacksimplify.restservices.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice - można odkomentować ale należy zakomentować //@ControllerAdvice w CustomGlobalExceptionHandler
public class GlobalrestControllerAdviceExceptionHandler {

	@ExceptionHandler(UserNameNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public CustomErrorDetails usernameNotFond(UserNameNotFoundException ex) {
		
		return new CustomErrorDetails(new Date(),
									"From @RestControllerAdvice NOT FOUND",
									ex.getMessage());
		
	}
}
