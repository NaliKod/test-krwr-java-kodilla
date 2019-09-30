package com.kodilla;

public class Calculator {

    private int A;
    private int B;

    public Calculator(){
        this.A = A;
        this.B = B;
    }

    public void sum(int A,int B){
        int sum= A+B;
        System.out.println("Result is: "+sum);
    }
    public void sub(int A,int B){
        int sub = A-B;
        System.out.println("Result is: "+sub);
    }

    public static void main(String[] args) {
        Calculator calculator =  new Calculator();
        Calculator calculator1 =  new Calculator();

        calculator.sum(15,7);
        calculator1.sub(25,5);

    }

}
