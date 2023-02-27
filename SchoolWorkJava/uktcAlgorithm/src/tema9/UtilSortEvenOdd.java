package tema9;

import java.util.ArrayList;
import java.util.Random;
public class UtilSortEvenOdd {


    static void separateEvenOdd(int[] arr, ArrayList<Integer> evenList, ArrayList<Integer> oddList) { // tehnicheski poglednato arraylist e masiv otdolu
        for (int num : arr) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
    }

    static void sortEven(ArrayList<Integer> evenList) {
        for (int i = 0; i < evenList.size(); i++) {
            for (int j = 0; j < evenList.size(); j++) {
                if (evenList.get(i) < evenList.get(j)) {
                    int temp = evenList.get(i);
                    evenList.set(i, evenList.get(j));
                    evenList.set(j, temp);
                }
            }
        }
    }

    static void sortOdd(ArrayList<Integer> oddList) {
        for (int i = 0; i < oddList.size(); i++) {
            for (int j = 0; j < oddList.size(); j++) {
                if (oddList.get(i) > oddList.get(j)) {
                    int temp = oddList.get(i);
                    oddList.set(i, oddList.get(j));
                    oddList.set(j, temp);
                }
            }
        }
    }
}