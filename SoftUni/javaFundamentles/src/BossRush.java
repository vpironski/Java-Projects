import java.util.*;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] inputs = new String[n];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = scanner.nextLine();
        }
        for (String input : inputs) {
            String[] tokens = input.split(":");
//            System.out.println(Arrays.toString(tokens));
            String boss = tokens[0];
            String title = tokens[1];

            if(boss.matches("\\|[A-Z]{4,}\\|") && title.matches("#[A-Za-z]+ [a-zA-Z]+#")){
                boss = boss.substring(1,boss.length() - 1);
//                System.out.println(boss);
                title = title.substring(1, title.length() - 1);
//                System.out.println(title);
                String[] titleTokens = title.split(" ");
//                System.out.println(Arrays.toString(titleTokens));
                System.out.printf("%s, The %s\n", boss, title);
                System.out.printf(">> Strength: %d\n", boss.length());
                System.out.printf(">> Armor: %d\n", title.length());
            }
            else {
                System.out.println("Access denied!");
            }
        }
    }
}
