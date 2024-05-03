public class Hovercraft extends Vehicle implements isLandVehicle,isSeaVehicle{
    private int passngers;

    public Hovercraft(int maxSpeed, String model, double price, int passngers) {
        super(maxSpeed, model, price);
        this.passngers = passngers;
    }

    public int getPassngers() {
        return passngers;
    }

    public void setPassngers(int passngers) {
        this.passngers = passngers;
    }

    @Override
    public double checkPromo() {
        return this.getPrice() * 0.3;
    }

    @Override
    public void enterLand() {
        System.out.println("Goes on land");
    }

    @Override
    public void enterSea() {
        System.out.println("Goes int sea");
    }
}
