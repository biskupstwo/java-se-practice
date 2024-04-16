package main.java.com.academy.practice;

import exercises.AreaCalculator.AreaCalculator;
import exercises.BarkingDog.BarkingDog;
import exercises.DecimalComparator.DecimalComparator;
import exercises.EqualSumChecker.EqualSumChecker;
import exercises.EqualityPrinter.EqualityPrinter;
import exercises.EvenDigitSum.EvenDigitSum;
import exercises.FirstAndLastDigitSum.FirstAndLastDigitSum;
import exercises.LastDigitChecker.LastDigitChecker;
import exercises.LeapYearCalculator.LeapYearCalculator;
import exercises.MinutesToYearsAndDaysCalculator.MinutesToYearsAndDaysCalculator;
import exercises.NumberInWord.NumberInWord;
import exercises.NumberOfDaysInMonth.NumberOfDaysInMonth;
import exercises.NumberPalindrome.NumberPalindrome;
import exercises.PlayingCat.PlayingCat;
import exercises.SharedDigit.SharedDigit;
import exercises.SumOdd.SumOdd;
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

    public static void playingCatExercise(){
        System.out.println(PlayingCat.isCatPlaying(true,10));
        System.out.println(PlayingCat.isCatPlaying(false,36));
        System.out.println(PlayingCat.isCatPlaying(false,35));
        System.out.println(PlayingCat.isCatPlaying(true,36));
        System.out.println(PlayingCat.isCatPlaying(true,45));
    }
    public static void numberInWordExercise(){
        NumberInWord.printNumberInWord(0);
        NumberInWord.printNumberInWord(9);
        NumberInWord.printNumberInWord(-1);
        NumberInWord.printNumberInWord(10);
    }

    public static void numberOfDaysInMonthExercise(){
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1,2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(4,2018));
    }

    public static void sumOddExercise(){
        System.out.println(SumOdd.sumOdd(1, 100));
        System.out.println(SumOdd.sumOdd(-1, 100));
        System.out.println(SumOdd.sumOdd(100, 100));
        System.out.println(SumOdd.sumOdd(13, 13));
        System.out.println(SumOdd.sumOdd(100, -100));
        System.out.println(SumOdd.sumOdd(100, 1000));
    }

    public static void numberPalindromeExercise(){
        System.out.println(NumberPalindrome.isPalindrome(-1221));
        System.out.println(NumberPalindrome.isPalindrome(707));
        System.out.println(NumberPalindrome.isPalindrome(11212));
    }

    public static void firstAndLastDigitSumExercise(){
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(252));
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(257));
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(5));
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(-10));
        System.out.println(FirstAndLastDigitSum.sumFirstAndLastDigit(11));
    }

    public static void evenDigitSumExercise(){
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));
        System.out.println(EvenDigitSum.getEvenDigitSum(22));
        System.out.println(EvenDigitSum.getEvenDigitSum(2));
        System.out.println(EvenDigitSum.getEvenDigitSum(0));
    }

    public static void sharedDigitExercise(){
        System.out.println(SharedDigit.hasSharedDigit(12,23));
        System.out.println(SharedDigit.hasSharedDigit(9,99));
        System.out.println(SharedDigit.hasSharedDigit(15,55));
    }

    public static void lastDigitCheckerExercise(){
        System.out.println(LastDigitChecker.hasSameLastDigit(41,22,71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23,32,42));
        System.out.println(LastDigitChecker.hasSameLastDigit(9,99,999));
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
        //equalityPrinterExercise();
        //playingCatExercise();
        //numberInWordExercise();
        //numberOfDaysInMonthExercise();
        //sumOddExercise();
        //numberPalindromeExercise();
        //firstAndLastDigitSumExercise();
        //evenDigitSumExercise();
        //sharedDigitExercise();
        lastDigitCheckerExercise();
    }
}
