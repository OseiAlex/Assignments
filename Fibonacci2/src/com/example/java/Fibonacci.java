package com.example.java;

import java.util.Scanner;

public class Fibonacci{

  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number up to which Fibonacci series to print: ");
    int fibonacciNumber = input.nextInt(), firstNumber = 0, secondNumber = 1, nextNumber, i;

    System.out.println("Printing first " + fibonacciNumber + " numbers in Fibonacci Series \n");
    for(i = 0; i < fibonacciNumber; i ++)
    {
      if(i <= 1)
      nextNumber = i;
      else
      {
        nextNumber = firstNumber + secondNumber;
        firstNumber = secondNumber;
        secondNumber = nextNumber;
      }
    System.out.print(nextNumber + "," + "\t");
    }
  }
}