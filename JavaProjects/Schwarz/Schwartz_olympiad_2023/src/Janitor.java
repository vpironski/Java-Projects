public class Janitor extends Worker{
    Room[] cleanedRooms;

    public Janitor(Room[] cleanedRooms) {
        this.cleanedRooms = cleanedRooms;
    }

    @Override
    void greet(Student student) {
        System.out.println();
    }
}
