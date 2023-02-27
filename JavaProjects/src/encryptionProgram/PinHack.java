package encryptionProgram;
import java.util.*;

import java.util.Arrays;

public class PinHack {

    private int pin;
    private int hashPin;
    private String afterArr;
    private int fourthDigit;
    private int third;
    private int thirdDigit;
    private int second;
    private int secondDigit;
    private int first;
    private int firstDigit;


    PinHack(){
        Hash();
        Brake();
    }

    private void Hash(){
        System.out.println("Enter a pin to be broken: ");
        pin =  new Scanner(System.in).nextInt();

        fourthDigit = (pin % 10)*7 + 9;
        third = pin/10;

        thirdDigit = (third % 10)*2+13;
        second = third/10;


        secondDigit = (second % 10)* 9 + 13;
        first = second/10;


        firstDigit = (first % 10)* 4 + 8;


        int [] hashArray = {firstDigit, secondDigit, thirdDigit, fourthDigit};
        afterArr = Arrays.toString(hashArray).replaceAll("\\[|\\]|,|\\s", "");
        hashPin = Integer.parseInt(afterArr);


    }

    private void Brake(){
        System.out.println();
        System.out.println("Pin has successfully been hashed.");
        System.out.println("Start cracking the password.");
        System.out.println("Calculating...");
        System.out.println("***********************************");
        System.out.println();


        for (int i = 813138; i < Integer.MAX_VALUE; i++) {
            if(i == hashPin){
                System.out.println("Cracking complete.");
                System.out.println("This is the hash of your pin.");
                System.out.println(i);
                break;
            }

        }

    }


}
