package exercises.EqualityPrinter;

public class EqualityPrinter {

    public static void printEqual(int firstParameter, int secondParameter, int thirdParameter){

        if (firstParameter < 0 || secondParameter < 0 || thirdParameter < 0){
            System.out.println("Invalid Value");
        }else if(firstParameter == secondParameter && firstParameter == thirdParameter){
            System.out.println("All numbers are equal");
        }else if(firstParameter != secondParameter && firstParameter != thirdParameter){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }

    }
}
