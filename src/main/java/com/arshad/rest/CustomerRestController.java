package com.arshad.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arshad.exception.AppException;

@RestController
public class CustomerRestController {

	@GetMapping("/customer")
	public String getCustomerInfo() {
		
		System.out.println("method started...");
		
		String str = "Davi, USA, 20 years";
		
		try {
			String s = null;
			s.toUpperCase();
		}catch(Exception e) {
			throw new AppException(e.getMessage());
		}
		
		System.out.println("method ended...");
		
		return str;
	}
}
