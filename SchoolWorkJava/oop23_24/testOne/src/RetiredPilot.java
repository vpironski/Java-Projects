public class RetiredPilot extends Pilot{

    private int retirementYear;
    public RetiredPilot(String name, String sNum, int birthYear, int hoursFlown, int retirementYear) {
        super(name, sNum, birthYear, hoursFlown);
        this.retirementYear = retirementYear;
    }

    public int getRetirementYear() {
        return retirementYear;
    }

    public void setRetirementYear(int retirementYear) {
        this.retirementYear = retirementYear;
    }

    public RetiredPilot retiring(Pilot pilot, int retirementYear){
        return new RetiredPilot(pilot.getName(),pilot.getsNum(),pilot.getBirthYear(),pilot.getHoursFlown(),retirementYear);
    }

    @Override
    public String toString() {
        return "RetiredPilot{" + "name='" + this.getName() + '\'' + ", sNUm='" + this.getsNum() + '\'' +
                ", birthYear=" + this.getBirthYear() + ", hoursFlown=" + this.getHoursFlown() + "retirementYear=" + retirementYear + '}';
    }
}
