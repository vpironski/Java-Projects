public class WorkersTest {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new HourlyWorker("John", "Builder", 45, 10.0);
        workers[1] = new SalariedWorker("Alice", "Manager", 15.0);
        workers[2] = new HourlyWorker("Bob", "Store Clerk", 30, 12.0);
        workers[3] = new SalariedWorker("Eve", "Programmer", 20.0);
        workers[4] = new HourlyWorker("Carol", "Plumber", 50, 11.0);

        int totalHoursWorked = 0;
        double totalSalary = 0.0;

        for (Worker worker : workers) {
            totalHoursWorked += worker.getHoursWorked();
            totalSalary += worker.getWeeklySalary();
        }

        double averageHoursWorked = (double) totalHoursWorked / workers.length;
        double averageSalary = totalSalary / workers.length;

        System.out.println("Total hours worked: " + totalHoursWorked);
        System.out.println("Average hours worked: " + averageHoursWorked);
        System.out.println("Total salary: $" + totalSalary);
        System.out.println("Average salary: $" + averageSalary);
    }
}
