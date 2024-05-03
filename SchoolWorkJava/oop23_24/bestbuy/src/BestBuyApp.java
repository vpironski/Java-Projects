import java.util.*;
public class BestBuyApp {
    static Scanner scan = new Scanner(System.in);
    static List <Buyable> products = new ArrayList<>();

    public static Buyable addProduct(){
        System.out.println("id: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("name: ");
        String name = scan.nextLine();
        System.out.println("quantity: ");
        int quantity = scan.nextInt();
        Product product = new Product(id, name, quantity);
        System.out.println(product);
        return product;
    }

    public static void search(String name){
        boolean flag = false;
        for (Buyable indexProduct:
             products) {
            if(name.equals(indexProduct.getName())){
                System.out.println(indexProduct);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("The product is not available");
        }

    }
    public static void main(String[] args) {

        boolean flag = true;
        int input;

        while(flag){
            System.out.println("***************************");
            System.out.println("Options: ");
            System.out.println("Add new product (1)");
            System.out.println("Search for a product (2)");
            System.out.println("Terminate the program (3)");
            System.out.println("***************************");
            System.out.println("Input a number: ");
            input = scan.nextInt();

            switch (input){
                case 1:
                    products.add(addProduct());
                    break;
                case 2:
                    scan.nextLine();
                    System.out.println("The product's name: ");
                    String name = scan.nextLine();
                    search(name);
                    break;
                case 3:
                    flag = false;
                    break;


            }
        }

    }
}
