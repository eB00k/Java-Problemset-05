package P10;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import static java.util.Map.of;

public class ProteinTranslator {
    private static Map<String, String> codonProteinMap;
    public ProteinTranslator() {
        codonProteinMap = new HashMap<>();
        codonProteinMap.put("AUG", "Methionine");
        codonProteinMap.put("UUU", "Phenylalanine");
        codonProteinMap.put("UUC", "Phenylalanine");
        codonProteinMap.put("UUA", "Leucine");
        codonProteinMap.put("UUG", "Leucine");
        codonProteinMap.put("UCU", "Serine");
        codonProteinMap.put("UCC", "Serine");
        codonProteinMap.put("UCA", "Serine");
        codonProteinMap.put("UCG", "Serine");
        codonProteinMap.put("UAU", "Tyrosine");
        codonProteinMap.put("UAC", "Tyrosine");
        codonProteinMap.put("UGU", "Cysteine");
        codonProteinMap.put("UGC", "Cysteine");
        codonProteinMap.put("UGG", "Tryptophan");
    }

    public List<String> translate(String rnaSequence) {
        List<String> protein = new ArrayList<>();

        for (String codon : getCodons(rnaSequence)) {
            String aminoAcid = codonProteinMap.get(codon);
            if (aminoAcid == null) {
                continue;
            }
            if (aminoAcid.equals("STOP")) {
                return protein;
            }
            protein.add(aminoAcid);
        }
        return protein;
    }

    public String[] getCodons(String RNASequence) {
        return RNASequence.split("(?<=\\G...)");
    }


}
