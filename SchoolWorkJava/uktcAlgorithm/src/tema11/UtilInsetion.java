package tema11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import Utillity.UtilMethods;

public class UtilInsetion {

    public static int[] input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input the numbers of elements in the array: ");
        int size = Integer.parseInt(reader.readLine());
        return new Random().ints(size, 1, 100).toArray();
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = i;
            while(j > 0 && array[j-1]>array[j]){
                UtilMethods.swap(array,array[j],array[j-1]);
               j--;
            }
        }
    }
}
