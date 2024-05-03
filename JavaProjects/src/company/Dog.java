package company;

public class Dog {
    private int legs;
    private String breed;
    private String color;

    public Dog( int legs, String breed, String color){
        this.legs = legs;
        this.breed = breed;
        this.color = color;
    }

    public String bark(){
//        System.out.println("bark");
        return "bark";
    }

    public int getLegs(){
        return legs;
    }
    public String getColor(){
        return color;
    } public String getBreed(){
        return breed;
    }

    @Override
    public String toString() {
        return "Dog: " +
                "Legs: " + legs +
                " Breed: " + breed +
                " Color: " + color;
    }
}
