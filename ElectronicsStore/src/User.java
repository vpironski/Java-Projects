public class User {
    private int id;
    private String userName;
    private String password;
    private boolean isEmployee;


    public User(int id, String userName, String password, boolean isEmployee) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.isEmployee = isEmployee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }


    public void buyItem(String item){
        System.out.printf("You successfully bought: %s \n", item);
    }
}
