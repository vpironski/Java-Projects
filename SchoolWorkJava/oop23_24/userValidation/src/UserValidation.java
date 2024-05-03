import java.util.regex.Pattern;

public class UserValidation {
    public static boolean validatePassword(String password) throws WrongUserException{
        try {
            if (Pattern.matches("^[a-zA-Z]{11,}$", password)) {
                return true;
            } else {
                throw new WrongUserException("Incorrect formatting of the password");
            }
        } catch (WrongUserException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    public static boolean validateUsername(String username) throws WrongUserException{
        try {
        if (Pattern.matches("^[a-z0-9_-]{3,15}$", username)) {
            return true;
        } else {
            throw new WrongUserException("Incorrect formatting of the password");
        }
        } catch (WrongUserException e){
        System.err.println(e.getMessage());
        }return false;
    }
}

