package com.prashant.app;

public class MathOperation {
    public static void main(String[] args) {

        System.out.println(division(1,0));

        int[] array = new int[]{1,2,3,4,5};

        try{
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }



    }
    public static int division(int a, int b){
        int res =0;
        try{
            res = a/b;
            return res;
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return res;
    }


}
