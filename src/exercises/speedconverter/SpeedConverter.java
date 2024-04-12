package exercises.speedconverter;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        long result = 0;
        double kilometerToMile = 0.6213711922;
        if (kilometersPerHour < 0){
            result = -1;
        }else {
            result = Math.round(kilometersPerHour * kilometerToMile);
        }
        return result;
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = 0;

        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.print(String.format("%.3f km/h = %d mi/h\n", kilometersPerHour, milesPerHour));
        }
    }
}
