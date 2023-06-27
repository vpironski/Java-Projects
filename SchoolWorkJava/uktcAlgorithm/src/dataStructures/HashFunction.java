package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("String input (Enter: terminate, to terminate the program): ");
            String input = buffer.readLine();
            if (input.equals("terminate")) {
                break;
            }
            char[] charString = input.toCharArray();

            int idx = 0;
            int base = 34;
            int power = 0;
            int HashCode = 0;
            int ascii = 0;
            int koef;

            for (int i = 0; i < charString.length; i++) {
                System.out.print(charString[i] + " ");
                power = charString.length - (i + 1);
                koef = (int) Math.pow(base, power);
                ascii = charString[i];
                System.out.println("Ascii : " + ascii + "* koef " + koef + " = " + ascii * koef);
                HashCode = HashCode + (ascii * koef);
            }

            idx = HashCode % 10;
            System.out.println("\nIndex of element is : " + idx);
        }
    }
}
