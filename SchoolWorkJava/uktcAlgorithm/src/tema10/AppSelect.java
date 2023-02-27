package tema10;
import java.io.IOException;

public class AppSelect {
    public static void main(String[] args) throws IOException {
        int[] arr = UtilSelect.input();
        UtilSelect.print(arr);
        UtilSelect.selectSort(arr);
        UtilSelect.print(arr);
    }
}
