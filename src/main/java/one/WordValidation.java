package one;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class WordValidation {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your word 1:");
        String word1 = getStringFromUser();
        System.out.println("Please enter your word 2:");
        String word2 = getStringFromUser();
        if (areWordsValid(word1, word2)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static String getStringFromUser() {
        String input = null;
        try {
            input = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        return input;
    }

    public static boolean areWordsValid(String word1, String word2) {
        Map<Character, Integer> charCount1 = getCharCount(word1);
        Map<Character, Integer> charCount2 = getCharCount(word2);
        return charCount1.equals(charCount2);
    }

    private static Map<Character, Integer> getCharCount(String word) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return charCount;
    }
}
