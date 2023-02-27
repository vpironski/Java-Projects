package tema9;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        int[] arr1 = Util.input();
        int[] arr2 = Util.input();

        Util.print(arr1);
        Util.print(arr2);

        Util.BS_sort_FF(arr1);
        Util.BS_sort_DW(arr2);

        Util.print(arr1);
        Util.print(arr2);

    }

}
