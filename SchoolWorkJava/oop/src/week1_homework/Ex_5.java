package week1_homework;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter the numbers");
        for (int i = 0; i < 5; i++) {
            arr[i] = scan.nextInt();
        }


        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("The biggest number is:");
        System.out.println(largest);
    }
}
