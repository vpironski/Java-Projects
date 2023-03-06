package tema15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class UtilMerge {
    public static int[] input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        return new Random().ints(size, 1, 100).toArray();
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void merge(int[]array, int left,int middlePoint, int right){

        int n1 = middlePoint - left + 1;
        int n2 = right - middlePoint;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[middlePoint + 1 + j];
        }


        int i = 0, j = 0;
        int k = left;

        while( i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }
            else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < n2){
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    public static void sort(int[] array, int left, int right) {
        if(left < right){
            int middlePoint = (left + right) / 2;

            sort(array, left, middlePoint);
            sort(array,middlePoint + 1, right);

            merge(array, left, middlePoint, right);
        }
    }
}
