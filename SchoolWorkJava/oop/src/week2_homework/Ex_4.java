package week2_homework;

import java.util.Scanner;

public class Ex_4 {
    static Integer num;
    static int counterOne, counterTwo, counterThree,
            counterFour, counterFive, counterSix,
            counterSeven, counterEight, counterNine,
            counterZero;
//    static int counter;
    static String str;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        num = scan.nextInt();
        str = num.toString();
        int [] number = new int[str.length()];
        
        int j = 0;
        while(j < str.length()){
            number[j]=num%10;
            num/=10;
            j++;
        }

        for (int i = 0; i < str.length(); i++) {
            switch (number[i]){
                case 0:
                    counterZero++;
                    break;
                case 1:
                    counterOne++;
                    break;
                case 2:
                    counterTwo++;
                    break;
                case 3:
                    counterThree++;
                    break;
                case 4:
                    counterFour++;
                    break;
                case 5:
                    counterFive++;
                    break;
                case 6:
                    counterSix++;
                    break;
                case 7:
                    counterSeven++;
                    break;
                case 8:
                    counterEight++;
                    break;
                case 9:
                    counterNine++;
                    break;
            }
        }
        System.out.printf("Frequency of 0 = %d\n",counterZero);
        System.out.printf("Frequency of 1 = %d\n",counterOne);

        System.out.printf("Frequency of 2 = %d\n",counterTwo);
        System.out.printf("Frequency of 3 = %d\n",counterThree);

        System.out.printf("Frequency of 4 = %d\n",counterFour);
        System.out.printf("Frequency of 5 = %d\n",counterFive);

        System.out.printf("Frequency of 6 = %d\n",counterSix);
        System.out.printf("Frequency of 7 = %d\n",counterSeven);

        System.out.printf("Frequency of 8 = %d\n",counterEight);
        System.out.printf("Frequency of 9 = %d\n",counterNine);



    }
}
