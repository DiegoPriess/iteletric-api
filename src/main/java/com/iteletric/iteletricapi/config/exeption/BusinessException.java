package com.iteletric.iteletricapi.config.exeption;

public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}