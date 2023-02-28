package vehicles;

import people.Person;

import java.util.ArrayList;

public class AppWeek2_oop {
    public static void main(String[] args) {
        Person owner = new Person();
        ArrayList<Car> myCars = new ArrayList<>();
        Car supra = new Car();
        Car bmw = new Car(2004,"e46",new Engine(1998, 4,"BMW"),"BMW");
        myCars.add(supra);
        myCars.add(bmw);
        myCars.add(supra);
        CarDealership myDealership = new CarDealership(owner, myCars);

        System.out.println(myDealership);
        myDealership.removeCar(supra);
        System.out.println(supra.carEquals(bmw));

    }
}
