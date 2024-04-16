package exercises.SharedDigit;

public class SharedDigit {

    public static boolean hasSharedDigit (int firstParameter, int secondParameter){
        boolean result;

        if ((firstParameter >= 10 && firstParameter <= 99) && (secondParameter >= 10 && secondParameter <= 99)){
            result = firstParameter % 10 == secondParameter % 10 || firstParameter / 10 == secondParameter % 10 || firstParameter % 10 == secondParameter / 10 || firstParameter / 10 == secondParameter / 10;
        }else{
            result = false;
        }

        return result;

    }
}

