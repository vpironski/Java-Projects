public class Pilot {
    private String name;
    private String sNum;
    private int birthYear;
    private int hoursFlown;

    public Pilot(String name, String sNum, int birthYear, int hoursFlown) {
        this.name = name;
        this.sNum = sNum;
        this.birthYear = birthYear;
        this.hoursFlown = hoursFlown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsNum() {
        return sNum;
    }

    public void setsNum(String sNum) {
        this.sNum = sNum;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getHoursFlown() {
        return hoursFlown;
    }

    public void setHoursFlown(int hoursFlown) {
        this.hoursFlown = hoursFlown;
    }

    @Override
    public String toString() {
        return "Pilot{" + "name='" + name + '\'' + ", sNUm='" + sNum + '\'' +
                ", birthYear=" + birthYear + ", hoursFlown=" + hoursFlown + '}';
    }

    public int pilotAge(int year){
        return year - this.birthYear;
    }

}
