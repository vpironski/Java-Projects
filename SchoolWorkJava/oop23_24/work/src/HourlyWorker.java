public class HourlyWorker extends Worker{

    public HourlyWorker(String name, String workType, int hoursWorked, double hourly) {
        setName(name);
        setWorkType(workType);
        setHoursWorked(hoursWorked);
        setHourly(hourly);
    }

    @Override
    public double getWeeklySalary() {
        if(getHoursWorked() <= 40){
            return getHoursWorked()*getHourly();
        }
        else{
            return getHoursWorked()*(getHourly()*1.5);
        }
    }
}
