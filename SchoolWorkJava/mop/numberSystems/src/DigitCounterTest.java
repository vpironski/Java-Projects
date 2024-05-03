import java.util.*;
public class DigitCounterTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DigitCounter.intParser();

        int num = scan.nextInt();
        DigitCounter.parserRecursion(num);

    }
}