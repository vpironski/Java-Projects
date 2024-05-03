import java.util.Scanner;

public class MinecraftAdventure {
    public static void main(String[] args) {
        // crafting recipe
        // Cobblestone (x3) Stick (x2)

        Scanner scan = new Scanner(System.in);
        int sticks = 0;
        int cobblestone = 0;
        int stonePickaxes = 0;
        boolean flag = true;

        while (flag){
            String input = scan.nextLine();
            switch (input) {
                case "Sticks" -> sticks += 1;
                case "Wood" -> sticks += 4;
                case "Cobblestone" -> cobblestone += 1;
                case "END" -> flag = false;
            }

        }
        while(sticks - 2 >= 0 && cobblestone - 2 >= 0){
            sticks -= 2;
            cobblestone -= 3;
            stonePickaxes++;
        }

        System.out.printf("Amount of stone pickaxes: %d \n", stonePickaxes);

    }
}
