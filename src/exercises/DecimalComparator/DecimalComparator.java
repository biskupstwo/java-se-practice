package exercises.DecimalComparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstParameter, double secondParameter){

        boolean result;

        result = (int) (firstParameter * 1000) == (int) (secondParameter * 1000);

        return result;

    }
}
