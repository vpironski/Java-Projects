package tema3;

import java.util.ArrayList;
import java.util.Scanner;

public class Goat_Wolf_Cabbage {
    static ArrayList<String> leftSide = new ArrayList<>();
    static ArrayList<String> rightSide = new ArrayList<>();
    static String goat,wolf,cabbage;

    static int counter = 0;
    static boolean flagWolf = false;
    static boolean flagCabbage = false;




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose between wolf and cabbage");
        String choice = scan.nextLine();

        leftSide.add("goat");
        leftSide.add("wolf");
        leftSide.add("cabbage");


        while (counter < 7){
            goat = leftSide.remove(0);
            rightSide.add(goat);
            System.out.println("1) The boat goes to the right with the goat.");
            counter++;
            System.out.println("2) The boat returns to the left empty.");
            counter++;

            if (choice.equals("wolf")) {
                wolf = leftSide.remove(0);
                rightSide.add(wolf);

                flagWolf = true;
            }
            else if (choice.equals("cabbage")){
                cabbage = leftSide.remove(1);
                rightSide.add(cabbage);

                flagCabbage = true;

            }
            System.out.printf("3) Boat goes to right with %s", choice);
            counter++;
            System.out.println();

            if ((rightSide.contains(goat)&& rightSide.contains(wolf))|| (rightSide.contains(goat) && rightSide.contains(cabbage))) {
                goat = rightSide.remove(0);
                leftSide.add(goat);
                System.out.println("4) Boat goes left with goat");
                counter ++;

            }
            if (!(leftSide.contains(goat)&& leftSide.contains(wolf))|| (leftSide.contains(goat) && leftSide.contains(cabbage))){
                if (!flagWolf) {
                    wolf = leftSide.remove(0);
                    rightSide.add(wolf);
                    System.out.println("5) Boat goes to right with wolf");
                    counter ++;
                }
                else if (!flagCabbage) {
                     cabbage = leftSide.remove(0);
                    rightSide.add(cabbage);
                    System.out.println("5) Boat goes to right with cabbage");
                    counter++;
                }
                System.out.println("6) Boat returns to left side empty");
                counter ++;
                goat = leftSide.remove(0);
                rightSide.add(goat);
                System.out.println("7) Boat with the goat, goes to the right");
                counter++;
                System.out.println("All animals and the boat are on the other side");
                System.out.printf("It took %d steps", counter);
            }

        }
    }

}

