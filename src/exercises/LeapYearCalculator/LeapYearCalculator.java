package exercises.LeapYearCalculator;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year){
        boolean result;

        if (year >= 1 && year <= 9999){
            if (year % 4 == 0){
                if (year % 100 == 0){
                    if (year % 400 == 0){
                        result = true;
                    }else{
                        result = false;
                    }
                }
                else{
                    result = true;
                }

            }
            else{
                result = false;
            }
        }
        else{
            result = false;
        }

        return result;
    }
}
