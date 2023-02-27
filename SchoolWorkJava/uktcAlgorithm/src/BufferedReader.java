import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {

    public static void main(String[] args) throws IOException {

        System.out.println("Read Keyboard - Buffered Reader !");

//InputStreamReader isr = new InputStreamReader(System.in);
//BufferedReader br = new BufferedReader(isr, 16384);
        java.io.BufferedReader reader = new java.io.BufferedReader(new InputStreamReader(System.in), 8192); // buffer reader size :16384


        System.out.print("Please enter String : ");
        String name = reader.readLine(); // input string
        System.out.print("You entered: ");
        System.out.println(name);

        System.out.print("Please enter Integer : ");
        Integer number = Integer.parseInt(reader.readLine()); // input Integer
        System.out.print("You entered: ");
        System.out.println(number);

        System.out.print("Please enter Long Integer : ");
        Long lnumber = Long.parseLong(reader.readLine()); // input Long Integer
        System.out.print("You entered: ");
        System.out.println(lnumber);

        System.out.print("Please enter Float : ");
        Float amount = Float.parseFloat(reader.readLine()); // input string
        System.out.print("You entered: ");
        System.out.println(amount);


        System.out.print("Please enter Boolean : ");
        Boolean boo = Boolean.parseBoolean(reader.readLine()); // input string
        System.out.print("You entered: ");
        System.out.println(boo);


// Closing to avoid memory leak.
        reader.close();
    }

}
