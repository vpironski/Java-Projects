class GarageTest {
    public static void main(String[] args) {
            Automobiles automobileInventory = new Automobiles();

            automobileInventory.addAutomobile(new Automobile("ABC123", "Model1", "Brand1", 25000, 2022));
            automobileInventory.addAutomobile(new Automobile("DEF456", "Model2", "Brand2", 30000, 2023));
            automobileInventory.addAutomobile(new Automobile("GHI789","Model3", "Brand1", 35000, 2024));
            automobileInventory.addAutomobile(new Automobile("JKL012","Model4", "Brand3", 40000, 2022));

            System.out.println("All automobiles:");
            automobileInventory.printAutomobilesByBrand("");

            System.out.println("\nAutomobiles of Brand1:");
            automobileInventory.printAutomobilesByBrand("Brand1");

            System.out.println("\nAutomobile with highest price:");
            automobileInventory.printAutomobileWithHighestPrice();

            System.out.println("\nAverage price of Brand1 automobiles: " + automobileInventory.calculateAveragePriceByBrand("Brand1"));

    }
}
