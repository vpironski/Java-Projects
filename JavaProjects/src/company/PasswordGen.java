package company;

import java.util.Scanner;

public class PasswordGen
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());

        while (l > 26 || l < 1) {
            System.out.println("Invalid");
            l = Integer.parseInt(scan.nextLine());
        }

        int d1, d2, d3, i, j;
        char l1, l2;

        for (d1 = 1; d1 <= n; d1++) {
            for (d2 = 1; d2 <= n; d2++) {
                for (j = 97; j < l + 97; j++) {
                    l1 = (char) j;
                    for (i = 97; i < l + 97; i++) {
                        l2 = (char) i;
                        for (d3 = Math.max(d1, d2) + 1; d3 <= n; d3++) {
                            System.out.print(String.format("%d%d%c%c%d ", d1, d2, l1, l2, d3));
                        }

                    }
                }
            }

        }
    }
}
