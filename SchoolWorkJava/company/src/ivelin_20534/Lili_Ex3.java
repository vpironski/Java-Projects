package ivelin_20534;

import java.util.Scanner;

public class Lili_Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        double price = scan.nextDouble();
        int toyPrice = scan.nextInt();
        double budget = 0;
        int budgetCounter = 1;
        int toyCounter = 0;
        double diff = 0.00;
        int brotherMoney = 0;
        for (int i = 1; i <= age; i++) {
            if(i % 2 == 0){
                budget += 10 * budgetCounter;
                budgetCounter++;
                brotherMoney ++;
            }
            else{
                toyCounter++;
            }
        }
        budget += toyCounter * toyPrice - brotherMoney;

        if(budget >= price){
            diff = budget - price;
            System.out.printf("Yes!%.2f",diff);
        }
        else{
            diff = price - budget;
            System.out.printf("No!%.2f",diff);
        }
    }
}
