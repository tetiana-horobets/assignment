package pl.yameo.internship.assignment;

import java.util.Scanner;

public class ReadDouble {
    public static Double readDouble(Scanner scanner) {
        Double value = null;
        while (value == null) {
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
            } else {
                scanner.next();
            }
        }
        return value;
    }
}
