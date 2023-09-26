package people;

import java.time.LocalDate;

public class Student extends Person {
    int studentNumber;

    public Student(String name, String lastName, LocalDate birthDate, int studentNumber) {
        super(name, lastName, birthDate);
        this.studentNumber = studentNumber;
    }



    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Stundent{" +
                "studentNumber=" + studentNumber +
                '}';
    }
}
