import java.util.ArrayList;

public class TestDealership {
    public static void main(String[] args) {
        Ad automobiles = new Ad(new ArrayList<>());

        try {
            automobiles.addAutomobile(new Automobile("Toyota", "Camry", 25000, 2022, "Petrol", "XYZ123456"));
            automobiles.addAutomobile(new Automobile("BMW", "X5", 60000, 2023, "Diesel", "ABC987654"));
            automobiles.addAutomobile(new Automobile("Tesla", "Model S", 80000, 2024, "Electric", "EFG456789"));
//            automobiles.addAutomobile(new Automobile("Toyota", "Camry", 25000, 2022, "Petrol", "XYZ123456"));
        } catch (ExistingAutomobileException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All Cars: ");
        automobiles.getAutomobileInfo("", "");
        System.out.println();

        System.out.println("Toyota Camry Cars: ");
        automobiles.getAutomobileInfo("Toyota", "Camry");
        System.out.println();

        System.out.println("Most Expensive Car: ");
        automobiles.highestPrice();
    }
}