public class ApartmentBuilding extends Building{
    private int numFloors;
    private Apartment [] apartments;
    public ApartmentBuilding(int height, double area, String address,int numFloors, Apartment [] apartaments) {
        super(height, area, address);
        this.numFloors = numFloors;
        this.apartments = apartaments;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }
}
