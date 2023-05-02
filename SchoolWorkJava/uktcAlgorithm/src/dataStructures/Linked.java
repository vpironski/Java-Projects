package dataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class Linked {
    public static void addNumber(LinkedList<Integer> numbers, int index, int num){
        numbers.add(index, num);
    }
    public static void addNumber(LinkedList<Integer> numbers, int num){
        numbers.add(num);
    }
    public static void removeByIndex(LinkedList<Integer> numbers, int index){
        numbers.remove(index);
    }
    public static void removeByValue(LinkedList<Integer> numbers, int num){
        numbers.remove(numbers.indexOf(num));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> numbers = new LinkedList<>();
        int index, num, input;

        System.out.println("Welcome to the Linked List program");
        System.out.println("**********************************");
        System.out.println("1. Add element by index");
        System.out.println("2. Add element by value");
        System.out.println("3  Remove element by index.");
        System.out.println("4. Remove element by value");
        System.out.println("5. Add element at the end");
        System.out.println("6. Add element at the beginning");
        System.out.println("7. Remove first element");
        System.out.println("8. Remove last element");
        System.out.println("9. Output the list");
        System.out.println("10. Quit");
        System.out.println("**********************************");


        System.out.print(": ");
        input = Integer.parseInt(reader.readLine());
        if(input == 10){
            System.out.println("Thank you for the participation");
        }
        while(input != 10){
            switch (input){
                case 1:
                    System.out.print("Input index: ");
                    index = Integer.parseInt(reader.readLine());
                    System.out.print("Input value: ");
                    num = Integer.parseInt(reader.readLine());
                    addNumber(numbers, index, num);
                    break;

                case 2:
                    System.out.print("Input number: ");
                    num = Integer.parseInt(reader.readLine());
                    addNumber(numbers,num);
                    break;

                case 3:
                    System.out.print("Input index: ");
                    index = Integer.parseInt(reader.readLine());
                    removeByIndex(numbers,index);
                    break;

                case 4:
                    System.out.print("Input value: ");
                    num = Integer.parseInt(reader.readLine());
                    removeByValue(numbers, num);
                    break;

                case 5:
                    System.out.print("Input value: ");
                    num = Integer.parseInt(reader.readLine());
                    numbers.addFirst(num);
                    break;

                case 6:
                    System.out.print("Input value: ");
                    num = Integer.parseInt(reader.readLine());
                    numbers.addLast(num);
                    break;

                case 7:
                    System.out.print("Input value: ");
                    num = Integer.parseInt(reader.readLine());
                    numbers.removeFirst();
                    break;

                case 8:
                    System.out.print("Input value: ");
                    num = Integer.parseInt(reader.readLine());
                    numbers.removeLast();
                    break;

                case 9:
                    System.out.print("The List is: ");
                    System.out.println(numbers);

            }
            System.out.print(": ");
            input = Integer.parseInt(reader.readLine());
            if(input == 10){
                System.out.println("Thank you for the participation");
            }
        }
    }
}