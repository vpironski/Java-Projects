package straho_tony_oop;

import java.util.Scanner;

public class Ex2 {
    static int num,sum;
    static boolean flag;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        sum = 1;

        while(!flag){
            System.out.println(sum);
            sum = sum*2+1;
            if(sum > num){
                flag = true;
            }
        }
    }
}
