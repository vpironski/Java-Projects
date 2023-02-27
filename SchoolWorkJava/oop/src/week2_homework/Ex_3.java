package week2_homework;

import java.util.Scanner;

public class Ex_3 {
    static int number;

    static char first;
    static char last;
    static int firstDigit;
    static int lastDigit;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a five digit number: ");
        number = scan.nextInt();
        lastDigit = number % 10;
        firstDigit = number;

        while(firstDigit > 9) {
            firstDigit /= 10;
        }

        String string = Integer.toString(number);

        first = string.charAt(0);
        last = string.charAt(string.length() - 1);

        string.replace(first, last);
        string.replace(last, first);

        System.out.println(string);
    }
}
