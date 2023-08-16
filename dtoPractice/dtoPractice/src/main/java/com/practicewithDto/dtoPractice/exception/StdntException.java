package com.practicewithDto.dtoPractice.exception;

import org.springframework.http.HttpStatus;

public class StdntException extends Exception{

    private String ErrorCode;
    private String message;
    private HttpStatus httpStatus;

    public StdntException() {
    }

    public StdntException(String errorCode, String message, HttpStatus httpStatus) {
        this.ErrorCode = errorCode;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public String getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(String errorCode) {
        ErrorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
