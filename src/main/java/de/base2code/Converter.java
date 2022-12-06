package de.base2code;

public class Converter {
    private final int number;

    public Converter(String number, int base) {
        this.number = Integer.parseInt(number, base);
    }

    public String convertTo(NumberSystems system) {
        return system.getPrefix() + Integer.toString(number, system.getBase()).toUpperCase();
    }
}
