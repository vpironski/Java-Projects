package people;

public class GreetingsGenerator {
    static void greetUser(){
        System.out.println("Greetings, user!");
    }
    static void greetUser(String userName){
        System.out.printf("Greetings %s !",userName);
    }
    static void greetUser(Person person){
        System.out.printf("Greetings %s %s!",person.getName(),person.getLastName());
    }
}
