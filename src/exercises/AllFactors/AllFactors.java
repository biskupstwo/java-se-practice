package exercises.AllFactors;

public class AllFactors {

    public static void printFactors(int number){

        String result = "";

        if (number < 1){
            result = "Invalid Value";
        }else{
            for (int i = 1; i <= number; i++){
                if (number % i == 0) result += String.format(" %d", i);
            }
        }

        System.out.println(result);
    }
}
