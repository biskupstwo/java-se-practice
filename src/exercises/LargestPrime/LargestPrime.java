package exercises.LargestPrime;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.sqrt;

public class LargestPrime {

    public static int getLargestPrime(int number){

        int result = 0;
        int temp = 0;
        ArrayList<Integer> T = new ArrayList<>();
        if (number <= 1){
            result = -1;
            return result;
        }

        int k = (int) Math.floor((number-1)/2);
        boolean[] A = new boolean[k+1];
        Arrays.fill(A, true);

        for (int i = 1; i <= sqrt(k); i++){
            int j=i;
            while (i+j+(2*i*j) <= k) {
                A[i + j + (2 * i * j)] = false;
                j = j + 1;
            }
        }
        for (int i = 0; i < A.length; i++){
            if (A[i]){
                temp = (2*i)+1;
                T.add(temp);
            }
        }
        for (int i = 0; i < T.size(); i++){
            if (number%T.get(i) == 0){
                result = T.get(i);
            }
        }

        return result;
    }
}