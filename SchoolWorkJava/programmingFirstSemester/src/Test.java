import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int [100];
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.println(arr[i + 1]);
                break;
            }
        }
        if (flag){
            System.out.println(arr[0]);
        }
    }
}
