package exercises.PlayingCat;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean result;

        result = ((!summer) && ((temperature >= 25) && (temperature <= 35))) || ((summer) && ((temperature >= 25) && (temperature <= 45)));
        return result;
    }
}
