package vehicles;

public class Engine {
    private double volume;
    private int cylinders;
    private String manufacturer;

    public Engine(double volume, int cylinders, String manufacturer) {
        this.volume = volume;
        this.cylinders = cylinders;
        this.manufacturer = manufacturer;
    }

    public Engine(Engine engine){
        this.copyEngine(engine);
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

    public void copyEngine(Engine engine){
        this.setCylinders(engine.getCylinders());
        this.setVolume(engine.getVolume());
        this.setManufacturer(engine.getManufacturer());
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

    private void setVolume(double volume) {
        this.volume = volume;
    }

    private void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    private void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
