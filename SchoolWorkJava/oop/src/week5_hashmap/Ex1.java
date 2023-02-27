package week5_hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Ex1 {
    public static int uniqueChars(String word){
        HashMap<Character,Boolean> chars = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            chars.put(word.charAt(i),true);
        }
        return chars.size();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(uniqueChars(word));
    }
}
