package week4_methods;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static double meridian(double[] array){
        double sum = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mer = sum/array.length;
        return mer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int n = scan.nextInt();
        double [] array =  new double[n];
        for (int i = 0; i < n; i++) {
            int input =  scan.nextInt();
            array[i] = input;
        }
        System.out.println(meridian(array));
    }


}
