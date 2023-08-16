package com.practicewithDto.dtoPractice.exception;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GloblaExceptionHandler {

    @ExceptionHandler({StdntException.class})
    public ResponseEntity<StdntException> stdntException(String ErrorCode, String message, HttpStatus httpStatus){
         return new ResponseEntity<>(ErrorCode, message, HttpStatus.NOT_FOUND);
    }
}
