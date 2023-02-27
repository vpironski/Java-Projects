package tema5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class maxElementArray {
    static int n;
    static int bound;
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.print("Input number of elements: ");
        n = scan.nextInt();
        System.out.print("Input the bound of the elements: From 1 to ");
        bound = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(bound+1);
        }
        System.out.println(Arrays.toString(array));

        int currentMax = array[0];
        for (int currElement: array) {
            if (currElement>currentMax){
                currentMax = currElement;
            }
        }
        System.out.printf("Biggest element is: %d", currentMax);
    }
}