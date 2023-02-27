package week1_homework;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
