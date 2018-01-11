package com.example.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelect an option");
        System.out.println("\n1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Division");

        System.out.print("\nChoose an option: ");
        int choice = input.nextInt();

        System.out.print("Enter first number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter second number: ");
        double secondNumber = input.nextDouble();

        switch (choice){
            case 1:
                add(firstNumber, secondNumber);
                break;
            case 2:
                multiply(firstNumber, secondNumber);
                break;
            case 3:
                divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

    }
    private static void add(double firstNumber, double secondNumber){
        System.out.println("\nAddition");
        double results = firstNumber + secondNumber;
        System.out.println("Your answer is: " + results);
    }
    private static void multiply(double firstNumber, double secondNumber){
        System.out.println("\nMultiplication");
        double results = firstNumber * secondNumber;
        System.out.println("Your answer is: " + results);
    }
    private static void divide(double firstNumber, double secondNumber){
        System.out.println("\nDivision");
        double results = firstNumber / secondNumber;
        DecimalFormat threeDecimalForm = new DecimalFormat("#.000");
        System.out.println("Your answer is: " + threeDecimalForm.format(results));
    }
}
