package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers);

        numbers.add(6);
        System.out.println(numbers);

        System.out.println(numbers.get(3));

        numbers.set(3,12);
        System.out.println(numbers);

        numbers.remove(3);
        System.out.println(numbers);

        System.out.println("FOR: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("Index: %d   Number %d \n", i, numbers.get(i));
        }


        System.out.println("FOR-EACH: ");
        for ( int i : numbers) {
           System.out.printf("Number %d \n", i);
        }
    }
}
