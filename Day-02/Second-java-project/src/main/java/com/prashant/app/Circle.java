package com.prashant.app;

public class Circle extends Shape {

    @Override
    public double area(int radius){
        double area = 22/7 *radius*radius;
        return area;
    }
}
