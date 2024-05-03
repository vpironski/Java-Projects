import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printIntroduction();
        getBMI(scanner);
    }

    public static void printIntroduction() {
        System.out.println("BMI Calculator");
        System.out.println("This program calculates your Body Mass Index (BMI).");
    }

    public static void getBMI(Scanner scanner) {
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        double bmi = bmiFor(weightInKg, heightInCm);
        String status = getStatus(bmi);

        reportResults(bmi, status);
    }

    public static double bmiFor(double weightInKg, double heightInCm) {
        double heightInInches = heightInCm * 0.3937;
        double weightInLb = weightInKg * 2.2046;
        return (weightInLb * 703) / (heightInInches * heightInInches);
    }

    public static String getStatus(double bmi) {
        if (bmi <= 18.5) {
            return "underweight";
        } else if (bmi <= 25) {
            return "normal";
        } else if (bmi <= 30) {
            return "overweight";
        } else {
            return "obese";
        }
    }

    public static void reportResults(double bmi, String status) {
        System.out.println("Your BMI is: " + Math.round(bmi * 100.0) / 100.0);
        System.out.println("You are classified as: " + status);
    }
}
