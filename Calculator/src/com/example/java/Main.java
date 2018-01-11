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
        System.out.println();

        switch (choice){
            case 1:
                add();
                break;
            case 2:
                multiply();
                break;
            case 3:
                divide();
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

    }
    private static void add(){
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        System.out.println("\nAddition");
        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        input.close();
        int thirdNum = firstNumber + secondNumber;
        System.out.println("Your answer is: " + thirdNum);
    }
    private static void multiply(){
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        System.out.println("\nMultiplication");
        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        input.close();
        int thirdNum = firstNumber * secondNumber;
        System.out.println("Your answer is: " + thirdNum);
    }
    private static void divide(){
        Scanner input = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        System.out.println("\nDivision");
        System.out.print("Enter first number: ");
        firstNumber = input.nextDouble();
        System.out.print("Enter second number: ");
        secondNumber = input.nextDouble();
        input.close();
        double thirdNum = firstNumber / secondNumber;
        double i = thirdNum;
        DecimalFormat threeDForm = new DecimalFormat("#.000");
        System.out.println("Your answer is: " + threeDForm.format(i));
    }
}
