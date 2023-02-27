package encryptionProgram;
import java.util.*;

public class Encryption {

    private final Scanner scanner;
    private final Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffleList;
    private char character;
    private char [] letters;


    Encryption(){
        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList();
        shuffleList = new ArrayList();
        character = ' ';

        newKey();
        askQuestion();
    }

    private void askQuestion(){
        while(true){
            System.out.println();
            System.out.println("*******************************");
            System.out.println("What do you want to do?");
            System.out.println("N - new key");
            System.out.println("G - get key");
            System.out.println("E - encrypt");
            System.out.println("D - decrypt");
            System.out.println("P - pin breaking");
            System.out.println("Q - quit");
            System.out.print("*******************************\n");
            System.out.print(": ");
            char response = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch (response){
                case'N':
                    newKey();
                    break;
                case'G':
                    getKey();
                    break;
                case'E':
                    encrypt();
                    break;
                case'D':
                    decrypt();
                    break;
                case'Q':
                    quit();
                    break;
                case'P':
                    PinHack pinHack = new PinHack();
                    break;

                default:
                    System.out.println("Not a valid command!");
            }
        }

    }

    private void newKey(){

        character = ' ';
        list.clear();
        shuffleList.clear();

        for (int i = 32; i < 127; i++) {
            list.add(Character.valueOf(character));
            character++;
        }

        shuffleList = new ArrayList(list);
        Collections.shuffle(shuffleList);
        System.out.println("*******************************");
        System.out.println("*A new key has been generated*");

    }

    private void getKey(){
        System.out.println();
        System.out.println("Key: ");
        System.out.println();

        for(Character x : list){
            System.out.print(x);
        }

        System.out.println();
        for(Character x : shuffleList){
            System.out.print(x);
        }

        System.out.println();
    }

    private void encrypt(){
        System.out.println("*******************************");
        System.out.println("Enter a message for encryption: ");
        String messege = scanner.nextLine();

        letters = messege.toCharArray();
        for (int i = 0; i < letters.length; i++) {

            for (int j = 0; j < list.size(); j++) {
                if (letters[i] == list.get(j)){
                    letters[i] = shuffleList.get(j);
                    break;
                }
            }
        }
        System.out.println("Encrypted message: ");
        for (char x : letters){
            System.out.print(x);
        }
        System.out.println();


    }

    private void decrypt(){
        System.out.println("*******************************");
        System.out.println("Enter a message for decryption: ");
        String messege = scanner.nextLine();

        letters = messege.toCharArray();
        for (int i = 0; i < letters.length; i++) {

            for (int j = 0; j < shuffleList.size(); j++) {

                if (letters[i] == shuffleList.get(j)){
                    letters[i] = list.get(j);
                    break;
                }
            }
        }
        System.out.println("Decrypted message: ");
        for (char x : letters){
            System.out.print(x);
        }
        System.out.println();



    }

    private void quit(){
        System.out.println("The program has been terminated");
        System.exit(0);

    }



}
