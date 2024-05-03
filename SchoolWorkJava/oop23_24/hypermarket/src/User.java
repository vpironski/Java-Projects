import java.util.*;

public class User implements Regular,Admin{
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

    public void addProduct(Shop shop, Product product){
        shop.getStock().add(product);
    }

    public int getProductQuantity(Product product){
        return product.getQuantity();
    }

    public void addToCart(Product product){
        this.shoppingCart.add(product);
    }
    public List<Product> getStock(Shop currentShop){
        return currentShop.getStock();
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
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
