package company;
import java.util.Scanner;
public class task_0206_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxColumn = -1;
        for (int j = 0; j < columns; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxColumn = j;
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.println(matrix[i][maxColumn]);
        }
    }
}
