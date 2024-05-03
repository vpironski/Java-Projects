abstract class Worker {
    private String name;
    private String workType;
    private int hoursWorked;
    private double hourly;

    public abstract double getWeeklySalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourly() {
        return hourly;
    }

    public void setHourly(double hourly) {
        this.hourly = hourly;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hourWorked) {
        this.hoursWorked = hourWorked;
    }
}
