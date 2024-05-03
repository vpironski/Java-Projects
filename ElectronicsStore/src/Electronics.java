public class Electronics implements Product {
    private static final String CATEGORY= "Electronics";
    private int voltage;
    private int kilowatts;
    private double price;
    private String model;
    private int amount;

    @Override
    public String getCategory() {
        return CATEGORY;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getKilowatts() {
        return kilowatts;
    }

    public void setKilowatts(int kilowatts) {
        this.kilowatts = kilowatts;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
