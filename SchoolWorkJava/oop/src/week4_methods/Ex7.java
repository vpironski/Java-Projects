package week4_methods;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ex7 {
    public static void frequncy(int[]array){
        int max = 0;
        int value = 0;
        HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            table.put(array[i],0);
        }

        for (int i = 0; i < array.length; i++) {
            if(table.containsKey(array[i])){
                table.put(array[i], table.get(array[i]) + 1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(max < table.get(array[i])){
                max = table.get(array[i]);
            }
        }
        for (Entry<Integer, Integer> entry: table.entrySet()) {
            if(value == entry.getValue()){
                value = entry.getKey();
            }
        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[]array = new int [n];
        for (int i = 0; i < n; i++) {
            int input = scan.nextInt();
            array[i] = input;
        }
        frequncy(array);
    }
}
