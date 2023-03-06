package tema15;

import java.io.IOException;

public class AppMerge {
    public static void main(String[] args) throws IOException {
        int[] array = UtilMerge.input();
        UtilMerge.print(array);
        UtilMerge.sort(array,0,array.length - 1);
        UtilMerge.print(array);
    }
}
