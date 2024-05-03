public class TV extends Stock implements ElectricalAppliance{
    private String manufacturer;
    private String model;
    private double kWpower;

    public TV(int uniqueID, double price, String manufacturer, String model, double kWpower) {
        super(uniqueID, price);
        this.manufacturer = manufacturer;
        this.model = model;
        try {
            this.setkWpower(kWpower);
        } catch (PowerException e) {
            throw new RuntimeException(e);
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getkWpower() {
        return kWpower;
    }

    public void setkWpower(double kWpower) throws PowerException {
        if(kWpower <= 0){
            throw new PowerException("Power can not be or below 0");
        }
        else{
            this.kWpower = kWpower;
        }
    }

    @Override
    public double checkPromo(double percent) throws PriceException {
        if (percent < 0) {
            throw new PriceException("Invalid percentile");
        } else if (this.getPrice() < 0) {
            throw new PriceException("Price can not be below 0");
        } else {
            return this.getPrice() * percent;
        }
    }

    @Override
    public double calculateElectricityConsumption(int hours) throws PowerException, TimeException{
        if(kWpower <= 0){
            throw new PowerException("Power can not be or below 0");
        }
        else if(hours <= 0){
            throw new TimeException("Time can not be or below 0 hours");
        }
        else{
            return this.kWpower*hours;
        }

    }
}
