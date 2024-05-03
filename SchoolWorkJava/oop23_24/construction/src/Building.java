import java.util.InputMismatchException;
import java.util.Scanner;

public class Building {
    private int height;
    private double area;
    private String address;

    public Building(int height, double area, String address) {
        this.height = height;
        this.area = area;
        this.address = address;
    }

    public Building enterBuilding(){
        try{
            Scanner scan = new Scanner(System.in);
            int height = scan.nextInt();
            double area = scan.nextDouble();
            String address = scan.nextLine();
            return new Building(height, area, address);
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        finally {
            return null;
        }

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
