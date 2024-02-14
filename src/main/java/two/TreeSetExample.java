package two;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Character> treeSet1 = new TreeSet<>();
        TreeSet<Character> treeSet2 = new TreeSet<>();


        addRandomChars(treeSet1);
        addRandomChars(treeSet2);


        System.out.println("TreeSet 1: " + treeSet1);
        System.out.println("TreeSet 2: " + treeSet2);

        TreeSet<Character> unionSet = findUnion(treeSet1, treeSet2);
        System.out.println("Union Set: " + unionSet);
    }

    private static void addRandomChars(TreeSet<Character> treeSet) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) ('a' + random.nextInt(26));
            treeSet.add(randomChar);
        }
    }

    private static TreeSet<Character> findUnion(TreeSet<Character> set1, TreeSet<Character> set2) {

        TreeSet<Character> unionSet = new TreeSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
}
