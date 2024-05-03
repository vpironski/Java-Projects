package company;

public class Cat {
    private int legs;
    private String breed;
    private String nation;
    private String color;
    private boolean tail;


    public Cat(int legs, String breed, String color, String nation, boolean tail){
        this.legs = legs;
        this.breed = breed;
        this.nation = nation;
        this.color = color;
        this.tail = tail;

    }

    public Cat(){
        this.legs = 4;
        this.breed = "Siberian";
        this.nation = "Russia";
        this.color = "gray";
        this.tail = true;
    }

    public void meow(){
        System.out.println("Meow");
    }

    public int getLegs(){
        return legs;
    }

    public String getBreed() {
        return breed;
    }

    public String getNation() {
        return nation;
    }

    public String getColor() {
        return color;
    }

    public boolean isTail() {
        return tail;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "legs=" + legs +
                ", breed='" + breed + '\'' +
                ", nation='" + nation + '\'' +
                ", color='" + color + '\'' +
                ", tail=" + tail +
                '}';
    }
}
