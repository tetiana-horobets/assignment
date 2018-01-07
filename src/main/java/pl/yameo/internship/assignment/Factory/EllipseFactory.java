package pl.yameo.internship.assignment.Factory;

import pl.yameo.internship.assignment.Ellipse;
import pl.yameo.internship.assignment.ReadDouble;
import pl.yameo.internship.assignment.Shape;

import java.util.Scanner;

public class EllipseFactory implements ShapeFactory {

    @Override
    public Shape createNewShape(Scanner scanner) {
        System.out.println("Please provide two semi-axis lengths (major, minor):");
        return new Ellipse(ReadDouble.readDouble(scanner), ReadDouble.readDouble(scanner));
    }

    @Override
    public String getName() {
        return "Ellipse";
    }
}
