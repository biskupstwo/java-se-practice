package exercises.NumberPalindrome;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        boolean result;

        int reversedNumber = 0;
        int numberToReverse = number;

        if (number < 0){
            numberToReverse *= -1;
        }
        while (numberToReverse > 0) {
            reversedNumber = reversedNumber * 10 + (numberToReverse % 10);
            numberToReverse /= 10;
        }
        if (number < 0){
            reversedNumber *= -1;
        }

        result = number == reversedNumber;
        return result;
    }
}
