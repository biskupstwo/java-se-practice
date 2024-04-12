package exercises.BarkingDog;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean dogBarking, int hourOfDay){
        boolean decision = dogBarking && (hourOfDay >= 0 && hourOfDay < 23 && (hourOfDay < 8 || hourOfDay >= 22));
        return decision;
    }
}
