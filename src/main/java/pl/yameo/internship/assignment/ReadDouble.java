package pl.yameo.internship.assignment;

import java.util.Scanner;

public class ReadDouble {
    public static Double readDouble(Scanner scanner) {
        Double value = null;
        while (value == null) {
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value == 0){
                    System.out.println("Please enter a value greater than 0");
                    value = null;
                }
            } else {
                scanner.next();
            }
        }
        return value;
    }
}
