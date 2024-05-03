import java.util.ArrayList;

public interface Admin extends Regular{

    public boolean isOnline();
    public int getProductQuantity(Product product);

    public void addProduct(Shop shop, Product product);
}
