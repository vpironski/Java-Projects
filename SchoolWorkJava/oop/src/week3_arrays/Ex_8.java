package week3_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_8 {
    static int n,num;
    static int input;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            input = scan.nextInt();
            arr1[i] = input;
        }
        num = scan.nextInt();
        int small = 0;
        int large = n-1;
        Arrays.sort(arr1);
        while(small < large){
            if(arr1[small] + arr1[large] == num){
                System.out.printf("The two nums are %d and %d\n",arr1[small],arr1[large]);
                small++;
                large--;
            }
            else if(arr1[small] + arr1[large] < num){
                small++;
            }
            else{
                large--;
            }
        }
    }

}
