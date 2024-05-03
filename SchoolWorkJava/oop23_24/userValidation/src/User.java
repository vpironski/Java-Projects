import java.util.regex.Pattern;

public class User implements ValidatePhoneNumber {
    private String username;
    private String password;
    private String phoneNum;

    public User(String username, String password, String phoneNum) {
        setUsername(username);
        setPassword(password);
        setPhoneNum(phoneNum);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        try{
            if (validatePhoneNumber(phoneNum)){
                this.phoneNum = phoneNum;
            }
        }catch (WrongPhoneNumberException e){
            System.err.println(e.getMessage());
        }
    }



    @Override
    public boolean validatePhoneNumber(String phoneNumber) throws WrongPhoneNumberException{
            if(Pattern.matches("^08[789][0-9]{7}$", phoneNumber)){
                return true;
            }
            else{
                throw new WrongPhoneNumberException("The phone number is invalid");
            }
    }

}
