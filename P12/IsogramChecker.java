package P12;

import java.util.HashSet;
import java.util.Set;

public class IsogramChecker {
    public static boolean isIsogram(String phrase) {
        String cleaned = phrase.replaceAll("[\\s-]+", "");
        String lowercase = cleaned.toLowerCase();
        Set<Character> letters = new HashSet<Character>();
        for (char c : lowercase.toCharArray()) {
            if (letters.contains(c)) {
                return false;
            }
            letters.add(c);
        }
        return true;
    }
}
