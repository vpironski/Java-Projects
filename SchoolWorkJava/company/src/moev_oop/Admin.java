package moev_oop;

import java.util.List;

public interface Admin extends Regular {
    public boolean isOnline();
    public int getProductQuantity(Product product);

    public void addProduct(Shop shop, Product product, List<Product> productList);
}
