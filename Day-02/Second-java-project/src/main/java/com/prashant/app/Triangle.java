package com.prashant.app;

public class Triangle extends Shape {

    @Override
    public double area(int height, int base){
        System.out.println("Triangle : "+1/2 *base*height);
        return 1/2 *base*height;
    }
}
