import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[3];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < 3; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println((Arrays.toString(arr)));
        boolean swap = true;

        while(swap) {
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
