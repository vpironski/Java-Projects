package week2;


import java.util.Scanner;

public class Ex4_reverse {
    static int input;
    static int reverse;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
        reverse = reverseNumber(input);
        System.out.println( reverse);
    }

    public static int reverseNumber(int input){

        boolean isNoNegative = Ex4_reverse.input < 0 ? true : false;
        if(isNoNegative)
        {
            Ex4_reverse.input = Ex4_reverse.input * -1;
        }

        int reverse = 0;
        int lastDigit = 0;

        while (Ex4_reverse.input >= 1)
        {
            lastDigit = Ex4_reverse.input % 10;
            reverse = reverse * 10 + lastDigit;
            Ex4_reverse.input = Ex4_reverse.input / 10;
        }
        return reverse;
    }

}
