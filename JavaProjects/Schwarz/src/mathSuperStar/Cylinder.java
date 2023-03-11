package mathSuperStar;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        DecimalFormat decfor = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        double epsilon = 0.001d;
        double r1, h1, r2, h2;
        String[] input = scan.nextLine().split(",");
        r1 = Double.parseDouble(input[0])/10;
        h1 = Double.parseDouble(input[1])/10;
        r2 = Double.parseDouble(input[2])/10;
        h2 = Double.parseDouble(input[3])/10;

        double v1 = Double.parseDouble(decfor.format(Math.PI * r1*r1 * h1));
        double v2 = Double.parseDouble(decfor.format(Math.PI * r2*r2 * h2));

        if (Math.abs(v1 - v2) < epsilon){
            System.out.println(v1);
        }
        else if (v1 > v2) {
            System.out.println(v1);
        }
        else{
            System.out.println(v2);
        }


    }
}
