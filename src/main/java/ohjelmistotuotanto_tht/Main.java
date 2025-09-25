package ohjelmistotuotanto_tht;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("fahrenheit to celcius -> " + converter.fahrenheitToCelsius(20.0));
        System.out.println("celcius to fahrenheit -> " + converter.celsiusToFahrenheit(16.0));
        System.out.println("Is extreme temp? -> " + converter.isExtremeTemperature(20.0));
        System.out.println("Kelvin to celcius -> " + converter.kelvinToCelsius(300.0));
    }
}