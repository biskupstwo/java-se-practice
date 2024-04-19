package sessions.session5.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scanner.next();

        System.out.printf("There are %d vowels and %d consonants in '%s' ", countVowelsConsonants(word).get(0), countVowelsConsonants(word).get(1), word);
    }

    private static ArrayList<Integer> countVowelsConsonants(String word){
        int vowelsCount = 0;
        int consonantsCount = 0;
        for (int i = 0; i < word.length(); i++){
            switch (Character.toLowerCase(word.charAt(i))){
                case 'a', 'i', 'o', 'u', 'e', 'y':
                    vowelsCount++;
                    break;
                default:
                    consonantsCount++;
                    break;

            }

        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(vowelsCount);
        result.add(consonantsCount);
        return result;
    }
}
