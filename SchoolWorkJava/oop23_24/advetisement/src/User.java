import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String town;
    private ArrayList<Advertisement> myAdverts;

    public User(String name, String email, String password, String phoneNumber,String town) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.town = town;
    }
    public User() {
        this.name = "Vihren Pironski";
        this.email = "vpironski@gmail.com";
        this.password = "1234";
        this.town = "Sofia";
    }

    public User(String name) {
        this.name = name;
        this.email = "gosho@gosho.bg";
        this.password = "1234";
        this.phoneNumber = "0877378939";
        this.town = "Sliven";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name: '" + name + '\'' +
                ", email: '" + email + '\'' +
                ", password: '" + password + '\'' +
                ", town: '" + town + '\'' +
                ", myAdverts: " + myAdverts +
                '}';
    }
}
