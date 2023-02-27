package tema9;

import java.util.ArrayList;
import java.util.Random;

public class AppHomework {
    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 1, 100).toArray();
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        UtilSortEvenOdd.separateEvenOdd(arr, evenList, oddList);
        UtilSortEvenOdd.sortEven(evenList);
        UtilSortEvenOdd.sortOdd(oddList);
        System.out.println(evenList);
        System.out.println(oddList);
    }
}
