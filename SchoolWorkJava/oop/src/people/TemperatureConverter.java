package people;

public class TemperatureConverter {
    static double convertFahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32)*0.5556;
    }
    static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
}
