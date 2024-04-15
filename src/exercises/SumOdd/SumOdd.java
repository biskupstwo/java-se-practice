package exercises.SumOdd;

public class SumOdd {

    public static boolean isOdd(int number){
        boolean result;

        if (number > 0){
            result = (number % 2) != 0;
        }else{
            result = false;
        }

        return result;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;

        if ((end >= start) && ((start > 0) && (end > 0))) {
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    sum += i;
                }
            }
        }else{
            sum = -1;
        }
        return sum;
    }
}
