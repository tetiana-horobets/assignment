package pl.yameo.internship.assignment.factory;

import pl.yameo.internship.assignment.geometryShape.Circle;
import pl.yameo.internship.assignment.ScannerUtils;
import pl.yameo.internship.assignment.Shape;

import java.util.Scanner;

public class CircleFactory implements ShapeFactory {

    @Override
    public Shape createNewShape(Scanner scanner) {
        System.out.println("Please provide the radius for the circle:");
        return new Circle(ScannerUtils.readDouble(scanner));
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
