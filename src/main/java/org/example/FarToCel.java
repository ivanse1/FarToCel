package org.example;


public class FarToCel {
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static float kelvintoCel(float kel){
        return (float) (kel-273.15);
    }
}