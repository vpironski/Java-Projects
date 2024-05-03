import java.util.InputMismatchException;
import java.util.Scanner;

public class SportCarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input data for the car: ");

        try{
            String manufacturer = scan.nextLine();
            int numPassengers = scan.nextInt();
            int horsePower = scan.nextInt();
            int acceleration = scan.nextInt();
            SportsCar sportsCar = new SportsCar(manufacturer, numPassengers, horsePower, acceleration);

        } catch (InputMismatchException e){
            System.err.println((new InputMismatchException("Invalid user input").getMessage()));
        } finally {
            scan.close();
        }


    }
}
