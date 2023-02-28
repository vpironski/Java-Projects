package week2;

import java.util.Scanner;

public class Ex1_FizzBuzz {
    static int num; // input num

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        for (int i = 1; i <= num ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }


            else{
                System.out.println(i);
            }

        }




    }
}
