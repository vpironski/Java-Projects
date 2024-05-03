import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        ArrayList<String> inputStream = new ArrayList<>();
        ArrayList<String> reversedStrings = new ArrayList<>();
        boolean flag = false;

        while(!flag){
            String input = scan.nextLine().toLowerCase();
            if(input.equals("end")){
                flag = true;
            }
            else{
                inputStream.add(input);
                char[] word = inputStream.get(counter).toCharArray();
                int size = word.length;
                char[] reversed = new char[size];

                for (int i = 0; i < size; i++) {
                    reversed[i] = word[(size-1) - i];
                }

                reversedStrings.add(String.valueOf(reversed));
                counter++;
            }
        }

        for (int i = 0; i < inputStream.size(); i++) {
            System.out.printf("%s = %s \n",inputStream.get(i), reversedStrings.get(i));
        }
    }
}
