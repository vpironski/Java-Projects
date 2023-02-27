package tema7;


import java.util.Scanner;

public class GreedyAlgorithm {
    static int[] nominals = {50,20,10,5};
    static int[] statistic = {0,0,0,0};
    static double sum;
    static int index = 0;
    static int count = 0;
    static boolean flag;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        sum = scan.nextDouble() * 100;
        System.out.println(sum);

        while (!flag){

            if (sum >= nominals[index]){
                sum = sum - nominals[index];
                statistic[index] ++;
                System.out.println(sum);
                count++;
            }
            else{
                index++;
            }

            if(index > nominals.length-1){
                flag = true;
            }
        }
        System.out.printf("It took %d times\n",count);
        for (int i = 0; i < statistic.length; i++) {
            System.out.printf("It took %d: %d \n",nominals[i],statistic[i]);
        }
    }

}
