package exercises.LastDigitChecker;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstParameter, int secondParameter, int thirdParameter){

        boolean result;
        int firstParameterLastDigit = firstParameter%10;
        int secondParameterLastDigit = secondParameter%10;
        int thirdParameterLastDigit = thirdParameter%10;
        if (isValid(firstParameter) && isValid(secondParameter) && isValid(thirdParameter)){
            result = firstParameterLastDigit == secondParameterLastDigit || firstParameterLastDigit == thirdParameterLastDigit || secondParameterLastDigit == thirdParameterLastDigit;
        }else{
            result = false;
        }

        return result;
    }

    public static boolean isValid(int number){
        boolean result;

        result = number >= 10 && number <= 1000;

        return result;
    }
}
