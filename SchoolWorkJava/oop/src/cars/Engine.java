package cars;

public class Engine {
    private double volume;
    private int cylinders;
    private String manufacturer;

    public Engine(double volume, int cylinders, String manufacturer) {
        this.volume = volume;
        this.cylinders = cylinders;
        this.manufacturer = manufacturer;
    }

    public Engine() {
        volume = 3000.00;
        cylinders = 4;
        manufacturer = "Toyota";
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", cylinders=" + cylinders +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public double getVolume() {
        return volume;
    }
    public int getCylinders() {
        return cylinders;
    }
    public String getManufacturer() {
        return manufacturer;
    }

}
