import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Split sentence into words (removes punctuation)
        String[] words = sentence.toLowerCase().replaceAll("[^a-z0-9 ]", "").split("\\s+");

        // Create a HashMap to store word -> count
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Count occurrences
        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Display results
        System.out.println("\nWord Frequency:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }
}
