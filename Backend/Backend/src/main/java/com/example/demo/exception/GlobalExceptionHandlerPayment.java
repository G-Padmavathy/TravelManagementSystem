package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice//global exception annotation
public class GlobalExceptionHandlerPayment {
	
	@ExceptionHandler(PaymentIDNotFoundException.class)//user defined exception class
	public ResponseEntity<String> exceptionHandler(PaymentIDNotFoundException e)//exception handler--method,response entity -method return type(for global excpetion use this)
	{
		return new ResponseEntity<String>(e.getMessage(),  HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(PaymentDataAlreadyAvailableFoundException.class)//2nd user defined exception class
	public ResponseEntity<String> exceptionHandler(PaymentDataAlreadyAvailableFoundException e)
	{
		return new ResponseEntity<String>(e.getMessage(),  HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)//else bad request
	public ResponseEntity<String> exceptionHandler(Exception e)
{
return new ResponseEntity<String>(e.getMessage(),  HttpStatus.BAD_REQUEST);
	}

}

