package jokerBombs;

import java.util.Scanner;

public class Joker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(",");

        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);
        int[][] grid = new int[rows + 2][columns + 2];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] += 100;
            }
        }

        String command;
        while (true) {
            command = scan.nextLine().toLowerCase();
            if (command.equals("game over")) {
                break;
            } else {
                input = command.split(",");
                int x = Integer.parseInt(input[0]);
                int y = Integer.parseInt(input[1]);
                int damage;

                try {
                    damage = Integer.parseInt(input[2]);
                } catch (IndexOutOfBoundsException e) {
                    damage = 0;
                }

                int neighbourDamage = 0;
                if (damage >= 1 && damage <= 30) {
                    neighbourDamage = 5;
                } else if (damage > 30 && damage <= 70) {
                    neighbourDamage = 10;
                } else if (damage > 70) {
                    neighbourDamage = (20 / 100) * damage;
                }



            }

        }

    }
}
