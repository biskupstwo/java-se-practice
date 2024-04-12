package main.java.com.academy.practice;

import exercises.positivenegativezero.PositiveNegativeZero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int inputNumber = scanner.nextInt();
        PositiveNegativeZero.checkNumber(inputNumber);

    }
}
