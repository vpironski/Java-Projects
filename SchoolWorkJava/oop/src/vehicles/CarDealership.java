package vehicles;

import people.Person;

import java.util.ArrayList;

public class CarDealership {
    private Person owner;
    private ArrayList<Car> cars = new ArrayList<>();

    public CarDealership(Person owner) {
        this.owner = owner;
    }

    public CarDealership(Person owner, ArrayList<Car> cars) {
        this.owner = owner;
        this.cars = cars;
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

    public void removeCar(Car car){
        this.cars.remove(car);
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                "owner=" + owner +
                ", vehicles=" + cars +
                '}';
    }
}
