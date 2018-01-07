package pl.yameo.internship.assignment.Factory;

import pl.yameo.internship.assignment.ReadDouble;
import pl.yameo.internship.assignment.Shape;
import pl.yameo.internship.assignment.Trapezoid;

import java.util.Scanner;

public class TrapezoidFactory implements ShapeFactory {

    @Override
    public Shape createNewShape(Scanner scanner) {
        System.out.println("Please provide two base");
        double baseA = ReadDouble.readDouble(scanner);
        double baseB = ReadDouble.readDouble(scanner);
        System.out.println("Please provide two leg");
        double legA = ReadDouble.readDouble(scanner);
        double legB = ReadDouble.readDouble(scanner);
        System.out.println("Please provide altitude");
        double altitude = ReadDouble.readDouble(scanner);
        return new Trapezoid(baseA, baseB, legA, legB, altitude);
    }

    @Override
    public String getName() {
        return "Trapezoid";
    }
}
