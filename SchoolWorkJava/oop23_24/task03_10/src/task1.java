import java.util.*;

public class task1 {
    public static int addition() {
        Scanner scan = new Scanner(System.in);
        int number, sum = 0;
        for (int i = 0; i < 3; i++) {
            number = scan.nextInt();
            sum += number;
        }
        return sum;
    }

    public static int comparison() {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer num1 = scan.nextInt();
        Integer num2 = scan.nextInt();
        map.put(1, num1);
        map.put(-1, num2);
        map.put(0, num1);
        int key = num1.compareTo(num2);
        int result = map.get(key);
        return result;
    }

    public static int addition2() {
        Scanner scan = new Scanner(System.in);
        int number, sum = 0;
        for (int i = 0; i < 5; i++) {
            number = scan.nextInt();
            sum += number;
        }
        return sum;
    }

    public static int biggestSmallest() {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);

        return min + max;
    }

    public static void swapValues() {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double temp;
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }
        System.out.printf("%f | %f", x, y);
    }

    public static int biggestNumber() {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public static void sortedInt() {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int temp;
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 < num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.printf("%d | %d | %d", num1, num2, num3);
    }

    public static String strDigit() {
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        String digitWord;

        switch (digit) {
            case 0:
                digitWord = "zero";
                break;
            case 1:
                digitWord = "one";
                break;
            case 2:
                digitWord = "two";
                break;
            case 3:
                digitWord = "three";
                break;
            case 4:
                digitWord = "four";
                break;
            case 5:
                digitWord = "five";
                break;
            case 6:
                digitWord = "six";
                break;
            case 7:
                digitWord = "seven";
                break;
            case 8:
                digitWord = "eight";
                break;
            case 9:
                digitWord = "nine";
                break;
            default:
                digitWord = "not a digit";
                break;
        }
        return digitWord;
    }

    public static int biggestOfFive() {
        Scanner scan = new Scanner(System.in);
        int num;
        int biggest = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            num = scan.nextInt();
            if (num > biggest) {
                biggest = num;
            }
        }
        return biggest;
    }

    public static void typePicker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a data type (int, double, or String):");
        String choice = scanner.nextLine();

        switch (choice) {
            case "int":
                System.out.println("Enter an integer:");
                int intValue = scanner.nextInt();
                intValue++;
                System.out.println(intValue);
                break;

            case "double":
                System.out.println("Enter a double:");
                double doubleValue = scanner.nextDouble();
                doubleValue++;
                System.out.println(doubleValue);
                break;

            case "String":
                System.out.println("Enter a string:");
                String stringValue = scanner.nextLine();
                stringValue = stringValue + "*";
                System.out.println(stringValue);
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

        public static void factorial(){
            Scanner scan = new Scanner(System.in);
            int i,fact = 1;
            int number = scan.nextInt();
            for(i = 1; i <= number; i++){
                System.out.print(fact*i + " ");
            }

        }
        public static void inputParameters() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of integers (n): ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Invalid input. Please enter a positive integer for n.");
                return;
            }

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int sum = 0;

            System.out.println("Enter " + n + " integers:");

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();

                max = Math.max(max, num);
                min = Math.min(min, num);
                sum += num;
            }

            double average = (double) sum / n;

            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        }


    public static void arraySum(){
        Scanner scan = new Scanner(System.in);
        int number, sum = 0;
        int[] array = new int[10];
            for (int i = 0; i < 10; i++) {
                number = scan.nextInt();
                sum += number;
                array[i] = number;
            }
            System.out.println("The sum is: " + sum);
            for (int i = 0; i < array.length; i++) {
                System.out.printf("%d | ", array[i]);
            }
    }
}


