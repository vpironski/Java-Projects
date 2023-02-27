package week3_arrays;

import java.util.Scanner;

public class Ex_2 {
    static int n;
    static int input;
    static int sum;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            input = scan.nextInt();
            arr[i] = input;
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sum){
                System.out.println(arr[i]);
            }

        }
    }

}
