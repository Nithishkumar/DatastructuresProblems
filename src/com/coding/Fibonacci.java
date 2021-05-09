package com.coding;

public class Fibonacci {

    public int fibonacciIterative(Integer input){
        int firstPrevious=1;
        int secondPrevious=1;
        if(input==1){
            return 1;
        }else if(input==2) {
            return 1;
        }else{
            for(int i=2;i<input;i++){
               int second=secondPrevious;
               secondPrevious=firstPrevious+second;
               firstPrevious=second;
            }
        }
        return secondPrevious;

    }

    public int fibonacciRecursive(Integer input){
        if(input==1){
            return 0;
        }else if(input ==2){
            return 1;
        }
        return fibonacciRecursive(input-1)+fibonacciRecursive(input-2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        System.out.println(fibonacci.fibonacciIterative(5));
        System.out.println(fibonacci.fibonacciRecursive(5));
    }

}
