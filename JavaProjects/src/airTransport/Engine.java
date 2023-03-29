package airTransport;

public class Engine {
    private String name;
    private int horsepower;
    private String manufacturer;


    public Engine(String name, int horsepower, String manufacturer) {
        this.name = name;
        this.horsepower = horsepower;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
