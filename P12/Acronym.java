package P12;

public class Acronym {
    private String acronym;

    public Acronym(String phrase) {
        acronym = generateAcronym(phrase);
    }

    public String get() {
        return acronym;
    }

    private static String generateAcronym(String phrase) {
        String[] words = phrase.split("[\\s-]+");
        StringBuilder acronymBuilder = new StringBuilder();
        for (String word : words) {
            acronymBuilder.append(Character.toUpperCase(word.charAt(0)));
        }
        return acronymBuilder.toString();
    }
}


