import java.util.Scanner;

public class App {
    static byte[] tape = new byte[30000];
    static int instruction_pointer, cell_index;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String program = scan.nextLine();
        int acumulator = 0;
        instruction_pointer = 0;
        for (char intructions:program.toCharArray()) {
//            intructions = program.charAt(instruction_pointer);
            switch (program.charAt(intructions)) {
                case '>':
                    cell_index++;
                    break;
                case '<':
                    cell_index--;
                    break;
                case '+':
                    acumulator = acumulator * acumulator;
                    break;
                case 'o':
                    System.out.print(acumulator);
                    break;
            }

            if (acumulator == 256 || acumulator == -1) {
                acumulator = 0;
            }

        }
    }
}