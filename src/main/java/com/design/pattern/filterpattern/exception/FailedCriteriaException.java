package com.design.pattern.filterpattern.exception;

public class FailedCriteriaException extends RuntimeException{

    private String message;

    public FailedCriteriaException(String exceptionMessage){
        this.message = exceptionMessage;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
