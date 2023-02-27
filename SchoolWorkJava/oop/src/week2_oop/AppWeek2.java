package week2_oop;

import java.util.Arrays;
import java.util.Scanner;

public class AppWeek2 {
    static void Ex1(){
        int[] numbers = {2,3,4,1,5,3,2,1,5};
        String[] words = {"Hi", "Jackass", "Dont know", "Kekw"};
        Arrays.sort(numbers);
        Arrays.sort(words);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(words));
    }

    static void Ex2(){
        int[] numbers = {2,3,4,1,5,3,2,1,5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    static void Ex3(){
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print("- ");
            }
        }

    }

    static void Ex4(){
        int[] numbers = {2,3,4,1,5,3,2,1,5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum/numbers.length);
    }

    static void Ex5(){
        System.out.println("What are u searching: ");
        int[] numbers = {2,3,4,1,6,7,8,123,5};
        int num = new Scanner(System.in).nextInt();
        boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == num){
                System.out.println("WE FOUND IT");
                System.out.printf("Its on index %d and its %d",i,num);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("SORRY NO CAN DO!");
        }
    }

    static void Ex7(){
        int[] numbers = {2,3,4,1,6,7,8,123,5};
        int num = new Scanner(System.in).nextInt();
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                counter++;
            }
        }
        int[] temp = new int[numbers.length-counter];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == num){
                continue;
            }
            numbers[i] = temp[i];
        }
        numbers = temp;
    }

    public static void main(String[] args) {
        Ex7();
    }
}
