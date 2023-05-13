package P10;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {
    public boolean isPangram(String input) {
        Set<Character> charSet = new HashSet<>();
        String lowerCaseInput = input.toLowerCase();
        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char c = lowerCaseInput.charAt(i);
            if (Character.isLetter(c)) {
                charSet.add(c);
            }
        }
        return charSet.size() == 26;
    }
}
