import java.util.Scanner;

public class DeadFish {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String program = scan.nextLine();
        int acumulator = 0;

        for (int i = 0; i < program.length(); i++) {
            switch (program.charAt(i)){
                case 'i':
                    acumulator++;
                    break;
                case 'd':
                    acumulator--;
                    break;
                case 's':
                    acumulator = acumulator * acumulator;
                    break;
                case 'o':
                    System.out.print(acumulator);
                    break;
            }

            if(acumulator == 256 || acumulator == -1){
                acumulator = 0;
            }

        }

    }
}
