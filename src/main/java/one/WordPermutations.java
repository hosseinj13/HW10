package one;

import java.util.*;

public class WordPermutations {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your word:");
        String word = getStringFromUser();
        Set<String> permutations = getPermutations(word);
        for (String permutation : permutations) {
            System.out.println(permutation);

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
    public static Set<String> getPermutations(String word) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        Set<String> permutations = new HashSet<>();
        generatePermutations(word.length(), charCount, "", permutations);
        return permutations;
    }

    private static void generatePermutations(int length, Map<Character, Integer> charCount,
                                             String current, Set<String> permutations) {
        if (current.length() == length) {
            permutations.add(current);
            return;
        }
        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            if (count > 0) {
                charCount.put(c, count - 1);
                generatePermutations(length, charCount, current + c, permutations);
                charCount.put(c, count);
            }
        }
    }
}
