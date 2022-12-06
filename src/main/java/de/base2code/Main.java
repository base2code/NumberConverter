package de.base2code;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int random = ThreadLocalRandom.current().nextInt(0, 100);

            Converter number = new Converter(Integer.toString(random), NumberSystems.DECIMAL.getBase());
            NumberSystems sourceNumberSystem = NumberSystems.values()[ThreadLocalRandom.current().nextInt(0, NumberSystems.values().length)];
            NumberSystems targetNumberSystem = NumberSystems.values()[ThreadLocalRandom.current().nextInt(0, NumberSystems.values().length)];

            if (sourceNumberSystem == targetNumberSystem) {
                continue;
            }

            System.out.println("Convert " + number.convertTo(sourceNumberSystem) + " from " + sourceNumberSystem + " to " + targetNumberSystem);
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String converted = number.convertTo(targetNumberSystem);
            if (input.equalsIgnoreCase(converted)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong! The correct answer is " + converted);
            }
        }
    }
}