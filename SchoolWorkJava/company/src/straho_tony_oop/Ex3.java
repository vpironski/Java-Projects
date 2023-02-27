package straho_tony_oop;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Input a: ");
        a = scan.nextInt();

        System.out.print("Input b: ");
        b = scan.nextInt();

        while(a != b){
            while(a > b) {
                a = a - b;
            }
            while(b > a){
                b = b - a;
            }
        }
        if(a == 1){
            System.out.println("There is no NOD" );
        }
        else {
            System.out.println("NOD is: " + a);
        }

    }
}
