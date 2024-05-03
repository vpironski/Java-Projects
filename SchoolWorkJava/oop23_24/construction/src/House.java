import java.util.InputMismatchException;
import java.util.Scanner;

public class House extends Building{
    private int numFloors;
    private String owner;


    public House(int height, double area, String address, int numFloors, String owner) {
        super(height, area, address);
        this.numFloors = numFloors;
        this.owner = owner;
    }

    public House enterHouse(){
        try {
            Scanner scan = new Scanner(System.in);
            int height = scan.nextInt();
            double area = scan.nextDouble();
            String address = scan.nextLine();

            int numFloors = scan.nextInt();
            String owner = scan.nextLine();
            return new House(height, area, address, numFloors, owner);
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        finally {
            return null;
        }
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    @Override
    public String toString() {
        return "House{" +
                "numFloors=" + numFloors +
                ", owner='" + owner + '\'' +
                ", height=" + getHeight() +
                ", area=" + getArea() +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
