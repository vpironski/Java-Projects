package ivelin_20534;

import java.util.Scanner;

public class SchoolHall_Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double l = scan.nextDouble();
        double w = scan.nextDouble();

        l = l*100;
        w = w*100;

        l = l - 100;
        int hp =  (int)(l / 120);
        int wp = (int)(w / 70);

        System.out.println(hp * wp - 3);
    }
}
