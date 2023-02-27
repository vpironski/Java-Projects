package ivelin_20534;

import java.util.Objects;
import java.util.Scanner;

public class TransfportPrice_Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String dayNight = scan.next();
        double priceForKm;
        double price = 0.00;

        if (num < 20){
            price = 0.70;
            if (dayNight.equals("day")){
                priceForKm = 0.79;
            }
            else{
                priceForKm = 0.90;
            }
        }
        else if (num < 100){
            priceForKm = 0.09;
        }
        else {
            priceForKm = 0.06;
        }

        price += num * priceForKm;
        System.out.printf("%.2f",price);
    }
}
