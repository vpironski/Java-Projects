import java.util.*;

public class DigitCounter {
    private static long num;
    private static int revNum = 0;
    private static int sum = 0;
    private static int biggestDigit;
    public static void intParser(){
        Scanner scan = new Scanner(System.in);
        biggestDigit = Integer.MIN_VALUE;
        num = scan.nextInt();
        long temp = num;
        while(num != 0)
        {
            int remainder = (int)num % 10;
            revNum = revNum * 10 + remainder;
            num = num/10;
        }
        while(revNum != 0){
            sum += revNum % 10;
            if(revNum % 10 > biggestDigit){
                biggestDigit = revNum % 10;
            }
            System.out.print(revNum % 10 + " | ");
            revNum /= 10;
        }
        System.out.println(" ");
        countDigits(temp);
        System.out.println("\nSum: " + sum);
        System.out.println("biggestDigit Digit: " + biggestDigit);
    }

    public static void countDigits(long number) {
        int[] digitCount = new int[10];

        for (int i = 0; i < 10; i++) {
            digitCount[i] = 0;
        }

        while (number != 0) {
            int digit = (int)number % 10;
            digitCount[digit]++;
            number /= 10;
        }

        for (int i = 0; i < 10; i++) {
//            System.out.println(digitCount[i]);
            if (digitCount[i] > 0) {
                System.out.println("Digit " + i + " appears " + digitCount[i] + " times");
            }
        }
    }

    public static void parserRecursion(int num){
        if(num == 0){
            System.out.println("\n" + sum);
            return;
        }
        sum += num % 10;
        System.out.print(num % 10 + " | ");
        num /= 10;
        parserRecursion(num);
    }


}
