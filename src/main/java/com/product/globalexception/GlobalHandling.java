package com.product.globalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.product.customexception.NameNotValidException;

@RestController

public class GlobalHandling {
	
	@ExceptionHandler(NameNotValidException.class)
	
	public ResponseEntity<Object> nameExcep() {
		return new ResponseEntity<>("namenotvalid",HttpStatus.BAD_REQUEST);
	}

}
