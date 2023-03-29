package airTransport;

public class Airplane {
    private String name;
    private int capacity;
    private Engine engine;
    private int fuelCapacity;
    private Crew crew;

    public Airplane(String name, int capacity, Engine engine, int fuelCapacity, Crew crew) {
        this.name = name;
        this.capacity = capacity;
        this.engine = engine;
        this.fuelCapacity = fuelCapacity;
        this.crew = crew;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }
}
