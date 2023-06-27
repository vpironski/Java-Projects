package people;

import java.lang.reflect.Array;
import java.util.*;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Employee>> departments = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            String email = "n/a";
            int age = -1;

            if (input.length == 6) {
                email = input[4];
                age = Integer.parseInt(input[5]);
            } else if (input.length == 5) {
                boolean isDigit = false;

                try {
                    age = Integer.parseInt(input[4]);
                    isDigit = true;
                } catch (NumberFormatException e) {
                    email = input[4];
                }

                if (!isDigit) {
                    email = input[4];
                    age = -1;
                }
            }

            Employee employee = new Employee(name, salary, position, department, email, age);

            departments.putIfAbsent(department, new ArrayList<>());
            departments.get(department).add(employee);
        }

        String highestAverageSalaryDepartment = "";
        double highestAverageSalary = Double.MIN_VALUE;

        for (Map.Entry<String, List<Employee>> entry : departments.entrySet()) {
            double totalSalary = 0;

            for (Employee employee : entry.getValue()) {
                totalSalary += employee.getSalary();
            }

            double averageSalary = totalSalary / entry.getValue().size();

            if (averageSalary > highestAverageSalary) {
                highestAverageSalary = averageSalary;
                highestAverageSalaryDepartment = entry.getKey();
            }
        }

        System.out.println("Highest Average Salary:");
        System.out.println(highestAverageSalaryDepartment);

        List<Employee> employeesInHighestSalaryDepartment = departments.get(highestAverageSalaryDepartment);
        employeesInHighestSalaryDepartment.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        for (Employee employee : employeesInHighestSalaryDepartment) {
            System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        }
    }
}
