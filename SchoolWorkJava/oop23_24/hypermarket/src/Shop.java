import  java.util.*;
public class Shop {

    private List<Product> stock;
    private List<Admin> staff;
    private List<User> activeUsers;

    public Shop(List<Product> stock, List<Admin> staff, List<User> activeUsers) {
        this.stock = stock;
        this.staff = staff;
        this.activeUsers = activeUsers;
    }

    public List<Product> getStock() {
        return stock;
    }

    public void setStock(List<Product> stock) {
        this.stock = stock;
    }

    public List<Admin> getStaff() {
        return staff;
    }

    public void setStaff(List<Admin> staff) {
        this.staff = staff;
    }

    public List<User> getActiveUsers() {
        return activeUsers;
    }

    public void setActiveUsers(List<User> activeUsers) {
        this.activeUsers = activeUsers;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "stock=" + stock +
                ", staff=" + staff +
                ", activeUsers=" + activeUsers +
                '}';
    }
}
