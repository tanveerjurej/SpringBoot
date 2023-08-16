package com.practice.exceptionhandling.error;

import com.practice.exceptionhandling.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler
        extends ResponseEntityExceptionHandler {

//    @ExceptionHandler(AnimalNotFoundException.class)
//    public ResponseEntity<ErrorMessage> animalNotFoundException(AnimalNotFoundException exception, WebRequest request){
//
//        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
//                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
//
//    }

    @ExceptionHandler(AnimalNotFoundException.class)
    public ResponseEntity<Object> animalNotFoundException(AnimalNotFoundException exception){
        Map<String , String> map = new HashMap<>();
        map.put("Sahil" , exception.getLocalizedMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }
}
