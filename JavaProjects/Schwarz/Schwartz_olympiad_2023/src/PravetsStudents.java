import java.text.DecimalFormat;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.stream.Collectors;

public class PravetsStudents {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decfor = new DecimalFormat("0.00");
        int n = Integer.parseInt(scan.nextLine());
        HashMap<String, Double> students = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
            String[] initial = input.split(",\\s+");
            Double avarage = 0.00;

            for (int j = 0; j < initial.length; j++) {
                avarage += Double.parseDouble(initial[j]);
            }
            avarage = avarage/initial.length;

            String student = scan.nextLine().toLowerCase();

            if(!students.containsKey(student)){
                students.put(student.substring(0,1).toUpperCase() + student.substring(1), Double.valueOf(decfor.format(avarage)));
            }
        }
        Map<String, Double> sortedMap = students.entrySet().stream()
                .sorted(Comparator.comparingDouble(entry -> entry.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));



        for (Map.Entry<String, Double> entry : sortedMap.entrySet()){
            if(entry.getValue() >= 4.00){
                System.out.printf("%s -> %,.2f \n", entry.getKey(), entry.getValue());
            }
        }
    }
}
