import java.util.*;

public class ArrayProblems
{
    public static int[] sortAndFilter(int[] array, int key)
    {
        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);

        int count = 0;
        for (int i = 0; i < copyArray.length; i++) {
            if (copyArray[i] <= key) {
                count++;
            }
        }

        int[] result = new int[count];
        int resultIndex = 0;

        for (int i = 0; i < copyArray.length; i++) {
            if (copyArray[i] <= key) {
                result[resultIndex] = copyArray[i];
                resultIndex++;
            }
        }

        return result;
    }


}
