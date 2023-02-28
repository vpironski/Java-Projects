package week3_arrays;

import java.util.Scanner;

public class Ex_3 {
    static int n;
    static int input;
    static boolean swap = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            input = scan.nextInt();
            arr[i] = input;
        }

        while (swap) {
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }
}




