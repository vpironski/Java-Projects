public abstract class Stock {
    private int uniqueID;
    private double price;

    public Stock(int uniqueID, double price) {
        this.uniqueID = uniqueID;
        this.price = price;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double checkPromo(double percent) throws PriceException;
}