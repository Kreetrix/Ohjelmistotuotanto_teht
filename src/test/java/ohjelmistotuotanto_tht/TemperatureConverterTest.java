package ohjelmistotuotanto_tht;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    double value1 = 20.0;
    double value2 = 15.0;
    double value3 = 0.0;

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals((value1 * 9 / 5) + 32, converter.celsiusToFahrenheit(value1));
        assertEquals((value2 * 9 / 5) + 32, converter.celsiusToFahrenheit(value2));
        assertEquals((value3 * 9 / 5) + 32, converter.celsiusToFahrenheit(value3));
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals((value1 - 32) * 5 / 9, converter.fahrenheitToCelsius(value1));
        assertEquals((value2 - 32) * 5 / 9, converter.fahrenheitToCelsius(value2));
        assertEquals((value3 - 32) * 5 / 9, converter.fahrenheitToCelsius(value3));
    }

    @Test
    void testIsExtremeTemperature() {
        assertEquals(true, converter.isExtremeTemperature(60.0));
        assertEquals(true, converter.isExtremeTemperature(-41.0));
        assertEquals(false, converter.isExtremeTemperature(20.0));
    }

    @Test
    void testKelvinToCelcius() {
        assertEquals(0, converter.kelvinToCelsius(273.15));
        assertEquals(200 - 273.15, converter.kelvinToCelsius(200));
    }

}
