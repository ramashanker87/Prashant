package com.prashant.app;

public class AgeValidatorException extends Exception{
    public AgeValidatorException(){
        super("Invalid age provided, please provide age greater than 25");
    }

    public AgeValidatorException(String message){
        super(message);
    }
}

