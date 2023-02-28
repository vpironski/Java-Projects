package week5_hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {
    public static void ocurances(String word){
        HashMap<Character, ArrayList<Integer>> num = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!num.containsKey(c)){
                num.put(c,new ArrayList<>());
            }
            num.get(c).add(i);
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String word = String.valueOf(n);
        ocurances(word);
    }
}
