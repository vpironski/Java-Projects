package week3_arrays;

import java.util.Scanner;

public class Ex_5 {
    static String text;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        text = scan.nextLine();

        boolean flag = false;
        for (int i = 0; i < text.length(); i++) {

            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Not a Palindrom!");
        }
        else{
            System.out.println("Palindrome!");
        }


    }
}
