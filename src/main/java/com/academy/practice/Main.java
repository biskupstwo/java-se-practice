package main.java.com.academy.practice;

import exercises.AllFactors.AllFactors;
import exercises.AreaCalculator.AreaCalculator;
import exercises.Banking.Bank;
import exercises.BarkingDog.BarkingDog;
import exercises.BillsBurger.DeluxeBurger;
import exercises.BillsBurger.Hamburger;
import exercises.BillsBurger.HealthyBurger;
import exercises.CarpetCostCalculator.Calculator;
import exercises.CarpetCostCalculator.Carpet;
import exercises.CarpetCostCalculator.Floor;
import exercises.ComplexOperations.ComplexNumber;
import exercises.Composition.*;
import exercises.Cylinder.Circle;
import exercises.Cylinder.Cylinder;
import exercises.DecimalComparator.DecimalComparator;
import exercises.Encapsulation.Printer;
import exercises.EqualSumChecker.EqualSumChecker;
import exercises.EqualityPrinter.EqualityPrinter;
import exercises.EvenDigitSum.EvenDigitSum;
import exercises.FirstAndLastDigitSum.FirstAndLastDigitSum;
import exercises.FlourPackProblem.FlourPackProblem;
import exercises.GreatestCommonDivisor.GreatestCommonDivisor;
import exercises.LargestPrime.LargestPrime;
import exercises.LastDigitChecker.LastDigitChecker;
import exercises.LeapYearCalculator.LeapYearCalculator;
import exercises.MinimumElement.MinimumElement;
import exercises.MinutesToYearsAndDaysCalculator.MinutesToYearsAndDaysCalculator;
import exercises.MobilePhone.Contact;
import exercises.MobilePhone.MobilePhone;
import exercises.NumberInWord.NumberInWord;
import exercises.NumberOfDaysInMonth.NumberOfDaysInMonth;
import exercises.NumberPalindrome.NumberPalindrome;
import exercises.NumberToWords.NumberToWords;
import exercises.PaintJob.PaintJob;
import exercises.PerfectNumber.PerfectNumber;
import exercises.Person.Person;
import exercises.PlayingCat.PlayingCat;
import exercises.Playlist.Album;
import exercises.Playlist.Song;
import exercises.Point.Point;
import exercises.Polymorphism.Car;
import exercises.Polymorphism.Ford;
import exercises.Polymorphism.Holden;
import exercises.Polymorphism.Mitsubishi;
import exercises.PoolArea.Cuboid;
import exercises.PoolArea.Rectangle;
import exercises.ReverseArray.ReverseArray;
import exercises.SharedDigit.SharedDigit;
import exercises.SimpleCalculator.SimpleCalculator;
import exercises.SortedArray.SortedArray;
import exercises.SumOdd.SumOdd;
import exercises.TeenNumberChecker.TeenNumberChecker;
import exercises.WallArea.Wall;
import exercises.megabytesconverter.MegaBytesConverter;
import exercises.positivenegativezero.PositiveNegativeZero;
import exercises.speedconverter.SpeedConverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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

    public static void allFactorsExercise(){
        AllFactors.printFactors(6);
        AllFactors.printFactors(32);
        AllFactors.printFactors(10);
        AllFactors.printFactors(-1);
    }

    public static void greatestCommonDivisorExercise(){
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(25,15));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(12,30));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(9,18));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(81,153));
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(153,81));
    }

    public static void perfectNumberExercise(){
        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(PerfectNumber.isPerfectNumber(28));
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(-1));
    }

    public static void numberToWords(){
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
    }

    public static boolean isPalindrome(String input){
        boolean result;
        String candidate = input.toLowerCase();
        String reversedString = "";
        for (int i = candidate.length()-1; i >= 0; i--){
            reversedString += candidate.charAt(i);
        }
        result = candidate.equals(reversedString);
        return result;
    }

    public static void flourPackProblemExercise(){
        System.out.println(FlourPackProblem.canPack(1,0,4));
        System.out.println(FlourPackProblem.canPack(1,0,5));
        System.out.println(FlourPackProblem.canPack(0,5,4));
        System.out.println(FlourPackProblem.canPack(2,2,11));
        System.out.println(FlourPackProblem.canPack(-3,2,12));
        System.out.println(FlourPackProblem.canPack(1,5,9));
    }

    public static void paintJobExercise(){
        System.out.println(PaintJob.getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(3.4,2.1,1.5,2));
        System.out.println(PaintJob.getBucketCount(2.75,3.25,2.5,1));
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5));
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));
        System.out.println(PaintJob.getBucketCount(3.4, 1.5));
        System.out.println(PaintJob.getBucketCount(6.26, 2.2));
        System.out.println(PaintJob.getBucketCount(3.26, 0.75));
    }

    public static void largestPrimeExercise(){
        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(217));
        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(-1));
    }

    public static void simpleCalculatorExercise(){
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= "+ calculator.getAdditionResult());
        System.out.println("subtract= "+ calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

    public static void personExercise(){
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName= " + person.getFullName());
    }

    public static void wallAreaExercise(){
        Wall wall = new Wall(5,4);
        System.out.println("area=" + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());
        System.out.println("height=" + wall.getHeight());
        System.out.println("area=" + wall.getArea());
        Wall secondWall = new Wall();
        System.out.println("width=" + secondWall.getWidth());
        System.out.println("height=" + secondWall.getHeight());
    }

    public static void pointExercise(){
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

    public static void carpetCostCalculatorExercise(){
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(carpet, floor);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(carpet, floor);
        System.out.println("total= " + calculator.getTotalCost());
    }

    public static void complexNumberExercise(){
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }

    public static void cylinderExercise(){
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

    }

    public static void poolAreaExercise(){
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }

    public static void compositionExercise(){
        Walls wall1 = new Walls("West");
        Walls wall2 = new Walls("East");
        Walls wall3 = new Walls("South");
        Walls wall4 = new Walls("North");
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }

    public static void encapsulationExercise(){
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }

    public static void polymorphismExercise(){
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }

    public static void billsBurgerExercise(){
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }

    public static void sortedArrayExercise(){
        int[] array = SortedArray.getIntegers(5);
        SortedArray.printArray(array);
        int[] sortedArray = SortedArray.sortIntegers(array);
        SortedArray.printArray(sortedArray);
    }

    public static void minimumElementExercise(){
        int[] minElementArray = MinimumElement.readElements(5);
        System.out.printf("minValue: %d", MinimumElement.findMin(minElementArray));
    }

    public static void reverseArrayExercise(){
        ReverseArray.reverse(new int[]{1, 2, 3, 4, 5});
    }

    public static void mobilePhoneExercise(){

        Contact bobContact = Contact.createContact("Bob", "31415926");
        Contact aliceContact = Contact.createContact("Alice", "16180339");
        Contact tomContact = Contact.createContact("Tom", "11235813");
        Contact janeContact = Contact.createContact("Jane", "23571113");
        Contact newJaneContact = Contact.createContact("Jane", "23571114");
        ArrayList<Contact> contactsList = new ArrayList<>(Arrays.asList(bobContact, aliceContact, tomContact, janeContact));

        MobilePhone myMobilePhone = new MobilePhone("100100100");
        for (Contact contact : contactsList){
            myMobilePhone.addNewContact(contact);
        }
        myMobilePhone.printContacts();
        System.out.println(myMobilePhone.findContact(janeContact));
        System.out.println(myMobilePhone.findContact("23571113"));
        System.out.println(myMobilePhone.queryContact("Jane"));
        System.out.println(myMobilePhone.updateContact(janeContact, newJaneContact));
        System.out.println(myMobilePhone.findContact(janeContact));
        System.out.println(myMobilePhone.findContact("23571113"));
        System.out.println(myMobilePhone.queryContact("Jane"));
        myMobilePhone.printContacts();
        System.out.println(myMobilePhone.removeContact(newJaneContact));
        myMobilePhone.printContacts();
        System.out.println(myMobilePhone.addNewContact(janeContact));
        myMobilePhone.printContacts();
    }

    public static void playlistExercise(){
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("You can't do it right", playList);
        albums.get(0).addToPlaylist("Holy man", playList);
        albums.get(0).addToPlaylist("Speed king", playList);  // Does not exist
        albums.get(0).addToPlaylist(9, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(24, playList);  // There is no track 24

        System.out.println(playList);

    }

    public static void bankExercise(){

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.findBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Adelaide", false);
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
        //lastDigitCheckerExercise();
        //allFactorsExercise();
        //greatestCommonDivisorExercise();
        //perfectNumberExercise();
        //numberToWords();
        //System.out.println(isPalindrome("Aba"));
        //flourPackProblemExercise();
        //largestPrimeExercise();
        //InputCalculator.inputThenPrintSumAndAverage();
        //paintJobExercise();
        //simpleCalculatorExercise();
        //personExercise();
        //wallAreaExercise();
        //pointExercise();
        //carpetCostCalculatorExercise();
        //complexNumberExercise();
        //cylinderExercise();
        //poolAreaExercise();
        //compositionExercise();
        //encapsulationExercise();
        //polymorphismExercise();
        //billsBurgerExercise();
        //sortedArrayExercise();
        //minimumElementExercise();
        //reverseArrayExercise();
        //mobilePhoneExercise();
        //playlistExercise();
        bankExercise();
    }
}
