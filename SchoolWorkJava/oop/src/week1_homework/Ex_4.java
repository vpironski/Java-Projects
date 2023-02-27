package week1_homework;

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String snumber = "";

        if(number == 0){
            snumber = "zero";
        }

        else if(number == 10){
            snumber = "ten";
        }
        else if(number == 11){
            snumber = "eleven";
        }
        else if(number == 12){
            snumber = "twelve";
        }
        else if(number == 13){
            snumber = "thirteen";
        }
        else if(number == 14){
            snumber = "fourteen";
        }
        else if(number == 15){
            snumber = "fifteen";
        }
        else if(number == 16){
            snumber = "sixteen";
        }
        else if(number == 17){
            snumber = "seventeen";
        }
        else if(number == 18){
            snumber = "eighteen";
        }
        else if(number == 19){
            snumber = "nineteen";
        }
        else if(number == 100){
            snumber = "a hundred";
        }

        else if ((number % 100) / 10==2){
            snumber += "twenty ";
        }
        else if ((number % 100) / 10==3){
            snumber += "thirty ";
        }
        else if ((number % 100) / 10==4){
            snumber += "fourty ";
        }
        else if ((number % 100) / 10==5){
            snumber += "fifty ";
        }
        else if ((number % 100) / 10==6){
            snumber += "sixty ";
        }
        else if ((number % 100) / 10==7){
            snumber += "seventy ";
        }
        else if ((number % 100) / 10==8){
            snumber += "eighty ";
        }
        else if ((number % 100) / 10==9){
            snumber += "ninety ";
        }


        if (number % 10 ==  1){
            snumber += "one";
        }
        else if (number % 10 ==2){
            snumber += "two";
        }
        else if (number % 10 ==3){
            snumber += "three";
        }
        else if (number % 10 ==4){
            snumber += "four";
        }
        else if (number % 10 ==5){
            snumber += "five";
        }
        else if (number % 10 ==6){
            snumber += "six";
        }
        else if (number % 10 ==7){
            snumber += "seven";
        }
        else if (number % 10 ==8){
            snumber += "eight";
        }
        else if (number % 10 ==9){
            snumber += "nine";
        }

        System.out.println(snumber);

    }
}
