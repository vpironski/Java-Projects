package week2_homework;

import java.util.Scanner;

public class Ex_2 {
    static int num;
    static int reversedNum = 0;
    static int temp;
    static int originalNum;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        originalNum = num;

        while (num != 0) {
            temp = num % 10;
            reversedNum = reversedNum * 10 + temp;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}
