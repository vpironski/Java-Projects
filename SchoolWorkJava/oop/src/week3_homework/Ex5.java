package week3_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array1 = scan.nextLine().split(" ");
        int [] array1_num = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array1_num[i] = Integer.parseInt(array1[i]);
        }

        String[] array2 = scan.nextLine().split(" ");
        int [] array2_num = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2_num[i] = Integer.parseInt(array2[i]);
        }

        int[] finalArray = new int[array1.length];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = array1_num[i] + array2_num[i];
        }
        System.out.println(Arrays.toString(finalArray));
    }
}
