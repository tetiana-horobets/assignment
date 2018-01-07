package pl.yameo.internship.assignment.factory;

import pl.yameo.internship.assignment.ScannerUtils;
import pl.yameo.internship.assignment.Shape;
import pl.yameo.internship.assignment.shape.Triangle;

import java.util.Scanner;

public class TriangleFactory implements ShapeFactory {

    @Override
    public Shape createNewShape(Scanner scanner) {
        System.out.println("Please provide three edge lengths:");
        return new Triangle(ScannerUtils.readDouble(scanner), ScannerUtils.readDouble(scanner),
                ScannerUtils.readDouble(scanner));
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
