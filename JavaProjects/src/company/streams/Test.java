package company.streams;

import java.util.*;
import java.util.stream.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.set(0, 12);
        System.out.println(numbers);

        List<Integer> cubed = numbers.stream().map(x -> x*x*x).collect(Collectors.toList());
        System.out.println(cubed);

        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i)*numbers.get(i)*numbers.get(i));
        }
        System.out.println(numbers);
    }

}
