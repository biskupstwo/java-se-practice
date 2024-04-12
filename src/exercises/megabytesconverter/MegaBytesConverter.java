package exercises.megabytesconverter;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int KiloBytes){
        int MegaBytes = 0;
        int remainingKiloBytes = 0;
        if (KiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            MegaBytes = KiloBytes/1024;
            remainingKiloBytes = KiloBytes % 1024;
            System.out.print(String.format("%d KB = %d MB and %d KB\n", KiloBytes, MegaBytes, remainingKiloBytes));
        }
    }
}
