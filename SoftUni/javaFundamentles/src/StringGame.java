import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the initial string
        String inputString = scanner.nextLine();

        // Initialize a StringBuilder to store changes
        StringBuilder changes = new StringBuilder();

        // Process commands until "Done" is encountered
        while (true) {
            String[] command = scanner.nextLine().split(" ");

            switch (command[0]) {
                case "Change":
                    char charToReplace = command[1].charAt(0);
                    char replacement = command[2].charAt(0);
                    inputString = inputString.replace(charToReplace, replacement);
                    changes.append(inputString).append("\n");
                case "Includes":
                    String substringToCheck = command[1];
                    changes.append(inputString.contains(substringToCheck)).append("\n");
                    break;
                case "End":
                    String endSubstring = command[1];
                    changes.append(inputString.endsWith(endSubstring)).append("\n");
                    break;
                case "Uppercase":
                    inputString = inputString.toUpperCase();
                    changes.append(inputString).append("\n");
                    break;
                case "FindIndex":
                    char charToFind = command[1].charAt(0);
                    int index = inputString.indexOf(charToFind);
                    changes.append(index).append("\n");
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(command[1]);
                    int count = Integer.parseInt(command[2]);
                    String cutChars = inputString.substring(startIndex, startIndex + count);
                    changes.append(cutChars).append("\n");
                    break;
// Print the accumulated changes and exit
                case "Done":
                    System.out.print(changes);
                    return;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
