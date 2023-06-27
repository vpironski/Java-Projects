package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SongCatalog {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         HashMap<String, String> catalog = new HashMap<>(12);

        catalog.put("Money For Nothing", "Dire Straits");
        catalog.put("Brothers In Arms", "Dire Straits");
        catalog.put("Your Latest Trick", "Dire Straits");
        catalog.put("Walk Of Life", "Dire Straits");
        catalog.put("Why Worry", "Dire Straits");
        catalog.put("Urgent", "Foreigner");
        catalog.put("Snowman", "Foreigner");
        catalog.put("I Want To Know", "Foreigner");
        catalog.put("The Wall", "Pink Floyd");
        catalog.put("Shine On You Crazy Diamond", "Pink Floyd");
        catalog.put("Wish You Were Here", "Pink Floyd");
        catalog.put("Time", "Pink Floyd");

        System.out.println("Choose :");
        System.out.println("1. Search by Group");
        System.out.println("2. Search by Song");
        int option = Integer.parseInt(reader.readLine());

        switch (option) {
            case 1:
                System.out.print("Enter group name: ");
                String group = reader.readLine();

                System.out.println("Songs from " + group + ":");
                for (Map.Entry<String, String> entry : catalog.entrySet()) {
                    if (entry.getValue().equalsIgnoreCase(group)) {
                        System.out.println(entry.getKey());
                    }
                }
                break;

            case 2:
                System.out.print("Enter song name: ");
                String song = reader.readLine();

                if (catalog.containsKey(song)) {
                    group = catalog.get(song);
                    System.out.println("Song '" + song + "' is made by " + group);
                } else {
                    System.out.println("Song '" + song + "' wasn't found");
                }
                break;

            default:
                System.out.println("Not a valid option");
                break;
        }
    }
}