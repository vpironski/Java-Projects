import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the filter key: ");
        int key = scan.nextInt();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int[] result = ArrayProblems.sortAndFilter(array, key);
        System.out.println(Arrays.toString(result));
    }

}