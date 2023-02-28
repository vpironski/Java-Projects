package week1_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int backwardsDigit;
        int digit = scan.nextInt();

        int fifthDigit = digit % 10;
        int fourth = digit / 10;

        int fourthDigit = fourth % 10;
        int third = fourth/10;

        int thirdDigit = third % 10;
        int second = third/10;


        int secondDigit = second % 10;
        int first = second/10;


        int firstDigit = first % 10;

        int [] Array = {fifthDigit, fourthDigit, thirdDigit, secondDigit, firstDigit};
        String afterArr = Arrays.toString(Array).replaceAll("\\[|\\]|,|\\s", "");
        backwardsDigit = Integer.parseInt(afterArr);


        System.out.println(backwardsDigit);

    }
}
