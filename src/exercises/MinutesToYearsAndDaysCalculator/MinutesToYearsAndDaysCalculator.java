package exercises.MinutesToYearsAndDaysCalculator;

public class MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays(long minutes){
        long days = 0;
        long years = 0;
        long remaindingDays = 0;

        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            days = (minutes/60)/24;
            years = days/365;
            remaindingDays = days%365;

            System.out.println(String.format("%d min = %d y and %d d", minutes, years, remaindingDays));
        }

    }
}
