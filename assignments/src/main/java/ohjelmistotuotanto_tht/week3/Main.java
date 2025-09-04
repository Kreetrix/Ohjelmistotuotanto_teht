package ohjelmistotuotanto_tht.week3;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println(converter.fahrenheitToCelsius(20.0));
    }
}