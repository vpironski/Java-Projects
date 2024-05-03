package moev_oop;

public class tomov {
    public static int biggestNum(int[] array){
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int diagonal(int[][] matrix){
        int sum = 0;
        int j = matrix.length-1;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][j];
            j--;
        }
        return sum;
    }
}
