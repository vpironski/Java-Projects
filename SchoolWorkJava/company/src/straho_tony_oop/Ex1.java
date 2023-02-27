package straho_tony_oop;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            arr[i]= number;
        }
        for (int i = 0; i < n; i+=2) {
            int currentNumber = arr[i];
            evenSum+=currentNumber;
        }
        for (int i = 1; i < n; i+=2) {
            int currentNumber = arr[i];
            oddSum+=currentNumber;
        }

        if (evenSum==oddSum){
            System.out.println("Yes, sum is: " + evenSum);
        }
        else{
            System.out.println("No, difference is: " + Math.abs(evenSum-oddSum));
        }
    }
}
