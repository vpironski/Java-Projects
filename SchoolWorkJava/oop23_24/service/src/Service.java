import java.util.*;
public class Service {
    private List<Device> devices;
    private List<BrokenDevice> brokenDevices;

    public Service(List<Device> devices, List<BrokenDevice> brokenDevices) {
        this.devices = devices;
        this.brokenDevices = brokenDevices;
    }

    @Override
    public String toString() {
        return "Service{" +
                "devices=" + devices +
                ", brokenDevices=" + brokenDevices +
                '}';
    }

    public void inputDevices(List<Device> devices){
        for (Device device : devices){
            if(device instanceof BrokenDevice){
                brokenDevices.add((BrokenDevice) device);
            }
            else{
                devices.add(device);
            }
        }
    }

    public void addDevice(Device device){
        if(device instanceof BrokenDevice){
            brokenDevices.add((BrokenDevice) device);
        }
        else{
            devices.add(device);
        }
    }

    public void addBrokenDevice(BrokenDevice brokenDevice) {
            brokenDevices.add(brokenDevice);
    }

    public void repairedDevice (BrokenDevice brokenDevice){
        brokenDevices.remove(brokenDevice);
        devices.add(brokenDevice);
    }

    public List<BrokenDevice> getDeviceSymptoms(String symptom){
        List<BrokenDevice> symptomDevices = new ArrayList<>();
        for(BrokenDevice device : brokenDevices){
            if(device.getSymptoms().equals(symptom)){
                symptomDevices.add(device);
            }
        }
        return symptomDevices;

    }

    public double getAllPrices(){
        double price = 0.00;
        for(Device device : devices){
            price += device.getPrice();
        }
        for(BrokenDevice device : brokenDevices){
            price += device.getPrice();
        }
        return price;
    }

    public double profit(Double pricePerDay){
        double price = 0.00;
        for(BrokenDevice device : brokenDevices){
            price += device.getDayRepair() * pricePerDay;
        }
        return price;
    }
}

