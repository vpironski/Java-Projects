import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class QuickSort {
    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
    static void sort(int[] array){

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        int[] array = new Random().ints(size, 1, 100).toArray();
        sort(array);
    }
}
