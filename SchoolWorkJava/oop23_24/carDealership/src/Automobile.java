public class Automobile {
    private String brand;
    private String model;
    private double price;
    private int yearOfManufacturing;
    private String fuel;
    private String engineID;

    public Automobile(String brand, String model, double price, int yearOfManufacturing, String fuel, String engineID) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.yearOfManufacturing = yearOfManufacturing;
        this.fuel = fuel;
        this.engineID = engineID;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(int yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getEngineID() {
        return engineID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacturing='" + yearOfManufacturing + '\'' +
                ", fuel='" + fuel + '\'' +
                ", engineID='" + engineID + '\'' +
                '}';
    }
}
