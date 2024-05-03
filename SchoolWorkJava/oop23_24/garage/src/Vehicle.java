abstract class Vehicle {
    private String manufacturer;
    private int passengers;

    public Vehicle(String manufacturer, int passengers) {
        this.manufacturer = manufacturer;
        this.passengers = passengers;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public abstract void speedingUp();


}
