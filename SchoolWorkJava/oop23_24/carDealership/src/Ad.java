import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Ad {
    private List<Automobile> automobiles;

    public Ad(List<Automobile> automobiles) {
        this.automobiles = automobiles;
    }

    public List<Automobile> getAutomobiles() {
        return automobiles;
    }

    public void setAutomobiles(List<Automobile> automobiles) {
        this.automobiles = automobiles;
    }

    public void addAutomobile(Automobile automobile) throws ExistingAutomobileException{
        boolean flag = false;
        for (Automobile automobileInd : automobiles) {
            if(automobile.equals(automobileInd)){
                flag = true;
            }
        }
        if(!flag){
            throw new ExistingAutomobileException("This automobile is already in the ad");
        }
        else{
            automobiles.add(automobile);
        }
    }

    public void removeAutomobile(String engineID) throws AutomobileNotFoundException{
        boolean flag = false;
        for (Automobile automobile : automobiles) {
            if(engineID.equals(automobile.getEngineID())){
                flag = true;
                automobiles.remove(automobile);
            }
        }
        if(!flag){
            throw new AutomobileNotFoundException("This automobile is not in the ad");
        }
    }

    public void getAutomobileInfo(String brand, String model) {
        if (brand.isEmpty()) {
            for (Automobile automobile : automobiles) {
                System.out.println(automobile);
            }
        } else {
            for (Automobile automobile : automobiles) {
                if (automobile.getBrand().equalsIgnoreCase(brand) && automobile.getModel().equalsIgnoreCase(model)) {
                    System.out.println(automobile);
                }
            }
        }
    }

    public double highestPrice(){
        double price = 0;
        for (Automobile automobile : automobiles) {
            if(price < automobile.getPrice()){
                price = automobile.getPrice();
            }
        }
        return price;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "automobiles=" + automobiles +
                '}';
    }
}

