package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelect an option");
        System.out.println("\n1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Division");

        System.out.print("Choose an option: ");
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
    public static void add(){
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNum;
        System.out.println("\nAddition");
        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        input.close();
        thirdNum = firstNumber + secondNumber;
        System.out.println("Your answer is: " + thirdNum);
    }
    public static void multiply(){
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNum;
        System.out.println("\nMultiplication");
        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        input.close();
        thirdNum = firstNumber * secondNumber;
        System.out.println("Your answer is: " + thirdNum);
    }
    public static void divide(){
        Scanner input = new Scanner(System.in);
        float firstNumber;
        float secondNumber;
        float thirdNum;
        System.out.println("\nDivision");
        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        input.close();
        thirdNum = firstNumber / secondNumber;
        System.out.println("Your answer is: " + thirdNum);
    }
}
