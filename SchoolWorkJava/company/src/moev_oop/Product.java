package moev_oop;

import java.util.List;

public class Product {
    private String name;
    private List<Manufacturer> manufacturers;
    private String expirationDate;
    private double price;
    private int quantity;

    public Product(String name, List<Manufacturer> manufacturers, String expirationDate, double price, int quantity) {
        this.name = name;
        this.manufacturers = manufacturers;
        this.expirationDate = expirationDate;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
