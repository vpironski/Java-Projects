import java.util.*;
public class UltronTrap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int length = input.split(",").length;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(input.split(",")[i]);
        }
        int[] newArray = new int[length];
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < array.length / 2; i++) {
            if(array[i] % 2 == 0){
                int temp = array[i] * 2;
                newArray[i] = array[array.length - 1 - i] * 2;
                newArray[array.length - 1 - i] = temp;
            }
            else if(array[i] % 2 != 0 && array[length - 1 - i] % 2 != 0){
                int temp = array[array.length - 1 - i];
                newArray[i] = array[i];
                newArray[array.length - 1 - i] = temp;
            }
            else if(length / 2 == i && length % 2 != 0){
                int temp = 0;
                newArray[i] = array[array.length - 1 - i];
                newArray[array.length - 1 - i] = temp;
            }
            else{
                int temp = array[i];
                newArray[i] = array[array.length - 1 - i];
                newArray[array.length - 1 - i] = temp;
            }
//            System.out.println(Arrays.toString(array));
//            System.out.println(Arrays.toString(newArray));
        }
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(newArray));
//5,2,3,4,5,6,8
    }

}
