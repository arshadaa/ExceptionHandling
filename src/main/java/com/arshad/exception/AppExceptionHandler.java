package com.arshad.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = AppException.class)
	public ResponseEntity<Exception> handleException(AppException appEx){
		
		String exMsg = appEx.getMessage();
		
		ExceptionInfo info = new ExceptionInfo();
		info.setExCode("EX0000788");
		info.setExMsg(exMsg);
		
		return new ResponseEntity(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<Exception> nullPointerException(AppException appEx){
		
		String exMsg = appEx.getMessage();
		
		ExceptionInfo info = new ExceptionInfo();
		info.setExCode("EX0000799");
		info.setExMsg(exMsg);
		
		return new ResponseEntity(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
