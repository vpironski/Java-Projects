import java.util.*;

public class TrainTicketSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Destination: ");
        int numDestinations = scan.nextInt();
        String [] destinations = new String[numDestinations];

        for (int i = 0; i < numDestinations; i++) {
           String input = scan.nextLine();
           destinations[i] = input;
        }

        List<String> tickets = new ArrayList<>();
        int [] counters = new int [numDestinations] ;
        int counter = 0;
        for (;;) {
            if(counter > numDestinations - 1){
                System.out.println("No more destinations left!");
                break;
            }
            String input = scan.nextLine();

            if(input.equals("NEXT DESTINATION")){
                counter++;
            } else{
                tickets.add(input);
            }
        }
        int [] prices = new int[numDestinations];
        for (int i = 0; i < numDestinations; i++) {
            // Не ми стига времето да я допиша, за това я описвам
            // Първо разделям билета на 2 със .split(" ")
            // и пресмятам годините и отстъпките
            // и след това сплитвам разделям часа на 2 .split(":") и пресмятам отстъпките спрямо часа
            // и последно използвайки списъка с броячите гледам колко билета са продадени спрямо индекс
            //и накрая записвам стойността в масива с цените
        }


    }



}
