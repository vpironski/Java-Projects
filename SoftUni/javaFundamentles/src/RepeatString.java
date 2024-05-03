import java.util.*;
//Write a Program That Reads an Array of Strings.
// Each String is Repeated N Times, Where N is the length of the String. Print the Concatenated String.
public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            int size = words[i].length();
            for (int j = 0; j < size; j++) {
                System.out.print(words[i]);
            }
        }
    }
}
