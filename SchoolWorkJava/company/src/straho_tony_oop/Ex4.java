package straho_tony_oop;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        int totalSum = 0;
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            arr[i]= number;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i]>maxNumber){
                maxNumber = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            int currentNumber = arr[i];
            if (currentNumber == maxNumber){
                continue;
            }
            totalSum+=currentNumber;
        }

        if (maxNumber==totalSum){
            System.out.println("Yes, sum is: "+maxNumber);
        }else{
            System.out.println("No, difference is: "+Math.abs(maxNumber-totalSum));
        }
    }
}
