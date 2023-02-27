package week3_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array1 = scan.nextLine().split(" ");
        String[] array2 = scan.nextLine().split(" ");
        int[] finalArray = new int[2];
        int start = 0;
        int end = array2.length - 1;
        while (start < end) {
            int temp = Integer.parseInt(array2[start]);
            array2[start] = array2[end];
            array2[end] = String.valueOf(temp);
            start = start + 1;
            end = end - 1;
        }
        for (int i = 0;i < array1.length;i++) {
            finalArray[0] = Integer.parseInt(array1[i]);
            finalArray[1] = Integer.parseInt(array2[i]);
            System.out.println(Arrays.toString(finalArray));
        }

    }
}
