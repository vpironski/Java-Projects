package company;

import java.util.Random;

public class task_0206_1 {
    public static void main(String[] args) {
        int[] nums = new Random().ints(10, 1, 100).toArray();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
