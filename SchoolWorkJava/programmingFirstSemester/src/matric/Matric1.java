package matric;
import java.util.Arrays;
import java.util.Scanner;

public class Matric1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input;
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][]matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                input = scan.nextInt();
                matrix[i][j] = input;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}
