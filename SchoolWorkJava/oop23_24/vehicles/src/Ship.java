public class Ship extends Vehicle implements isSeaVehicle{
    private int deadWeight;

    public Ship(int maxSpeed, String model, double price, int deadweight) {
        super(maxSpeed, model, price);
        this.deadWeight = deadweight;
    }

    public int getDeadweight() {
        return deadWeight;
    }

    public void setDeadweight(int deadweight) {
        this.deadWeight = deadweight;
    }

    @Override
    public double checkPromo() {
        return this.getPrice() * 0.03;
    }

    @Override
    public void enterSea() {
        System.out.println("Goes in the sea");
    }
}
