package exercises.EqualSumChecker;

public class EqualSumChecker {

    public static boolean hasEqualSum(int firstParameter, int secondParameter, int thirdParameter){

        boolean result;
        int sum = firstParameter+secondParameter;

        result = sum == thirdParameter;
        return result;
    }
}
