package com.example.java;

import java.text.DecimalFormat;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private double results;


    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void Addition(){
        results = firstNumber + secondNumber;
        System.out.println("Addition answer is: " + results);
    }

    public void Multiplication(){
    results = firstNumber * secondNumber;
    System.out.println("Multiplication answer is: " + results);

}

    public void Division(){
        results = firstNumber / secondNumber;
        DecimalFormat threeDecimalForm = new DecimalFormat("#.000");
        System.out.println("Division answer is: " + threeDecimalForm.format(results));

    }
}
