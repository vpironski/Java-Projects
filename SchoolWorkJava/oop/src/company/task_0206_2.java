package company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class task_0206_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if(map.containsKey(input[i])){
                map.replace(input[i],map.get(input[i]), map.get(input[i]) + 1);
            }
            else{
                map.put(input[i],1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
    }
}
