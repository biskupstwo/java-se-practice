package exercises.InputCalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){

        ArrayList<Integer> numbers = new ArrayList<>();
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        int avg = 0;

        int input = 0;

        do{
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                numbers.add(input);
            }
        }while(scanner.hasNextInt());

        if (!numbers.isEmpty()){
            avg = result/numbers.size();
        }
        for (int i = 0; i < numbers.size(); i++){
            result += numbers.get(i);
        }

        System.out.println(String.format("SUM = %d AVG = %d", result, avg));
    }
}
