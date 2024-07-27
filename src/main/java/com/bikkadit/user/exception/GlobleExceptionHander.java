package com.bikkadit.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bikkadit.user.payload.ApiResponce;

@RestControllerAdvice
public class GlobleExceptionHander {

	@ExceptionHandler
	public ResponseEntity<ApiResponce> handlerResourceNotFoundException(ResourceNotFoundException ex) {

		String message = ex.getMessage();

		ApiResponce responce = ApiResponce.builder().message(message).success(true).status(HttpStatus.NOT_FOUND)
				.build();
		return new ResponseEntity<ApiResponce>(responce, HttpStatus.NOT_FOUND);

	}
}
