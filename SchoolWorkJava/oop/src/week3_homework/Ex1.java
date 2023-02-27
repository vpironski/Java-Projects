package week3_homework;

import java.util.Scanner;

public class Ex1 {
    static String temp = "";
    static int num;
    static int number;
    public static int combined(String [] array){
        for (int i = 0; i < array.length; i++) {
            temp = temp + array[i];
        }
        num = Integer.parseInt(temp);
        return num;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split(" ");
        number = combined(array);
        System.out.println(number);
    }
}
