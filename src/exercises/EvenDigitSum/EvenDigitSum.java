package exercises.EvenDigitSum;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        int result = 0;
        String numberStr = Integer.toString(number);
        if (number >= 0) {
            for (int i = 0; i < numberStr.length(); i++) {
                if (((int) numberStr.charAt(i) % 2) == 0) {
                    result += numberStr.charAt(i) - '0';
                }
            }
        }else{
            result = -1;
        }
        return result;
    }
}
