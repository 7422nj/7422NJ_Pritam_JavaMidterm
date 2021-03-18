package string.problems;

import java.util.Set;

public class Permutation {

    public static void main(String[] args) {

        /*
        Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".

        Write Java program to compute all permutations of any given String
         */
        String s = "ABC";
        permutations(s.toCharArray(), 0);
    }

    private static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    private static void permutations(char[] ch, int currentIndex) {
        if (currentIndex == ch.length - 1) {
            System.out.println(String.valueOf(ch));
        }

        for (int i = currentIndex; i < ch.length; i++) {
            swap(ch, currentIndex, i);
            permutations(ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
    }

    public static Set<String> permutations(String bob) {
        permutations("obb");
        return null;
    }
}
