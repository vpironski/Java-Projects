package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
//        int n = 52; //Number of cards in the decks
        int sum1 = 0;
        int sum2 = 0;
        List<Integer> list1 = new ArrayList<>();  //first deck
        List<Integer> list2 = new ArrayList<>();  //second deck
        System.out.println("-------------------");

        for (int i = 0; i < n; i++) {  //Filling the first deck
            int a = scan.nextInt();
            list1.add(a);
            sum1 += a;
        }
        System.out.println(list1);
        System.out.println("-------------------");

        for (int i = 0; i < n; i++) {  //Filling the second deck
            int b = scan.nextInt();
            list2.add(b);
            sum2 += b;
        }
        System.out.println(list2);
        System.out.println("-------------------");
        if (sum1 > sum2) {
            System.out.println("The first deck wins. The sum is: " + sum1);
        } else if (sum2 > sum1) {
            System.out.println("The second deck wins. The sum is: " + sum2);
        } else {
            System.out.println("Error");
            System.out.println("The decks may be of equal value ");
            System.out.println("sum1 =" + sum1 + "; " + "sum2 =" + sum2);
        }


    }
}

