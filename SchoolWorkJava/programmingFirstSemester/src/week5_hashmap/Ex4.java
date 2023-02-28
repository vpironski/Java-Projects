package week5_hashmap;

import java.util.*;

public class Ex4 {
    static int most = 0;
    static int modeN = -1;
    public static int mostOften(int[]arr){
        HashMap<Integer,Integer> statistic = new HashMap<>();
        for (int i: arr) {
            if(!statistic.containsKey(i)){
                statistic.put(i,0);
            }
            int occurance = statistic.get(i);
            occurance++;
            statistic.put(i,occurance);
        }
        for (int i: statistic.keySet()) {
            if(statistic.get(i) > most){
                modeN = i;
                most = statistic.get(i);
            }
        }
        return modeN;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] myArray = new Random().ints(n,1,50).toArray();

        String word = String.valueOf(n);
        System.out.println(mostOften(myArray));

    }

}
