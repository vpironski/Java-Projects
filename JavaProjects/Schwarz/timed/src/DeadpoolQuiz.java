import java.util.*;
public class DeadpoolQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 100, min = 50, counter = 0;
        int randNum = min + (int)(Math.random() * ((max - min) + 1));
        boolean flag = true;

        while(flag){
            int input = scan.nextInt();

            if(input < randNum){
                System.out.println("low");
                counter++;
            } else if (input>randNum) {
                System.out.println("high");
                counter++;

            } else{
                System.out.println("Correct, attempts = " + counter);
                flag = false;
            }
        }
    }
}
