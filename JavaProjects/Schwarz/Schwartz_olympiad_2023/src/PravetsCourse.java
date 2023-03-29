import java.util.*;
import java.util.stream.Collectors;

public class PravetsCourse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] initial = input.split("\\s+->");
        ArrayList<String>lessons = new ArrayList<>(Arrays.asList(initial));


        input = scan.nextLine();
        while(!input.equals("start academy")){
            String[] commands = input.split(":");

            if(commands[0].equals("Add")){
                if(!lessons.contains(commands[1])){
                    lessons.add(commands[1]);
                }
            }

            else if(commands[0].equals("Insert")){
                    if(!lessons.contains(commands[1])){
                        lessons.add(Integer.parseInt(commands[2]),commands[1]);
                    }

            }

            else if(commands[0].equals("Remove")){
                    if(lessons.contains(commands[1])){
                        lessons.remove(commands[1]);
                    }
            }
            else if(commands[0].equals("Swap")) {
                if(lessons.contains(commands[1]) && lessons.contains(commands[2])){
                    Collections.swap(lessons,lessons.indexOf(commands[1]),lessons.indexOf(commands[2]));
                }
            }
            input = scan.nextLine();
        }

        for (int i = 0; i < lessons.size(); i++) {
            System.out.printf("%d. %s \n", i+1, lessons.get(i));

        }
    }
}
