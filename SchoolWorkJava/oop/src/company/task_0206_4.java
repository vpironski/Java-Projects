package company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class task_0206_4 {
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

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] % 2 == 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
    }
}
}

