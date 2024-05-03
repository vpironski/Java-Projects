import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a HashMap to store words and their definitions
        HashMap<String, ArrayList<String>> wordDefinitions = new HashMap<>();

        // Read and store words and their definitions
        String[] wordDefinitionsInput = scanner.nextLine().split(" \\| ");
        for (String pair : wordDefinitionsInput) {
            String[] parts = pair.split(": ");
            String word = parts[0];
            String definition = parts[1];

            // Check if the word is already in the map
            if (wordDefinitions.containsKey(word)) {
                // If yes, add the definition to the existing list
                wordDefinitions.get(word).add(definition);
            } else {
                // If no, create a new list with the definition and put it in the map
                ArrayList<String> definitionsList = new ArrayList<>();
                definitionsList.add(definition);
                wordDefinitions.put(word, definitionsList);
            }
        }

        // Read the words to be tested
        String[] wordsToTest = scanner.nextLine().split(" \\| ");

        // Read the command
        String command = scanner.nextLine();

        // Process the command
        if (command.equals("Test")) {
            // Test command: Print definitions of the words to be tested
            for (String word : wordsToTest) {
                if (wordDefinitions.containsKey(word)) {
                    System.out.println(word + ":");
                    for (String definition : wordDefinitions.get(word)) {
                        System.out.println(" -" + definition);
                    }
                }
            }
        } else if (command.equals("Hand Over")) {
            // Hand Over command: Print words without definitions
            for (String word : wordDefinitions.keySet()) {
                System.out.print(word + " ");
            }
        }

        scanner.close();
    }
}
