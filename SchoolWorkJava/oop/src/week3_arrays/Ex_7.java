package week3_arrays;

import java.util.Scanner;

public class Ex_7 {
    static int n,m;
    static int input;

    public static void main(String[] args) {
        // 1,7,8,0,9,3,12,33
        // 3,4,0,8,12,3

        //0,1,3,7,8,9,12,33
        //0,3,3,4,8,12

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            input = scan.nextInt();
            arr1[i] = input;
        }

        m = scan.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            input = scan.nextInt();
            arr2[i] = input;
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}

