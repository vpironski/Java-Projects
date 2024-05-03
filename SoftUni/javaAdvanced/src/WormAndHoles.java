import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WormAndHoles {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);

            String[] wormsInput = scan.nextLine().split(" ");
            String[] holesInput = scan.nextLine().split(" ");
            ArrayList<Integer> worms = new ArrayList<>();
            ArrayList<Integer> holes = new ArrayList<>();
            for (String s : wormsInput) {
                worms.add(Integer.parseInt(s));
            }
            for (String s : holesInput) {
                holes.add(Integer.parseInt(s));
            }

            matchWormsAndHoles(worms, holes);

        }

    public static void matchWormsAndHoles(ArrayList<Integer> worms, ArrayList<Integer> holes) {
        int matchesCount = 0;
        int wormSize = worms.size();
        while(!holes.isEmpty() && !worms.isEmpty()){
            int wormInd = worms.size() - 1;

//worms.get(wormInd)
//            for (int i = 0; i < holes.size(); i++) {
//                if(worms.get(wormInd) == holes.get(i)){
//                    matchesCount++;
//                    worms.remove(wormInd);
//                    holes.remove(i);
//                    break;
//                }
//                else{
//                    worms.set(wormInd,worms.get(wormInd) - 3);
//                    if(worms.get(wormInd) <= 0){
//                        worms.remove(worms.get(wormInd));
//                        break;
//                    }
//                    wormInd -= 1;
//                    holes.remove(i);
//                }
//
//            }
//        }

            for (int i = worms.size()-1; i >= 0; i--) {
                for (int j = 0; j < holes.size(); j++) {
                    if(worms.get(i) == holes.get(j)){
                        matchesCount++;
                        worms.remove(i);
                        holes.remove(j);
                        j--;
                        break;
                    }
                    else{
                        worms.set(i,worms.get(i) - 3);
                        if(worms.get(i) <= 0){
                            worms.remove(worms.get(i));
                            break;
                        }
                        holes.remove(j);
                        j--;
                    }
                }
                if(holes.isEmpty()){
                    break;
                }
            }
        }
//        //first line
        if(matchesCount > 0){
            System.out.printf("Matches: %d\n", matchesCount);
        }
        else{
            System.out.println("There are no matches");
        }

        //second line
        if(matchesCount == wormSize){
            System.out.println("Every worm found a suitable hole!");
        }
        else if(worms.isEmpty()){
            System.out.println("Worms left: none");
        }
        else{
            System.out.print("Worms left: ");
            for (int i = 0; i < worms.size(); i++) {
                if(i + 1 == worms.size()){
                    System.out.println(worms.get(i));
                    break;
                }
                System.out.print(worms.get(i) +", ");
            }
        }

        //third line
        if(holes.isEmpty()){
            System.out.println("Holes left: none");
        }
        else{
            System.out.print("Holes left: ");
            for (int i = 0; i < holes.size(); i++) {
                if(i + 1 == holes.size()){
                    System.out.println(holes.get(i));
                    break;
                }
                System.out.print(holes.get(i) +", ");
            }
        }

    }
}
