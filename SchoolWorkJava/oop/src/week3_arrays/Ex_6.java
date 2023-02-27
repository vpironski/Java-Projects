package week3_arrays;

import java.util.Scanner;

public class Ex_6 {

    public static int non_repeating_elements(int arr[], int n){
            int i,j;
            for(i = 0; i < n; i++) {
                for(j = 0; j < i; j++) {
                    if(arr[i] == arr[j]){
                        break;
                    }
                }
                if(j == n ) {
                    System.out.printf("\nNon-repeating element: %d", arr[i]);
                }
            }

            return -1;
    }

    public static void main(String[] args) {
        int n;
        int input;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            input = scan.nextInt();
            arr1[i] = input;
        }

        non_repeating_elements(arr1,n);
    }
}


//    int n = scan.nextInt();
//    int[] arr1 = new int[n];
//
//        for (int i = 0; i < n; i++) {
//        int input = scan.nextInt();
//        arr1[i] = input;
//        }
//        Arrays.sort(arr1);
//
//        for (int i = 0; i < n; i++) {
//        if(i+1 >= n) {
//        System.out.print(arr1[i]);
//        break;
//        }
//        else if(arr1[i] != arr1[i+1]){
//        System.out.println(arr1[i]);
//        }
//
//        }