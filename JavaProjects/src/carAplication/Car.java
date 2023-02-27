package carAplication;

public class Car {
    static String brand;
    static String model;
    static String color;
    static int gear;

    public Car(String brand, String model, String color, int numOfGears){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.gear = numOfGears;
    }
    @Override
    public String toString() {
        return "Car1 \n{ " +
                "Brand: " + getBrand() + "\n" +
                "Model: " +  getModel() + "\n" +
                "Color: " + getColor() + "\n" +
                "Number of Gears: " + getGear() + "\n" +
                "}";
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Car.brand = brand;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        Car.color = color;
    }

    public static int getGear() {
        return gear;
    }

    public static void setGear(int gear) {
        Car.gear = gear;
    }
}
