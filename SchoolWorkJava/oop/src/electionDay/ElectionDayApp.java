package electionDay;
import java.util.*;

public class ElectionDayApp{
    private static HashMap<Citizen,Boolean> citizens;
    private static HashMap<Party,Integer> parties;
    private static Scanner scan = new Scanner(System.in);

    public static void vote(Citizen citizen) throws InvalidPartyInfoException {
        try{
            for (Map.Entry<Citizen,Boolean> entry : citizens.entrySet()) {
                Citizen indexCitizen = entry.getKey();
                if(citizen.equals(indexCitizen)){
                    System.out.println("Input the party name: ");
                    String partyName = scan.nextLine();

                    boolean partyFlag = false;
                    for (Map.Entry<Party,Integer> partyEntry : parties.entrySet()) {
                        if(entry.getKey().getName().equals(partyName)){
                            Party tempParty = partyEntry.getKey();
                            parties.put(tempParty,parties.get(partyName)+1);
                            partyFlag = true;
                        }
                    }
                    if(!partyFlag){
                        throw new InvalidPartyInfoException("No party with such name");
                    }
                }
            }
        } catch (InvalidPartyInfoException e) {
            System.err.println(e.getMessage());
        }


    }


    public static void main(String[] args) {

        boolean flag = true;
        boolean login = false;
        int input;

        while(flag){
            System.out.println("***************************");
            System.out.println("Enter your citizen info (1): ");
            System.out.println("Exit (2): ");
            System.out.println("***************************");
            System.out.println("Input a choice: ");

            input = scan.nextInt();

            switch (input){
                case 1:
                    boolean citizenCheck = true;
                    try{
                        System.out.println("***************************");
                        System.out.println("Input user data");
                        System.out.println("Input name: ");
                        String name = scan.nextLine();
                        System.out.println("Input egn: ");
                        int egn = scan.nextInt();
                        System.out.println("***************************");
                        Citizen citizen = new Citizen(name, egn);

                        for (Map.Entry<Citizen,Boolean> entry : citizens.entrySet()) {
                            Citizen indexCitizen = entry.getKey();
                            if(citizen.equals(indexCitizen)){
                                citizenCheck = false;
                               throw new InvalidInfoException("The name, does not match the provided egn");
                            }
                        }
                        if(citizenCheck) {
                            citizens.put(citizen,false);
                        }
                    }
                    catch (InvalidInfoException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    flag = false;
                    break;
            }
        }
    }
}
