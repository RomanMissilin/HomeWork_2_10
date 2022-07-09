package com.example.homework_2_10.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class FirstNameCorrectnessException extends RuntimeException{

    public FirstNameCorrectnessException() {
    }

    public FirstNameCorrectnessException(String message) {
        super(message);
    }

    public FirstNameCorrectnessException(String message, Throwable cause) {
        super(message, cause);
    }

    public FirstNameCorrectnessException(Throwable cause) {
        super(cause);
    }

    public FirstNameCorrectnessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}