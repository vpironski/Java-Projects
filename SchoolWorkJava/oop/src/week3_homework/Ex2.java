package week3_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    static int num;
    public static int[] secondPower(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i];
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strArray = scan.nextLine().split(" ");
        int [] array = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        array = secondPower(array);
        System.out.println(Arrays.toString(array));
    }
}
