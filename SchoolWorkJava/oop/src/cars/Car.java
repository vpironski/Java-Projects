package cars;

public class Car {
    private int year;
    private String model;
    private Engine engine;
    private String manufacturer;


    public Car(int year, String model, Engine engine, String manufacturer) {
        this.year = year;
        this.model = model;
        this.engine = engine;
        this.manufacturer = manufacturer;
    }

    public Car() {
        year = 1993;
        model = "Supra";
        engine = new Engine();
        manufacturer = "Toyota";
    }

    public boolean carEquals(Car car){
        return this.equals(car );
    }

    public int getYear() {
        return year;
    }


    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
