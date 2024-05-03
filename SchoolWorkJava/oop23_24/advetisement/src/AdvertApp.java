import java.text.DecimalFormat;
import java.util.*;
import java.lang.Math;

public class AdvertApp {
    public static void getAds(ArrayList<Advertisement> adverts)
    {
        System.out.println(Arrays.toString(adverts.toArray()));
        System.out.println("********************************");
    }
    public static void addAd(ArrayList<Advertisement> adverts, Advertisement objAd)
    {
        adverts.add(objAd);
    }


    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User myUser = new User();
        User firstUser = new User("Gosho");
        users.add(myUser);
        users.add(firstUser);
        ArrayList<Advertisement> adverts = new ArrayList<>();
        Advertisement myAd = new Advertisement();
        adverts.add(myAd);

        int userIndex = 0;
        boolean commandFlag = false;
        boolean loginFlag = false;
        while(!loginFlag) {

            System.out.println("Login or Create account(login or create): ");
            String loginInput = scan.nextLine();
            loginInput.toLowerCase();
            if(loginInput.equals("login"))
            {
                System.out.println("Input the email and password");
                System.out.println("Email: ");
                String email = scan.nextLine();
                System.out.println("Password: ");
                String password = scan.nextLine();

                for (User user : users) {
                    if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                        loginFlag = true;
                        break;
                    } else {
                        System.out.println("Error: account not found");
                    }
                    userIndex ++;
                }
            }
            else if(loginInput.equals("create"))
            {
//                System.out.println("Functionality not ready!");
//                System.out.println("Try again later!");
                System.out.println("Input needed user info");

                System.out.println("Full name: ");
                String name = scan.nextLine();

                System.out.println("Email: ");
                String email = scan.nextLine();

                System.out.println("Password: ");
                String password = scan.nextLine();

                System.out.println("Phone number: ");
                String phoneNum = scan.nextLine();

                System.out.println("Living in: ");
                String town = scan.nextLine();

                for (User user : users) {
                    if (user.getEmail().equals(email)) {
                        System.out.println("Error: the email is already used by an account");
                    }
                    else{
                        User newUser = new User(name, email, password, phoneNum, town);
                        users.add(newUser);
                        loginFlag = true;
                        break;
                         }
                    userIndex ++;
                }

            }
        }
        while (!commandFlag) {
            System.out.println("********************************");
            System.out.println("See the advertisements (getAds)");
            System.out.println("Create an advertisement (setAd)");
            System.out.println("Exit the program (Exit)");
            System.out.println("Enter command: ");
            String userInput = scan.nextLine();
            System.out.println("********************************");
            userInput.toLowerCase();

            switch (userInput) {
                case "getads" -> getAds(adverts);
                case "setad" -> {
                    System.out.println("Input the title: ");
                    String title = scan.nextLine();

                    System.out.println("Input the contents: ");
                    String contents = scan.nextLine();

                    System.out.println("Input the price(format 00.00): ");
                    double price = Double.parseDouble(df.format(scan.nextDouble()));

                    System.out.println("Input the category: ");
                    String category = scan.nextLine();
                    Advertisement newAd = new Advertisement(title, contents, users.get(userIndex).getName(), users.get(userIndex).getPhoneNumber(), users.get(userIndex).getTown(), price, category);
                    addAd(adverts, newAd);
                    getAds(adverts);
                }
                case "exit" -> commandFlag = true;
                default -> System.out.println("Error: wrong command");
            }
            //login form
            //User -> name, phone, town, adverts list, email, password
            //ad -> category
        }
    }
}
