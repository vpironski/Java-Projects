import java.util.*;

public class App {
    static List<Product> stock;
    static List<Admin> staff;
    static List<User> activeUsers;

    public static void main(String[] args) {
        Shop hyperMarket = new Shop(stock,staff,activeUsers);

        Admin user = new User("Vihren Pironski","vpironski","vpironski@gmail.com","1234");
        Regular user2 = new User("Stamat Goshev","Stamat123","stamat123@gmail.com","Stamat123");


    }
}
