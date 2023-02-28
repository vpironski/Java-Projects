package week4_homework;

import java.util.HashMap;
import java.util.Random;
import java.util.Map.Entry;


public class Ex1 {
    public static void main(String[] args) {
        HashMap<String, int[]> students = new HashMap<String, int[]>();

        students.put("Vihren", new Random().ints((int) (Math.random() * (10)), 2, 6).toArray());
        students.put("Deaian", new Random().ints((int) (Math.random() * (10)), 2, 6).toArray());
        students.put("Dani", new Random().ints((int) (Math.random() * (10)), 2, 6).toArray());
        students.put("Kami", new Random().ints((int) (Math.random() * (10)), 2, 6).toArray());
        for (Entry<String, int[]> entry : students.entrySet()) {
            System.out.print(entry.getValue().toString());
            System.out.print(", ");
        }
    }
    }
