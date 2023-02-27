package tema2;

import java.util.Scanner;


public class Algorithm_Eucklid {
    static int a,b;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Input a");
        a = scan.nextInt();

        System.out.println("Input b");
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
        else{
            System.out.println("NOD is " + a);
        }

    }
}
