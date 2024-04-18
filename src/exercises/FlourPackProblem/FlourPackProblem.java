package exercises.FlourPackProblem;

public class FlourPackProblem {

    public static boolean canPack (int bigCount, int smallCount, int goal){

        boolean result;

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            result = false;
            return result;
        }

        int sum = bigCount*5 + smallCount;
        if (sum == goal){
            result = true;
        }else if(smallCount > 0 && smallCount == goal-(bigCount*5)+1){
            result = true;
        }
        else{
            result = false;
        }


        return result;
    }
}
