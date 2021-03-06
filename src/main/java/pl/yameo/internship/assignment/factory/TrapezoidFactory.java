package pl.yameo.internship.assignment.factory;

import pl.yameo.internship.assignment.ScannerUtils;
import pl.yameo.internship.assignment.shape.Shape;
import pl.yameo.internship.assignment.shape.Trapezoid;

import java.util.Scanner;

public class TrapezoidFactory implements ShapeFactory {

    @Override
    public Shape createNewShape(Scanner scanner) {
        System.out.println("Please provide longer base");
        double baseA = ScannerUtils.readDouble(scanner);

        System.out.println("Please provide shorter base");
        double baseB = ScannerUtils.readDouble(scanner);

        System.out.println("Please provide first leg");
        double legA = ScannerUtils.readDouble(scanner);

        System.out.println("Please provide second leg");
        double legB = ScannerUtils.readDouble(scanner);

        return new Trapezoid(baseA, baseB, legA, legB);
    }

    @Override
    public String getName() {
        return "Trapezoid";
    }
}
