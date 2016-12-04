package com.cusbee.config.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseResult<T> extends ResponseEntity<T> {

    public static enum Status {
        SUCCESS, ERROR, WARNING, UNKNOWN
    }
    private String message;
    private T data;

    public ResponseResult(){
        super(HttpStatus.OK);
    }

    public ResponseResult(HttpStatus status, String message, T data){
        super(data, status);
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
