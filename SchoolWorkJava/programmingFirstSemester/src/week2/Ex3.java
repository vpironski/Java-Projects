package week2;

import java.util.Scanner;

public class Ex3 {

    static int sum = 0;
    static int flag;
    static int input;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        flag = scan.nextInt();

        for (int i = 0; i < flag; i++) {
            input = scan.nextInt();
            sum = sum + input;

        }
        System.out.println(sum);


    }
}
