import java.util.*;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\s+");
        if(pattern.matcher("VihrenPironski").find()){
            System.out.println("great success!");
        }
        else{
            System.out.println("great failure");
        }

        String name = "Vihren Pironski";
        String [] names =  name.split("\\s+");
        Arrays.stream(names).forEach(System.out::println);

        //Name: num

    }
}
