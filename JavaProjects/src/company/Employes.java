package company;


import java.util.Scanner;

class Empleyesid {
    String name;
    Float sal;
    String pos;
    String depart;
    String email;
    int age;

    public Empleyesid(String name, Float sal, String pos, String depart, String email, int age) {
        this.name = name;
        this.sal = sal;
        this.pos = pos;
        this.depart = depart;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Empleyesid{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", pos='" + pos + '\'' +
                ", depart='" + depart + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Employes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Empleyesid id = new Empleyesid(scan.nextLine(),scan.nextFloat(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextInt());
        System.out.println(id);

    }
}

