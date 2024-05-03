import java.util.Scanner;

public class TestPilot {
    private static Pilot[] pilots;
    private static RetiredPilot[] retiredPilots;

    public static boolean pilotSearch(Pilot[] pilots, Pilot pilot){
        for (Pilot iPilot : pilots) {
            if (iPilot.getsNum().equals(pilot.getsNum())) {
                return true;
            }
        }
        return false;
    }
    public static void actualisePilot(Pilot[] pilots, Pilot newPilot, String sNum){
        for (Pilot pilot : pilots) {
            if(pilot.getsNum().equals(sNum)){
                pilot.setName(newPilot.getName());
                pilot.setsNum(newPilot.getsNum());
                pilot.setBirthYear(newPilot.getBirthYear());
                pilot.setHoursFlown(newPilot.getHoursFlown());
            }
        }
    }

    public static RetiredPilot mostHours(RetiredPilot[] retiredPilots){
        int hoursIndex = 0;
        int maxHours = retiredPilots[0].getHoursFlown();
        for (int i=0; i < retiredPilots.length;i++) {
            if(retiredPilots[i].getHoursFlown() > maxHours){
                maxHours = retiredPilots[i].getHoursFlown();
                hoursIndex = i;
            }
        }

        return retiredPilots[hoursIndex];
    }


}
