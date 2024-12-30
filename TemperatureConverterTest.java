package w4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

	@Test
	void testCelsiusToFahrenheit() {
        // Arrange
        double celsius = 0.0;
        double expectedFahrenheit = 32.0;

        // Act
        double actualFahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);

        // Assert
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "Celsius to Fahrenheit conversion failed");
    }

    @Test
    void testFahrenheitToCelsius() {
        // Arrange
        double fahrenheit = 32.0;
        double expectedCelsius = 0.0;

        // Act
        double actualCelsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assertEquals(expectedCelsius, actualCelsius, 0.001, "Fahrenheit to Celsius conversion failed");
    }

    @Test
    void testCelsiusToFahrenheitWithRandomValue() {
        // Arrange
        double celsius = 100.0;
        double expectedFahrenheit = 212.0;

        // Act
        double actualFahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);

        // Assert
        assertEquals(expectedFahrenheit, actualFahrenheit, 0.001, "Celsius to Fahrenheit conversion failed");
    }

    @Test
    void testFahrenheitToCelsiusWithRandomValue() {
        // Arrange
        double fahrenheit = 212.0;
        double expectedCelsius = 100.0;

        // Act
        double actualCelsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        assertEquals(expectedCelsius, actualCelsius, 0.001, "Fahrenheit to Celsius conversion failed");
    }
}
