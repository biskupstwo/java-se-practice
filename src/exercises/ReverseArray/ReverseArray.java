package exercises.ReverseArray;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] arrayToReverse){

        System.out.printf("Array = %s\n", Arrays.toString(arrayToReverse));
        int[] reversedArray = new int[arrayToReverse.length];
        int j = 0;
        for (int i = arrayToReverse.length-1; i >= 0; i--){
            reversedArray[j] = arrayToReverse[i];
            j++;
        }
        System.out.printf("Reversed array = %s\n", Arrays.toString(reversedArray));
    }
}
