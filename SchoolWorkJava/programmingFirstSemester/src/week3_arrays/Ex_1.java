package week3_arrays;

import java.util.Scanner;

public class Ex_1{
    static int n;
    static int input;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            input = scan.nextInt();
            arr[i] = i;
        }

        for (int i = arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
    }
}
