package stringCount;
import java.util.*;

public class StringCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int digit = 0;
        int upper = 0;
        int lower = 0;
        int other = 0;

        char[] chars = s.toCharArray();
        for (char character: chars) {

            if(Character.isDigit(character)){
                digit += 1;
            }
            else if(character >= 97 && character <= 122){
                lower += 1;
            }
            else if(character >= 65 && character <= 90){
                upper += 1;
            }
            else {
                other += 1;
            }
        }
//        Digits count: {number of chars}
//        Lowercase letters count: {number of chars}
//        Uppercase letters count: {number of chars}
//        Other symbols count: {number of chars}


        System.out.printf("Digits count: %d\n",digit);
        System.out.printf("Lowercase letters count: %d\n",lower);
        System.out.printf("Uppercase letters count: %d\n",upper);
        System.out.printf("Other symbols count: %d\n",other);

    }
}
