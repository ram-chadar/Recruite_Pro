package com.jbk.exceptions;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jbk.dto.ExceptionResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public HashMap<String, String> invalidInput(MethodArgumentNotValidException ex) {

		HashMap<String, String> error = new HashMap<String, String>();

		List<FieldError> fieldErrors = ex.getFieldErrors();
		for (FieldError fieldError : fieldErrors) {

			error.put(fieldError.getField(), fieldError.getDefaultMessage());

		}
		
		

		return error;
	}

	@ExceptionHandler(ResourceNotFoundException.class)
	public ExceptionResponse resourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest request) {
		
		ExceptionResponse response = new ExceptionResponse();
		response.setMessage(ex.getMessage());
		response.setPath(request.getRequestURL().toString());
		response.setTimestamp(new Timestamp(System.currentTimeMillis()));

		return response;

	}

}
