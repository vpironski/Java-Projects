import java.util.*;
import java.util.regex.*;

public class LadyMarvel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numMessages = scan.nextInt();
        scan.nextLine();
        String message;
        ArrayList<String> messages = new ArrayList<>();

        for (int i = 0; i < numMessages; i++) {
            message = scan.nextLine();
            if (Pattern.matches("\\d{5}?(\\w+)!\\w{3}", message)) {
                Pattern pattern = Pattern.compile("\\d{5}\\?(\\w+)!\\w{3}");
                Matcher matcher = pattern.matcher(message);

                if (matcher.find()) {
                    String extractedMessage = matcher.group(1);
                    messages.add(extractedMessage);
                }
            }
            else {
                System.out.println("the message is wrong");
            }


            for (String index : messages) {
                System.out.println(index);
            }
        }
    }
}
