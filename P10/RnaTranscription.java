package P10;

import java.util.HashMap;
import java.util.Map;

public class RnaTranscription {
    private static final Map<Character, Character> DNA_TO_RNA_MAP = new HashMap<Character, Character>() {{
        put('G', 'C');
        put('C', 'G');
        put('T', 'A');
        put('A', 'U');
    }};

    public static String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();
        for (char c : dnaStrand.toCharArray()) {
            rnaStrand.append(DNA_TO_RNA_MAP.get(c));
        }
        return rnaStrand.toString();
    }
}
