package people;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void oldestPerson(ArrayList<Person> people){
        LocalDate max = people.get(0).getBirthDate();
        for (int i = 0; i < people.size(); i++) {
            LocalDate curr = people.get(i).getBirthDate();
            if(curr.isBefore(max)){
                max = curr;
            }
        }
        for (int i = 0; i < people.size(); i++) {
            if(max.equals(people.get(i).getBirthDate())){
                System.out.println(people.get(i));
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> predmeti = new ArrayList<>();
        predmeti.add("OOP");
        Person person = new Person();
        Student student  = new Student("Vihren","Pironski", LocalDate.of(2006,6,30),20108);
        Teacher teacher = new Teacher("Gosho","Pushkata",LocalDate.of(1945,3,1),predmeti);

        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(teacher);
        people.add(student);

        oldestPerson(people);
    }
}
