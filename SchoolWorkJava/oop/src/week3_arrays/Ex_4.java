package week3_arrays;

import java.util.Scanner;

public class Ex_4 {
    static int n;
    static int input;
    static int m;
    static int index;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            input = scan.nextInt();
            arr[i] = input;
        }

        m = scan.nextInt();
        index = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] == m) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
