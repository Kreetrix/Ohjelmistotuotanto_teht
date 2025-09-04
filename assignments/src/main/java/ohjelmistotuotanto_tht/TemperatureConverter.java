package ohjelmistotuotanto_tht;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    public double celsiusToFahrenheit(double celcius) {
        return ((celcius * 9 / 5) + 32);
    }

    public boolean isExtremeTemperature(double celcius) {
        return (celcius > 50 || celcius < -40) ? true : false;
    }
}
