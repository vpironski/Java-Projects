class SportsCar extends Vehicle{
    private int horsePower;
    private int acceleration;

    public SportsCar(String manufacturer, int passengers, int horsePower, int acceleration) {
        super(manufacturer, passengers);
        this.horsePower = horsePower;
        this.acceleration = acceleration;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public void speedingUp() {
        System.out.println("The sports car is speeding up");
    }
}
