import java.util.Scanner;

public class Automobile {
    private String id;
     private String model;
     private String brand;
     private double price;
     private int yearOfProduction;

    public Automobile(String id, String model, String brand, double price, int yearOfProduction) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    public Automobile() {
        Scanner scan = new Scanner(System.in);
        this.id = scan.nextLine();
        this.model = scan.nextLine();
        this.brand = scan.nextLine();
        this.price = scan.nextDouble();
        this.yearOfProduction = scan.nextInt();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                '}';
    }
}