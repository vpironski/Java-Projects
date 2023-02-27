package ivelin_20534;

import java.util.Scanner;

public class Operations_Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        double sum;
        String choice = scan.next();


        switch (choice) {
            case "+":
                sum = num1 + num2;
                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %.2f - even", num1, choice, num2, sum);
                } else {
                    System.out.printf("%d %s %d = %.2f - odd", num1, choice, num2, sum);
                }
                break;
            case "-":
                sum = num1 - num2;
                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %.2f - even", num1, choice, num2, sum);
                } else {
                    System.out.printf("%d %s %d = %.2f - odd", num1, choice, num2, sum);
                }
                break;
            case "*":
                sum = num1 * num2;
                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %.2f - even", num1, choice, num2, sum);
                } else {
                    System.out.printf("%d %s %d = %.2f - odd", num1, choice, num2, sum);
                }
                break;
            case "/":
                if(num2 == 0 ){
                    System.out.printf("Cannot divide %d by zero",num1);
                }
                else{
                    sum = num1 / num2;
                    System.out.printf("%d %s %d = %.2f", num1, choice, num2, sum);
                }
                break;
            case "%":
                if(num2 == 0){
                    System.out.printf("%d %s %d = NaN", num1, choice, num2);
                }
                sum = num1 % num2;
                System.out.printf("%d %s %d = %.2f", num1, choice, num2, sum);
                break;
        }
    }
}
