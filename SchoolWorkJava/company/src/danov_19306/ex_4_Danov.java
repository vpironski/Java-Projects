package danov_19306;

import java.util.Scanner;

public class ex_4_Danov {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if( i % 3 != 0 && i % 7 != 0){
                System.out.println(i);
            }

        }
    }
}
