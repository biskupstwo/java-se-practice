package exercises.LastDigitChecker;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstParameter, int secondParameter, int thirdParameter){

        boolean result;
        int firstParameterLastDigit = firstParameter%10;
        int secondParameterLastDigit = secondParameter%10;
        int thirdParameterLastDigit = thirdParameter%10;
        if ((firstParameter >= 10 && firstParameter <= 1000) && (secondParameter >= 10 && secondParameter <= 1000) && (thirdParameter >= 10 && thirdParameter <= 1000)){
            result = firstParameterLastDigit == secondParameterLastDigit || firstParameterLastDigit == thirdParameterLastDigit || secondParameterLastDigit == thirdParameterLastDigit;
        }else{
            result = false;
        }

        return result;
    }
}
