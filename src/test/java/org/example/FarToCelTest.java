package org.example;

import junit.framework.TestCase;
import org.example.FarToCel;

public class FarToCelTest extends TestCase {
    public void testFahrenheitToCelsius() {
        FarToCel fahrenheitToCelsius = new FarToCel();
        assertEquals(0.0, fahrenheitToCelsius.fahrenheitToCelsius(32));
    }

    public void testKelvinToCelsius() {
        FarToCel kelvintoCelsius = new FarToCel();
        // Allow a small tolerance for floating-point comparisons
        assertEquals(0.0, kelvintoCelsius.kelvintoCel(273.15F), 0.0001);
    }

}
