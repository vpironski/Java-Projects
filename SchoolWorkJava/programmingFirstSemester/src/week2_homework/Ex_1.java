package week2_homework;

import java.util.Scanner;

public class Ex_1 {
    static int num;
    static int sum;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        while (num > 0) {
            sum += num % 10;
            num = num / 10;

        }
        System.out.println(sum);


    }
}
