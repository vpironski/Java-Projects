package company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task_0206_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        char[] myString = input.toCharArray();

        for (int i = 0; i < myString.length - 5; i++) {
            myString[i] = '*';
        }
        String str = String.valueOf(myString[0]);
        for (int i = 1; i < myString.length; i++) {
            str = str + myString[i];
        }
        System.out.println(str);
    }
}
