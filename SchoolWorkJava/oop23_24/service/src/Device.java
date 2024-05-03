import java.util.Scanner;

public class Device {
    private String manufacturer;
    private String model;
    private double price;

    public Device(String manufacturer, String model, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public Device() {
        this.manufacturer = "LG";
        this.model = "Computer M94";
        this.price = 1999.99;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public Device createDevice(Scanner scan){
        return new Device(scan.nextLine(),scan.nextLine(),scan.nextDouble());
    }
}
