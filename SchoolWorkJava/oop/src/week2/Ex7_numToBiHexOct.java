package week2;

import java.util.Scanner;

public class Ex7_numToBiHexOct {
    static void decimalToBinary(int num)
    {
        System.out.println(Integer.toBinaryString(num));
    }

    static void decimalToHex(int num){
        System.out.println(Integer.toHexString(num));

    }
    static void decimalToOctal(int num){
        System.out.println(Integer.toOctalString(num));
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        decimalToBinary(num);
        decimalToHex(num);
        decimalToOctal(num);
    }
}
