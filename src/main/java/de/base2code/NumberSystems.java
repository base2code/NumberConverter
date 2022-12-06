package de.base2code;

public enum NumberSystems {
    BINARY(2, "b"),
    OCTAL(8, "0"),
    DECIMAL(10, ""),
    HEXADECIMAL(16, "0x");

    private final int base;
    private final String prefix;

    NumberSystems(int base, String prefix) {
        this.base = base;
        this.prefix = prefix;
    }

    public int getBase() {
        return base;
    }

    public String getPrefix() {
        return prefix;
    }
}
