package com.prashant.app;

public class Rectangle extends Shape{

    @Override
    public double area(int length, int breadth){
        System.out.println(length*breadth);
        return length*breadth;
    }
}
