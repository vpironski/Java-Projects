package week2;

import java.util.Scanner;

public class Ex5_prime {
    static int input;
    static int i;
    static int m = 0;
    static boolean flag = false;


    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
        m=(int) Math.sqrt(input);

        if(input==0||input==1){
            System.out.println(input+" is not prime number");
        }

        else{
            for(i=2;i<=m;i++){
                if(input%i==0){
                    System.out.println(input+" is not prime number");
                    flag = true;
                    break;
                }
            }

            if(!flag)  { System.out.println(input+" is prime number"); }
        }
    }
}
