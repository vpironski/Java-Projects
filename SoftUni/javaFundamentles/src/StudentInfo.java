import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int age = scan.nextInt();
        float avgGrade = scan.nextFloat();

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, avgGrade);


    }
}