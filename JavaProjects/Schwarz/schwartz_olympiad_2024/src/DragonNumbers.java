import java.lang.reflect.Array;
import java.util.*;


public class DragonNumbers {
    public static Set<String> getPermutation(String str) {

        Set<String> permutations = new HashSet<>();

        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char first = str.charAt(0);

        String sub = str.substring(1);

        Set<String> words = getPermutation(sub);

        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){

                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        return permutations;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = Integer.toString(scan.nextInt());
        int size = input.length();

        Set<String> permutations = getPermutation(input);
        System.out.println(permutations);
        for(String permutation : permutations){
            if(Integer.parseInt(input) < 100){
                System.out.println("Normal Number");
                break;
            }
            else if (size % 2 == 0 ) {
                StringBuilder first = new StringBuilder();
                for (int i = 0; i < size / 2; i++) {
                    first.append(permutation.charAt(i));
                }
                StringBuilder sub = new StringBuilder();
                for (int i = size / 2; i < size; i++) {
                    sub.append(permutation.charAt(i));
                }
                if(Integer.parseInt(first.toString()) * Integer.parseInt(sub.toString()) == Integer.parseInt(input)){
                    System.out.println("True Dragon");
                    break;
                }
            }
            else if(size % 2 == 1){
                boolean flag = false;
                StringBuilder first = new StringBuilder();
                for (int i = 0; i < size / 2; i++) {
                    first.append(permutation.charAt(i));
                }
                StringBuilder sub = new StringBuilder();
                for (int i = size / 2; i < size; i++) {
                    sub.append(permutation.charAt(i));
                }
                if(Integer.parseInt(first.toString()) * Integer.parseInt(sub.toString()) == Integer.parseInt(input)){
                    System.out.println("Pseudodragon");

                    break;
                }
                else{
                flag = true;
                  }

                if (flag){
                    first = new StringBuilder();
                    for (int i = 0; i < size / 2 + 1 ; i++) {
                        first.append(permutation.charAt(i));
                    }
                    sub = new StringBuilder();
                    for (int i = size / 2; i < size; i++) {
                        sub.append(permutation.charAt(i));
                    }
                    if(Integer.parseInt(first.toString()) * Integer.parseInt(sub.toString()) == Integer.parseInt(input)){
                        System.out.println("Pseudodragon");
                        break;
                    }
                }
            }
            else{
                System.out.println("Normal Number");
                break;
            }
        }

    }


}
