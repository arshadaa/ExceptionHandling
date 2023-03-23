package com.arshad.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arshad.exception.AppException;

@RestController
public class DemoRestController {

	@GetMapping("/")
	public String getMsg() {
		
		System.out.println("method started...");
		
		String str = "Hello, Good Morning...!!!";
		
		try {
			int i = 10 / 0;
		}catch(Exception e) {
			throw new AppException(e.getMessage());
		}
		
		System.out.println("method ended...");
		
		return str;
	}
}
