package org.example;

public class ToyService {

    // Returns the toy name for a given toy id
    public String getToyName(int toyId) {
        switch (toyId) {
            case 1:
                return "Lego";
            case 2:
                return "Barbie";
            default:
                // Fallback if unknown toy
                return getFallbackName();
        }
    }

    // Method used as fallback in the spy test
    public String getFallbackName() {
        return "Unknown toy";
    }
}
