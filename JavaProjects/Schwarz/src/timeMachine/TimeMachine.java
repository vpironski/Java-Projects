package timeMachine;

import java.util.*;

public class TimeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int day = scan.nextInt();
        boolean isLeapYear;
        int[] daysInMonths = new int[12];
        if(year > 1916){
            isLeapYear = (year % 4 == 0 && year % 100 != 0) && (year % 400 != 0);
        }else{
            isLeapYear = (year % 4 == 0);
        }
        boolean change = false;
        if(year == 1916){
            daysInMonths = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            change = true;
        }else{
            int februaryDays = isLeapYear ? 29 : 28;
            daysInMonths = new int[]{31, februaryDays, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        }


        int currentMonth = 0;

        while (day > daysInMonths[currentMonth]) {
            day -= daysInMonths[currentMonth];
            currentMonth++;
        }
        if(change && currentMonth >= 3){
            day += 13;
        }

        String formattedDay = String.format("%02d", day);
        String formattedMonth = String.format("%02d", currentMonth + 1);

        System.out.println(formattedDay + "." + formattedMonth + "." + year);
    }

}

