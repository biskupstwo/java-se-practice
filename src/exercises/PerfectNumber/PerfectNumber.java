package exercises.PerfectNumber;

import java.util.ArrayList;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        boolean result;
        ArrayList<Integer> divisorsList = new ArrayList<>();
        int sum = 0;
        if (number < 1){
            result = false;
        }else{
            for (int i = 1; i < number; i++){
                if (number%i == 0){
                    divisorsList.add(i);
                }
            }
            for (int i=0; i < divisorsList.size(); i++){
                sum += divisorsList.get(i);
            }
            result = sum == number;
        }

        return result;
    }
}
