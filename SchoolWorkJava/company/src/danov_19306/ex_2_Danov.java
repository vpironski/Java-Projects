package danov_19306;

import java.util.Scanner;

public class ex_2_Danov {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the points: ");
        int input = scan.nextInt();

        if(input >= 1 && input <= 3){
            input *= 10;
            System.out.printf("points: %d",input);
        }
        else if(input >= 4 && input <= 6){
            input *= 100;
            System.out.printf("points %d",input);
        }
        else if(input >= 7 && input <= 9){
            input *= 1000;
            System.out.printf("points %d",input);
        }
        else{
            System.out.println("Error: невалиден резултат");
        }


    }
}
