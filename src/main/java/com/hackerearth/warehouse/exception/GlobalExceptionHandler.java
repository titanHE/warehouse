package com.hackerearth.warehouse.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<?> throwNewIllegalArgumentException(IllegalArgumentException ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails(ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorDetails);
	}

}
