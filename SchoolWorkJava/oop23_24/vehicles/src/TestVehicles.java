class TestVehicles {
    public static void main(String[] args) {
        Car car = new Car(200, "Toyota Camry", 25000, 250);
        Hovercraft hovercraft = new Hovercraft(80, "AirFish 8", 1000000, 20);
        Ship ship = new Ship(30, "Cargo Ship", 5000000, 10000);

        System.out.println(car.checkPromo());
        System.out.println(hovercraft.checkPromo());
        System.out.println(ship.checkPromo());
    }
}
