package exercises.positivenegativezero;

public class PositiveNegativeZero {
    public static void checkNumber(int number){
        String result = "";
        if (number == 0){
            result = "zero";
        } else if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        }
        System.out.println(result);
    }


}
