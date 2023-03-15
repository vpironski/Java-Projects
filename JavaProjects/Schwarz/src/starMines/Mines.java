package starMines;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Mines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(",");
        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
        int[][] grid = new int[r][c];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] += 100;
            }
        }

        String command;
        while(true){
            command = scan.nextLine().toLowerCase();
            if(command.equals("game over")){
                break;
            }
            else {
                input = command.split(",");
                int x = Integer.parseInt(input[0]);
                int y = Integer.parseInt(input[1]);
                int damage;

                try{
                    damage = Integer.parseInt(input[2]);
                }catch (IndexOutOfBoundsException e){
                    damage = 0;
                }

                int neighbourDamage = 0;
                if(damage >= 1 && damage <= 30){
                    neighbourDamage = 5;
                }
                else if(damage > 30 && damage <= 70){
                    neighbourDamage = 10;
                } else if (damage > 70) {
                    neighbourDamage = (20/100) * damage;
                }
                
                try {
                    grid[x][y] -= damage;
                }
                catch (IndexOutOfBoundsException e){ }
                // Top
                try{
                    grid[x-1][y-1] -= neighbourDamage;
                }
                catch(IndexOutOfBoundsException e){ }

                try{
                    grid[x][y-1] -= neighbourDamage;
                }
                catch(IndexOutOfBoundsException e){ }

                try{
                    grid[x+1][y-1] -= neighbourDamage;
                }
                catch(IndexOutOfBoundsException e){ }

                //Middle
                try{
                    grid[x-1][y] -= neighbourDamage;
                }
                catch(IndexOutOfBoundsException e){ }

                try{
                    grid[x+1][y] -= neighbourDamage;
                }
                catch(IndexOutOfBoundsException e){ }

                //Bottom
                try{
                    grid[x-1][y+1] -= neighbourDamage;
                }
                catch(IndexOutOfBoundsException e){ }

                try{
                    grid[x][y+1] -= neighbourDamage;
                }
                catch(IndexOutOfBoundsException e){ }

                try{
                    grid[x+1][y+1] -= neighbourDamage;
                }
                catch(IndexOutOfBoundsException e){ }
            }

        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0){
                    grid[i][j] = 0;
                }
            }
        }

        for (int[] line:
             grid)
        {
            System.out.println(Arrays.toString(line));

        }

    }
}
