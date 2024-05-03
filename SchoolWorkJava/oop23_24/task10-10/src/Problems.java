import java.util.*;

import static java.util.Arrays.*;

public class Problems {
    public static void swapValues() {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.printf("%.2f | %.2f", a, b);
    }

    public static void bonusPoints(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of points [1...9]: ");
        int points = scan.nextInt();

        int bonus = 0;

        if (points >= 1 && points <= 3) {
            bonus = points * 10;
        } else if (points >= 4 && points <= 6) {
            bonus = points * 100;
        } else if (points >= 7 && points <= 9) {
            bonus = points * 1000;
        } else {
            System.out.println("Invalid result");
            return;
        }

        System.out.println("Bonus points: " + bonus);
    }

    public static void productSign(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first real number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter the second real number: ");
        double num2 = scan.nextDouble();

        System.out.print("Enter the third real number: ");
        double num3 = scan.nextDouble();

        char sign;

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            sign = '0';
        } else {
            int negativeCount = 0;
            if (num1 < 0) {
                negativeCount++;
            }
            if (num2 < 0) {
                negativeCount++;
            }
            if (num3 < 0) {
                negativeCount++;
            }

            if (negativeCount % 2 == 0) {
                sign = '+';
            } else {
                sign = '-';
            }
        }

        System.out.println("The sign of the product is: " + sign);
    }

    public static void NumbersNotDivisibleBy3Or7(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a hole number: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i % 3 != 0){
                if(i % 7 != 0){
                    System.out.printf("%d ",i);
                }
            }
        }
    }

    public static void fromOneToN(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a hole number: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ",i);
        }
        for (int i = n - 1; i >= 1; i--) {
            System.out.printf("%d ",i);
        }
    }

    public static void printMatrix(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer n (1 ≤ n ≤ 20): ");
        int n = scan.nextInt();

        if (n < 1 || n > 20) {
            System.out.println("Invalid input. Please enter a positive integer between 1 and 20.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i + n - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void arrayComparison() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the arrays (n): ");
        int n = scan.nextInt();

        int[] array1 = fillArray(1, n, scan);
        int[] array2 = fillArray(2, n, scan);

        if (Arrays.equals(array1, array2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    private static int[] fillArray(int index, int size, Scanner scan) {
        int[] arr = new int[size];
        System.out.print("Enter elements for array " + index + ":\n");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void sortedArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        if (Arrays.equals(array, sortedArray)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void symmetricArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        boolean isSymmetric = true;
        for (int i = 0; i < size / 2; i++) {
            if (array[i] != array[size - 1 - i]) {
                isSymmetric = false;
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void repeatingNums(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int mostFrequentNumber = findMostFrequentNumber(array);

        if (mostFrequentNumber != -1) {
            System.out.println("The most frequent number is: " + mostFrequentNumber);
        } else {
            System.out.println("No duplicate numbers found.");
        }
    }

    private static int findMostFrequentNumber(int[] array) {
        Map<Integer, Integer> numberCountMap = new HashMap<>();

        for (int num : array) {
            numberCountMap.put(num, numberCountMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequentNumber = -1;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                mostFrequentNumber = number;
                maxCount = count;
            }
        }

        return mostFrequentNumber;
    }
    public static void findPairSum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        int[] pair = findPairWithSum(array, targetSum);

        if (pair != null) {
            System.out.println("Pair with sum " + targetSum + ": " + pair[0] + ", " + pair[1]);
        } else {
            System.out.println("No pair found with the specified sum.");
        }
    }

    private static int[] findPairWithSum(int[] array, int targetSum) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = targetSum - array[i];

            if (numToIndex.containsKey(complement)) {
                int index = numToIndex.get(complement);
                return new int[] { array[index], array[i] };
            }

            numToIndex.put(array[i], i);
        }

        return null;
    }

}
