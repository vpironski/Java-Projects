package moev_oop;

import java.util.Scanner;

public class main {
    static int n1;
    static double n2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        n2 = scan.nextDouble();

        System.out.println(math.sum(n1,n2));
        System.out.println(math.minus(n1,n2));
        System.out.println(math.po(n1,n2));
        System.out.println(math.del(n1,n2));



    }



}
