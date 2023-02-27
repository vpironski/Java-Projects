package carAplication;

public class CarAplication {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "E46 M3", "blue", 5);
        Car supra = new Car("Toyota","Supra MK4","black",6);
        Car skyline = new Car("Nissan","Skyline R-34","blue",6);

        System.out.println(bmw.toString());
        System.out.println(supra.toString());
    }
}
