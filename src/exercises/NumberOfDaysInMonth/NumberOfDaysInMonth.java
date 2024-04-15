package exercises.NumberOfDaysInMonth;

import exercises.LeapYearCalculator.LeapYearCalculator;

public class NumberOfDaysInMonth {

    public static byte getDaysInMonth(int month, int year){
        byte daysInMonth = 0;

        if (month < 1 || month > 12){
            daysInMonth = -1;
        }else if(year < 1 || year > 9999){
            daysInMonth = -1;
        }else{
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysInMonth = 31;
                    break;
                case 2:
                    if (LeapYearCalculator.isLeapYear(year)){
                        daysInMonth = 29;
                    }else{
                        daysInMonth = 28;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
            }
        }

        return daysInMonth;
    }
}
