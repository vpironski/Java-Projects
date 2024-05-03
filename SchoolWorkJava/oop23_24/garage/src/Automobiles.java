class Automobiles {
    private Automobile[] automobiles;
    private int count;

    public Automobiles() {
        automobiles = new Automobile[15];
        count = 0;
    }

    public void addAutomobile(Automobile automobile) {
        if (count < 15) {
            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (automobiles[i].getId().equals(automobile.getId())) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                automobiles[count] = automobile;
                count++;
            } else {
                System.out.println("Automobile with unique code " + automobile.getId() + " already exists.");
            }
        } else {
            System.out.println("Maximum capacity reached. Cannot add more automobiles.");
        }
    }

    public void printAutomobilesByBrand(String brand) {
        if (brand.isEmpty()) {
            for (int i = 0; i < count; i++) {
                System.out.println(automobiles[i]);
            }
        } else {
            for (int i = 0; i < count; i++) {
                if (automobiles[i].getBrand().equals(brand)) {
                    System.out.println(automobiles[i]);
                }
            }
        }
    }

    public void printAutomobileWithHighestPrice() {
        if (count > 0) {
            Automobile maxPriceAutomobile = automobiles[0];
            for (int i = 1; i < count; i++) {
                if (automobiles[i].getPrice() > maxPriceAutomobile.getPrice()) {
                    maxPriceAutomobile = automobiles[i];
                }
            }
            System.out.println("Automobile with the highest price: " + maxPriceAutomobile);
        } else {
            System.out.println("No automobiles available.");
        }
    }

    public double calculateAveragePriceByBrand(String brand) {
        double total = 0;
        int numAutomobiles = 0;
        for (int i = 0; i < count; i++) {
            if (brand.isEmpty() || automobiles[i].getBrand().equals(brand)) {
                total += automobiles[i].getPrice();
                numAutomobiles++;
            }
        }
        return numAutomobiles > 0 ? total / numAutomobiles : 0;
    }
}