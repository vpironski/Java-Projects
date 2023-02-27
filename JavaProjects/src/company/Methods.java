package company;

import java.util.Scanner;

public class Methods {
    static void login(){
        System.out.println("----------------");
        System.out.println("Password must have between 6 and 10 digits");
        System.out.println("Password must have at least 2 digits");
        System.out.println("----------------");
    }

    static void password(){
        System.out.println("----------------");
        System.out.println("Password is valid");
        System.out.println("----------------");
    }

    static void wrongPass(){
        System.out.println("----------------");
        System.out.println("Password must only consist of letters and digits");
        System.out.println("Password must have at least 2 digits");
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String log = input.nextLine();
        if (log == "login"){
            login();
        }
        else{
            System.out.println("Error, please try again");
        }
//        for (int i = 0; i < 2; i++) {
//            String pass = input.nextLine();
//            char ch;
//            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
//            }
//        }
    }
}
