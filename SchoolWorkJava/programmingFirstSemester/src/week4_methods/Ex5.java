package week4_methods;

import java.util.Scanner;

public class Ex5 {
    public static String printVowels(String sentence){
        String finalWord = "";
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if(letter >= 'A' && letter <= 'Z'){
                letter += 'a' - 'A';
                finalWord += letter;
            }
            else if(letter >= 'a' && letter <= 'z'){
                letter -= 'a'-'A';
                finalWord += letter;
            }
        }
        return finalWord;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        printVowels(word);
    }
}
