package week4_methods;

import java.util.Scanner;

public class Ex1 {
    public static int sum (int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(sum(a,b));
    }
}
