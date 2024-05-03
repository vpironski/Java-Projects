public class ConstructionTest {
    static House[] houses = new House[5];

    public static double avgApartmentArea(ApartmentBuilding apartmentBuilding){
        return apartmentBuilding.getArea() / apartmentBuilding.getApartments().length;
    }
    public static House mostSpacious(){
        House mostSpaciousHouse = houses[0];
        double maxAverageHeight = calculateAverageHeight(mostSpaciousHouse);

        for (int i = 1; i < houses.length; i++) {
            double averageHeight = calculateAverageHeight(houses[i]);

            if (averageHeight > maxAverageHeight) {
                maxAverageHeight = averageHeight;
                mostSpaciousHouse = houses[i];
            }
        }
        return mostSpaciousHouse;
    }

    private static double calculateAverageHeight(House house) {
        if (house.getNumFloors() == 0) {
            return 0.0;
        }

        return (double) house.getHeight() / house.getNumFloors();
    }

    public static void main(String[] args) {
        houses[0] = new House(10, 150.5, "123 Main St", 2, "John Doe");
        houses[1] = new House(8, 200.0, "456 Elm St", 3, "Jane Smith");
        houses[2] = new House(12, 180.75, "789 Oak St", 2, "David Johnson");
        houses[3] = new House(15, 250.3, "101 Pine St", 4, "Emily Brown");
        houses[4] = new House(9, 170.0, "202 Maple St", 2, "Michael Wilson");
        System.out.println(mostSpacious());


    }
}
