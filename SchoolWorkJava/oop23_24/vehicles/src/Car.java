public class Car extends Vehicle implements  isLandVehicle{

    private int powerKW;


    public Car(int maxSpeed, String model, double price, int powerKW) {
        super(maxSpeed, model, price);
        this.powerKW = powerKW;
    }

    public int getPowerKW() {
        return powerKW;
    }

    public void setPowerKW(int powerKW) {
        this.powerKW = powerKW;
    }

    @Override
    public double checkPromo() {
        return this.getPrice() * 0.2;
    }


    @Override
    public void enterLand() {
        System.out.println("Goes on land");
    }


}
