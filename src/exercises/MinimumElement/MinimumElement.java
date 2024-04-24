package exercises.MinimumElement;

import java.util.Scanner;

public class MinimumElement {

        public static int readInteger(){

            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }


        public static int[] readElements(int size){

            int[] integers = new int[size];

            for (int i = 0; i < size; i++){
                integers[i] = readInteger();
            }

            return integers;
        }

        public static int findMin(int[] integersArray){

            int minValue = integersArray[0];
            for (Integer number : integersArray){
                minValue = number < minValue ? number : minValue;
            }

            return minValue;

        }


}
