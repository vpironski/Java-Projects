package week5_hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2 {
    public static void uniqueChars(String word){
        HashMap<Character,Integer> chars = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(!chars.containsKey(c)){
                chars.put(c,i);
            }
        }
        System.out.println(chars);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        uniqueChars(word);
    }
}
