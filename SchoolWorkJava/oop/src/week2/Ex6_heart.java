package week2;

import java.util.Scanner;

public class Ex6_heart {
    static int rows;
    static int k;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        k = 0;
        rows = scan.nextInt();

        for (int i = 1; i <= rows; i+=2, k = 0) {
            //first triangle
            for (int space = 1; space <= (rows - i)/2; ++space) {
                System.out.print("  ");
            }

            while (k != i) {
                System.out.print("* ");
                ++k;
            }

            //empty triangle
            k=0;
            for (int space = 1; space <= (rows - i)/2; ++space) {
                System.out.print("  ");
            }
            System.out.print("  ");

            //second triangle
            for (int space = 1; space <= (rows - i)/2; ++space) {
                System.out.print("  ");
            }

            while (k != i) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }



        // Inverse triangle
        for(int i = rows; i >= 1; --i) {
            System.out.print("  ");
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }







    }
}
