package week4_methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
    public static void separator(int[]array,String s){
        ArrayList<String> finalArr = new ArrayList<String>();
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            finalArr.add(String.valueOf(array[j]));
            finalArr.add(s);
            j++;
        }
        System.out.println(finalArr);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = ";";
        int n = scan.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++) {
            int input = scan.nextInt();
            array[i] = input;
        }
        separator(array,s);

    }
}
