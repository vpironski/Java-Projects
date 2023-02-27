package week1_oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    public Person(String name, String lastName, LocalDate birthDate){
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    public Person(){
        this.name = "Vihren";
        this.lastName = "Pironski";
        this.birthDate = LocalDate.of(2006,6,30);
    }

    @Override
    public String toString() {
        LocalDate curDate = LocalDate.now();
        long age = ChronoUnit.YEARS.between(birthDate,curDate);
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
