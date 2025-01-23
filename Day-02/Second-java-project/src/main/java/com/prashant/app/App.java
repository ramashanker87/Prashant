package com.prashant.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Shape shape = new Shape();
        shape.area(12);
        shape.area(12,12);

        Triangle triangle = new Triangle();
        triangle.area(12,12);
    }
}
