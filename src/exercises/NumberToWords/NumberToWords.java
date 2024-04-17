package exercises.NumberToWords;

public class NumberToWords {

    public static String getNumberInWord(int number) {
        String result = "";
        switch (number) {
            case 0:
                result = "Zero";
                break;
            case 1:
                result ="One";
                break;
            case 2:
                result ="Two";
                break;
            case 3:
                result ="Three";
                break;
            case 4:
                result ="Four";
                break;
            case 5:
                result ="Five";
                break;
            case 6:
                result ="Six";
                break;
            case 7:
                result ="Seven";
                break;
            case 8:
                result ="Eight";
                break;
            case 9:
                result ="Nine";
                break;
            default:
                result ="Other";
                break;
        }
        return result;
    }
    public static int getDigitCount(int number){
        int result = 0;
        if (number >= 0) {
            result = (int) Math.log10(number) + 1;
        }else{
            result = -1;
        }
        return result;
    }

    public static int reverse(int number){
        int reversedNumber = 0;
        int numberToReverse = number;

        if (number < 0){
            numberToReverse *= -1;
        }
        while (numberToReverse > 0) {
            reversedNumber = reversedNumber * 10 + (numberToReverse % 10);
            numberToReverse /= 10;
        }
        if (number < 0){
            reversedNumber *= -1;
        }

        return reversedNumber;
    }

    public static void numberToWords(int number){

        String result = "";
        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);
        int reversedNumberDigitCount = getDigitCount(reversedNumber);
        int temp = reversedNumber;
        int numberToWord = 0;
        if (number < 0){
            System.out.println("Invalid Value");
        }else{
            while (temp > 0) {
                numberToWord = temp % 10;
                result += getNumberInWord(numberToWord) + " ";
                temp /= 10;
            }
            if (digitCount != reversedNumberDigitCount) {
                for (int i = 0; i < digitCount - reversedNumberDigitCount; i++) {
                    result += getNumberInWord(0) + " ";
                }
            }
        }
        System.out.println(result);
    }
}
