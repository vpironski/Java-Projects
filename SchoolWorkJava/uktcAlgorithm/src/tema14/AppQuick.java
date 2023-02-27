package tema14;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppQuick {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input the numbers of elements in the array: ");
        int size = Integer.parseInt(reader.readLine());

        int[] arr = UtiIQuick.input(size);
        UtiIQuick.print(arr);
        UtiIQuick.quickSort(arr,0,size-1);
        UtiIQuick.print(arr);
    }
}
