package tema11;

import tema10.UtilSelect;
import java.io.IOException;

public class AppInsertion {
    public static void main(String[] args) throws IOException {
        int[] arr = UtilInsetion.input();
        UtilSelect.print(arr);
        UtilSelect.selectSort(arr);
        UtilSelect.print(arr);
    }
}
