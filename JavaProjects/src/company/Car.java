package company;

public class Car{
    private int wheels;
    private int gears;
    private int doors;
    private String brand;

    public void start(){
        System.out.println("*Starting the engine*");
    }

    public Car() {
        this.wheels = 4;
        this.gears = 5;
        this.doors = 2;
        this.brand = "Audi";
    }

    public Car(int wheels, int gears, int doors, String brand) {
        this.wheels = wheels;
        this.gears = gears;
        this.doors = doors;
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getDoors() {
        return doors;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", gears=" + gears +
                ", doors=" + doors +
                ", brand='" + brand + '\'' +
                '}';
    }
}
