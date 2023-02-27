import java.util.Random;

public class RandomSearch {
    static int input;
    static int[] array = new int[10];
    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            input = random.nextInt(100);
            array[i] = input;
            System.out.println(array[i]);
        }
        //undone

    }
}
