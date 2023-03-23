package com.arshad.exception;

public class AppException extends RuntimeException {

	public AppException() {
		
	}
	
	public AppException(String msg) {
		super(msg);
	}
}
