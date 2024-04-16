package exercises.FirstAndLastDigitSum;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        int result = 0;
        int length = (int) (Math.log10(number)+1);
        int temp = number;
        if (number > 0) {
            if (length == 1){
                result = number*2;
            }
            else{
                while (temp >= 10){
                    temp /= 10;
                }
                result = (number%10) + temp;
            }
        }else{
            result = -1;
        }
        return result;
    }

}
