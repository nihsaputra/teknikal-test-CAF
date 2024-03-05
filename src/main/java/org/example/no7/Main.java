package org.example.no7;

public class Main {
    public static void main(String[] args) {
        String[] data = {"", "break3ing news5:", "1A 1circle is round!"};
        StringBuilder result = new StringBuilder();

        for (String word : data) {
            if (word.isEmpty()) {
                continue;
            }
            String cleanedWord = word.replaceAll("[0-9]", "");
            String formattedWord = cleanedWord.substring(0, 1).toUpperCase() + cleanedWord.substring(1).toLowerCase();
            result.append(formattedWord).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
