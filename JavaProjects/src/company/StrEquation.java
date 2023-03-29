package company;

import java.util.ArrayList;
import java.util.HashMap;

public class StrEquation {
    public static String equation(String str){
        HashMap<String, Integer> table = new HashMap<>();
        table.put("zero", 0);
        table.put("one", 1);
        table.put("two", 2);
        table.put("three", 3);
        table.put("four", 4);
        table.put("five", 5);
        table.put("six", 6);
        table.put("seven", 7);
        table.put("eight", 8);
        table.put("nine", 9);

        HashMap<Character, String> reverse = new HashMap<>();
        reverse.put('0', "zero");
        reverse.put('1', "one");
        reverse.put('2', "two");
        reverse.put('3', "three");
        reverse.put('4', "four");
        reverse.put('5', "five");
        reverse.put('6', "six");
        reverse.put('7', "seven");
        reverse.put('8', "eight");
        reverse.put('9', "nine");

        StringBuffer buffer = new StringBuffer();
        ArrayList<String> word = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            buffer.append(str.charAt(i));

            if(table.containsKey(buffer.toString())){
                word.add(buffer.toString());
                buffer.setLength(0);
            }
            else if(buffer.toString().equals("plus")){
                word.add(buffer.toString());
                buffer.setLength(0);
            }
            else if(buffer.toString().equals("minus")) {
                word.add(buffer.toString());
                buffer.setLength(0);
            }
        }

        for (int i = 0; i < word.size(); i++) {
            if(table.containsKey(word.get(i))){
                word.set(i,String.valueOf((table.get(word.get(i)))));
            }
            else if(word.get(i).equals("plus")){
                word.set(i,"+");
            }
            else if(word.get(i).equals("minus")){
                word.set(i,"-");
            }
        }
        String expression = "";
        int result = 0;
        String finalResult = "";
        for (int i = 0; i < word.size(); i++) {
            expression += word.get(i);
        }
        String[] nums = expression.split("[\\+\\-\\*/]");
        char op = expression.charAt(nums[0].length());
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);

        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        }
        else {
            System.out.println("Invalid operator!");
        }

        for (int i = 0; i < String.valueOf(result).length(); i++) {
            finalResult += reverse.get(String.valueOf(result).charAt(i));

        }
        return finalResult;

    }

    public static void main(String[] args) {
        System.out.println(equation("onezeropluseight"));
    }
}
