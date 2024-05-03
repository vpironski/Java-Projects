package moev_oop;

import java.util.List;

public interface Regular {
    public List<Product> getStock(Shop currentShop);
    public void addToCart(Product product);
    public String getName();
    public String getUsername();
    public String getEmail();
    public String getPassword();
    public List<Product> getShoppingCart();

    public void setName(String name);
    public void setUsername(String username);
    public void setEmail(String email);
    public void setPassword(String password);
    public void setShoppingCart(List<Product> shoppingCart);
}
