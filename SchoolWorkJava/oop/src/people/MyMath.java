package people;

public class MyMath {
    static int abs(int number) {
        if (number < 0) {
            number *= -1;
        }
        return number;
    }

    static int min(int number1, int number2) {
        if (number1 > number2) {
            return number2;
        }
        else{
            return number1;
        }
    }
    static int max(int number1, int number2) {
        if (number1 < number2) {
            return number2;
        }
        else{
            return number1;
        }
    }
}
