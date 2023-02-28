package week1_homework;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[3];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < 3; i++) {
            arr[i] = scan.nextInt();
        }

        boolean bubble = true;

        while(bubble) {
            bubble = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    bubble = true;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}
