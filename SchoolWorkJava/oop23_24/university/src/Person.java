
public class Person {
    private String name;
    private String egn;

    public Person(String name, String egn) {
        this.name = name;
        this.egn = egn;
    }

    public Person(){
        this.name = "Vihren Nikolaev Pironski";
        this.egn = "064630****";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }
}
