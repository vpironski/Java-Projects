package company;
import java.util.Objects;
import java.util.Scanner;

public class Workspace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int wine = 300;
//        int beer = 200;
//        int wineOrd = 0;
//        int wineDel = 0;
//        int beerOrd = 0;
//        int beerDel = 0;
        String word = s.nextLine();
        while (!Objects.equals(word, "END")){
            word = s.nextLine();

            String[] words = word.split(": ");
            String drink = words[0];
            System.out.println(drink);


        }

    }
}

