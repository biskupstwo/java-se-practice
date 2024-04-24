package exercises.SortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size){

        int[] integers = new int[size];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < size; i++){
            integers[i] = scanner.nextInt();
        }

        return integers;
    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++){
            System.out.printf("Element %d contents %d\n", i, array[i]);
        }
    }

    //bubble sort
    public static int[] sortIntegers(int[] unsortedArray, boolean bubbleSort){

        int[] sortedArray = unsortedArray;
        int temp;
        if (bubbleSort){
            for (int i = 0; i < sortedArray.length; i++){
                for (int j = 1; j < sortedArray.length-i; j++){
                    if (sortedArray[j-1] < sortedArray[j]){
                        temp = sortedArray[j-1];
                        sortedArray[j-1] = sortedArray[j];
                        sortedArray[j] = temp;


                    }
                }
            }
        }
        return sortedArray;
    }
    //sort built-in
    public static int[] sortIntegers(int[] unsortedArray){
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
