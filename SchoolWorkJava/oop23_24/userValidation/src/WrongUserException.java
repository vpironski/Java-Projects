public class WrongUserException extends Exception{
    public WrongUserException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
