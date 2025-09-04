package ohjelmistotuotanto_tht;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println(converter.fahrenheitToCelsius(20.0));
    }
}