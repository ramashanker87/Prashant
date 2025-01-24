package com.prashant.app;

public class PrashantAgeValidatorException extends Exception{
    public PrashantAgeValidatorException(){
        super("Invalid age provided, please provide age greater than 25");
    }

    public PrashantAgeValidatorException(String message){
        super(message);
    }
}

