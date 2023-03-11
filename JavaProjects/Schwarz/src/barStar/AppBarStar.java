package barStar;

import java.util.Arrays;
import java.util.Scanner;

public class AppBarStar {
    static int wineDelive, wineOrder, beerDelive, beerOrder;
    static int wine = 300;
    static int beer = 200;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        while(!input.equals("END")){
            String[] order =  input.split(":\\s+");
            String drick = order[0];
            int number = Integer.parseInt(order[1]);
            if(drick.equals("Wines")){
                if(number > 0){
                    wine += number;
                    wineDelive ++;
                }
                else if (number < 0) {
                    wine += number;
                    wineOrder++;
                }
            }
            else if(drick.equals("Beers")){
                if(number > 0){
                    beer += number;
                    beerDelive ++;
                }
                else if (number < 0) {
                    beer += number;
                    beerOrder++;
                }
            }
            input = scan.nextLine();
        }

        System.out.printf("Wines: %d \n" +
                "Deliveries: %d \n" +
                "Orders: %d \n" +
                "Beers: %d \n" +
                "Deliveries: %d \n" +
                "Orders: %d \n",wine, wineDelive, wineOrder, beer, beerDelive, beerOrder);

    }
}
