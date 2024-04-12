package exercises.TeenNumberChecker;

public class TeenNumberChecker {

    public static boolean isTeen(int number){
        boolean result;

        result = number >= 13 && number <= 19;

        return result;
    }

    public static boolean hasTeen(int firstParameter, int secondParameter, int thirdParameter){

        int[] array;
        array = new int[]{firstParameter, secondParameter, thirdParameter};
        boolean result = false;

        for(int i = 0; i < array.length; i++){
            if (isTeen(array[i])){
                result = true;
                return result;
            }else {
                result = false;
            }
        }

        return result;

    }
}
