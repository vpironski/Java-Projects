package tema14;


import java.util.Arrays;
import java.util.Random;
import Utillity.UtilMethods;
public class UtiIQuick {

    public static int[] input(int size){
        return new Random().ints(size, 1, 100).toArray();
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int part(int[] array, int low, int high) {
        int pivot = array[high];
        int index = low - 1;
        for (int i = low; i < high; i++) {

            if (array[i] <= pivot) {
                index++;
                UtilMethods.swap(array,i, index);
            }

        }
        UtilMethods.swap(array,index + 1,high);
        return index + 1;

    }

    public static void quickSort(int[] array, int low, int high){
        if(low < high){
            int pi = part(array, low, high);
            quickSort(array, low, pi-1);
            quickSort(array, pi+1, high);
        }
    }
}

