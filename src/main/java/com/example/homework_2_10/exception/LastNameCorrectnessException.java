package com.example.homework_2_10.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class LastNameCorrectnessException extends RuntimeException{

    public LastNameCorrectnessException() {
    }

    public LastNameCorrectnessException(String message) {
        super(message);
    }

    public LastNameCorrectnessException(String message, Throwable cause) {
        super(message, cause);
    }

    public LastNameCorrectnessException(Throwable cause) {
        super(cause);
    }

    public LastNameCorrectnessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}