import java.util.Scanner;

public class BrokenDevice extends Device{
    private String symptoms;
    private int dayRepair;

    public BrokenDevice(String manufacturer, String model, double price, String symptoms, int dayRepair) {
        super(manufacturer, model, price);
        this.symptoms = symptoms;
        this.dayRepair = dayRepair;
    }

    public BrokenDevice() {
        super("LG", "Computer M94", 1999.90);
        this.symptoms = "Broken screen";
        this.dayRepair = 2;
    }

    @Override
    public String toString() {
        return "BrokenDevice{" +
                "symptoms='" + symptoms + '\'' +
                ", dayRepair=" + dayRepair +
                '}';
    }

    public BrokenDevice createBrokenDevice(Scanner scan){
        return new BrokenDevice(scan.nextLine(), scan.nextLine(), scan.nextDouble(), scan.nextLine(), scan.nextInt());
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getDayRepair() {
        return dayRepair;
    }

    public void setDayRepair(int dayRepair) {
        this.dayRepair = dayRepair;
    }
}
