package week3_homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array1 = scan.nextLine().split(" ");
        String[] array2 = scan.nextLine().split(" ");
        ArrayList<String> finalArray = new ArrayList<String>();
        for (int i = 0;i < array1.length;i++) {
            finalArray.add(array1[i]);
        }
        for (int i = 0;i < array2.length;i++) {
            finalArray.add(array2[i]);
        }
        System.out.println(finalArray);
    }
}
