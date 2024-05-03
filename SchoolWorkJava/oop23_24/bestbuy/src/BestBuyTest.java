import java.util.*;

public class BestBuyTest
{
    public static void main(String[] args)
    {
        List<Buyable> products = Arrays.asList(new Product[]{
                                                new Product(1234, "Milk", 4),
                                                new BetterProduct(4321, "Cheese", 32)});

        for (Buyable product:
             products)
        {
            System.out.println(product.getName());
        }
    }
}
