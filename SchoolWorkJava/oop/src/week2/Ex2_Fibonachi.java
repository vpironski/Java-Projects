package week2;

import java.util.Scanner;

public class Ex2_Fibonachi {
    static int input;
    static int n1,n2,n3;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
        n1 = 0;
        n2 = 1;

        for (int i = 0; i < input; i++) {

            System.out.println(n1);
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

    }
}
