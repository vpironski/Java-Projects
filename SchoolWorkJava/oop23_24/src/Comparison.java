import java.util.Scanner;

class Comparison{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 0.00;
        double b = 0.00;
        System.out.println("Input a: ");
        try{
            a = scan.nextDouble();

        }
        catch (Exception e){
            System.out.println("Error: invalid input");
        }

        System.out.println("Input b: ");
        try{
            b = scan.nextDouble();
        }
        catch (Exception e){
            System.out.println("Error: invalid input");
        }
        if(a>b){
            System.out.println(a);
        } else if (b>a) {
            System.out.println(b);

        }
        else {
            System.out.println("Even");
        }

    }

}