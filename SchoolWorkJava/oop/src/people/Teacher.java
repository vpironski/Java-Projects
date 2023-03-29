package people;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teacher extends Person{
    ArrayList<String> subjects;

    public Teacher(String name, String lastName, LocalDate birthDate, ArrayList<String> subjects) {
        super(name, lastName, birthDate);
        this.subjects = subjects;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String  toString() {
        return "Teacher{" +
                "subjects=" + subjects +
                '}';
    }
}
