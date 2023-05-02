public class Principle extends Worker{
    int numberOfStudentsYelledAt;

    public Principle(int numberOfStudentsYelledAt) {
        this.numberOfStudentsYelledAt = numberOfStudentsYelledAt;
    }

    @Override
    void greet(Student student) {
        System.out.println("Don't run in the hallways " + student.getName());
    }

    void yelledAt(Student student){
        this.numberOfStudentsYelledAt++;
    }

}
