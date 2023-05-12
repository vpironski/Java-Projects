package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Dictionaries {
    static boolean flag = false;
    static String input;
    static int choice;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Dictionary<Integer, String> months = new Hashtable<>();

        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");

        System.out.println("Get month by key (1) / value (2)");
        choice = Integer.parseInt(reader.readLine());

        if(choice == 1){
            System.out.println("Too see the value, type the number of the month you wish to check");
            System.out.println("If you want to terminate the program, type '0'");
            while (!flag){
                input = reader.readLine();

                switch (input){
                    case "1":
                        System.out.printf("The value of %d is: %s \n", 1, months.get(1));
                        break;

                    case "2":
                        System.out.printf("The value of %d is: %s \n", 2, months.get(2));
                        break;

                    case "3":
                        System.out.printf("The value of %d is: %s \n", 3, months.get(3));
                        break;

                    case "4":
                        System.out.printf("The value of %d is: %s \n", 4, months.get(4));
                        break;

                    case "5":
                        System.out.printf("The value of %d is: %s \n", 5, months.get(5));
                        break;

                    case "6":
                        System.out.printf("The value of %d is: %s \n", 6, months.get(6));
                        break;

                    case "7":
                        System.out.printf("The value of %d is: %s \n", 7, months.get(7));
                        break;

                    case "8":
                        System.out.printf("The value of %d is: %s \n", 8, months.get(8));
                        break;

                    case "9":
                        System.out.printf("The value of %d is: %s \n", 9, months.get(9));
                        break;

                    case "10":
                        System.out.printf("The value of %d is: %s \n", 10, months.get(10));
                        break;

                    case "11":
                        System.out.printf("The value of %d is: %s \n", 11, months.get(11));
                        break;

                    case "12":
                        System.out.printf("The value of %d is: %s \n", 12, months.get(12));
                        break;

                    case "0":
                        flag = true;
                        break;
                }
            }
        }

        else if(choice == 2){
            Enumeration <Integer> keys = months.keys();
            Enumeration <String> values = months.elements();

            System.out.println("If you want to terminate the program, type '0'");
            System.out.println("Choose a month: ");
            input = reader.readLine();

            while(keys.hasMoreElements()){

                String currentKey = keys.nextElement().toString();
                String currentValue = values.nextElement();
                if(currentValue.equals(input)){
                    System.out.println(currentKey);
                }
            }
        }



    }
}
