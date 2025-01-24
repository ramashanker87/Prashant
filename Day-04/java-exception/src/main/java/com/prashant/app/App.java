package com.prashant.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int age =30;
        try{
            checkAge(age);
        }catch (PrashantAgeValidatorException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally{
            System.out.println("resources cleanup done");
        }


    }

    public static void checkAge (int age)throws PrashantAgeValidatorException{
        if(age<25){
            throw new PrashantAgeValidatorException();
        }else{
            System.out.println("Valid age");
        }
    }
}
