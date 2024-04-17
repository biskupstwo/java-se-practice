package exercises.GreatestCommonDivisor;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){
        int result = 0;
        int smallerNumber;
        if (first < 10 || second < 10){
            result = -1;
        }else{
            if (first > second){
                smallerNumber = second;
            }else{
                smallerNumber = first;
            }
            for (int i=1; i<smallerNumber; i++){
                if (first%i == 0 && second%i == 0){
                    if (i > result){
                        result = i;
                    }
                }
            }
        }

        return result;
    }
}
