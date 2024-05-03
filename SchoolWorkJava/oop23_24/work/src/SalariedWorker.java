public class SalariedWorker extends Worker{

    public SalariedWorker(String name, String workType, double hourly) {
        setName(name);
        setWorkType(workType);
        setHoursWorked(40);
        setHourly(hourly);
    }

    @Override
    public double getWeeklySalary() {
        return getHoursWorked()*getHourly();
    }
}
