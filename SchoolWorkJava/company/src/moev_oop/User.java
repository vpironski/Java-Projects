package moev_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User implements Admin, Regular{
    private String name;
    private String username;
    private String email;
    private String password;
    private List<Product> shoppingCart;
    private boolean isOnline;

    public User(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.isOnline = true;
    }

    public User(String name, String username, String email, String password, ArrayList<Product> shoppingCart) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.shoppingCart = shoppingCart;
        this.isOnline = true;
    }

    @Override
    public List<Product> getStock(Shop currentShop) {
        return null;
    }

    @Override
    public void addToCart(Product product) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public boolean isOnline() {
        return isOnline;
    }

    @Override
    public int getProductQuantity(Product product) {
        return product.getQuantity();
    }

    @Override
    public void addProduct(Shop shop, Product product, List<Product> productList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter what product you want to add :");
        String productInput = scan.nextLine();
        //productList.add(0,productInput);


    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", shoppingCart=" + shoppingCart +
                ", isOnline=" + isOnline +
                '}';
    }
}
