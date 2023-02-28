package week4_methods;

import java.util.Scanner;

public class Ex2 {
    public static int greatest(int num1, int num2, int num3){
        int [] array = {num1,num2,num3};
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if(temp < array[i]){
                temp = array[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println(greatest(num1,num2,num3));
    }
}
