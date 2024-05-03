import java.util.*;
public class ValidationTest {
    public static List<User> users = new ArrayList<>();
    public static void main(String[] args) {
        users.add(new User("user1", "password123", "0874567890"));
        users.add(new User("user2", "password456", "0886543210"));
        users.add(new User("user3", "password789", "0891234567"));
        users.add(new User("admin","1234","0877063406"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerUser(users);
                    break;
                case 2:
                    loginUser(users);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    private static void registerUser(List<User> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scanner.nextLine();

        try {
            UserValidation.validateUsername(username);
        } catch (WrongUserException e) {
            System.out.println("Invalid username: " + e.getMessage());
            return;
        }

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        try {
            UserValidation.validatePassword(password);
        } catch (WrongUserException e) {
            System.out.println("Invalid password: " + e.getMessage());
            return;
        }

        System.out.println("Confirm password:");
        String confirmPassword = scanner.nextLine();

        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match.");
            return;
        }

        System.out.println("Enter phone number:");
        String phoneNumber = scanner.nextLine();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) == null) {
                users.add(new User(username, password, phoneNumber));
                System.out.println("User registered successfully!");
                return;
            }
        }

        System.out.println("User limit reached, cannot register.");
    }

    private static void loginUser(List<User>  users) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful!");
                return;
            }
        }

        System.out.println("Invalid username or password.");
    }
}


