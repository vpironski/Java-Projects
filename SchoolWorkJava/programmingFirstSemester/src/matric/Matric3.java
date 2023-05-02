package matric;

import java.util.Arrays;
import java.util.Scanner;

public class Matric3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();
        String input;
        int[] nums = new int[cols];
        int[][]matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            input = scan.nextLine();
            String[] col = input.split(" ");
            for (int j = 0; j < cols; j++) {
                nums[j] = Integer.parseInt(col[j]);
            }
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = nums[j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
