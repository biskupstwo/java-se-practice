package main.java.com.academy.practice;

import exercises.AreaCalculator.AreaCalculator;
import exercises.BarkingDog.BarkingDog;
import exercises.DecimalComparator.DecimalComparator;
import exercises.EqualSumChecker.EqualSumChecker;
import exercises.EqualityPrinter.EqualityPrinter;
import exercises.LeapYearCalculator.LeapYearCalculator;
import exercises.MinutesToYearsAndDaysCalculator.MinutesToYearsAndDaysCalculator;
import exercises.TeenNumberChecker.TeenNumberChecker;
import exercises.megabytesconverter.MegaBytesConverter;
import exercises.positivenegativezero.PositiveNegativeZero;
import exercises.speedconverter.SpeedConverter;

import java.util.Scanner;

public class Main {

    public static void checkNumberExercise(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int inputNumber = scanner.nextInt();
        PositiveNegativeZero.checkNumber(inputNumber);
    }

    public static void speedConverterExercise(){
        // toMilesPerHour
        System.out.println(SpeedConverter.toMilesPerHour(1.5));
        System.out.println(SpeedConverter.toMilesPerHour(10.25));
        System.out.println(SpeedConverter.toMilesPerHour(-5.6));
        System.out.println(SpeedConverter.toMilesPerHour(25.42));
        System.out.println(SpeedConverter.toMilesPerHour(75.114));
        // printConversion
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);
    }

    public static void megaBytesConverterExercise(){
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        MegaBytesConverter.printMegaBytesAndKiloBytes(4096);
    }
    public static void barkingDogExercise(){
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
    }

    public static void leapYearCalculatorExercise(){
        System.out.println(LeapYearCalculator.isLeapYear(-1600));
        System.out.println(LeapYearCalculator.isLeapYear(1600));
        System.out.println(LeapYearCalculator.isLeapYear(2017));
        System.out.println(LeapYearCalculator.isLeapYear(2000));
        System.out.println(LeapYearCalculator.isLeapYear(2012));
        System.out.println(LeapYearCalculator.isLeapYear(2300));
    }

    public static void decimalComparatorExercise(){
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123,3.123));
    }

    public static void equalSumCheckerExercise(){
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));
    }

    public static void teenNumberCheckerExercise(){
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));
        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));
        System.out.println(TeenNumberChecker.isTeen(19));
        System.out.println(TeenNumberChecker.isTeen(20));
    }

    public static void areaCalculatorExercise(){
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1.0, 4.0));
        System.out.println(AreaCalculator.area(1.0, -4.0));
        System.out.println(AreaCalculator.area(-1.0, -4.0));
    }
    public static void minutesToYearsAndDaysCalculatorExercise(){
        MinutesToYearsAndDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsAndDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsAndDaysCalculator.printYearsAndDays(561600);
        MinutesToYearsAndDaysCalculator.printYearsAndDays(525500);
    }

    public static void equalityPrinterExercise(){
        EqualityPrinter.printEqual(1,1,1);
        EqualityPrinter.printEqual(1,1,2);
        EqualityPrinter.printEqual(-1,-1,-1);
        EqualityPrinter.printEqual(1,2,3);
        EqualityPrinter.printEqual(-1,1,1);
    }
    public static void main(String[] args) {
        //checkNumberExercise();
        //speedConverterExercise();
        //megaBytesConverterExercise();
        //barkingDogExercise();
        //leapYearCalculatorExercise();
        //decimalComparatorExercise();
        //equalSumCheckerExercise();
        //teenNumberCheckerExercise();
        //areaCalculatorExercise();
        //minutesToYearsAndDaysCalculatorExercise();
        equalityPrinterExercise();
    }
}
