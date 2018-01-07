package pl.yameo.internship.assignment.factoryGeometryShape;

import pl.yameo.internship.assignment.geometryShape.Ellipse;
import pl.yameo.internship.assignment.ScannerUtils;
import pl.yameo.internship.assignment.Shape;

import java.util.Scanner;

public class EllipseFactory implements ShapeFactory {

    @Override
    public Shape createNewShape(Scanner scanner) {
        System.out.println("Please provide two semi-axis lengths (major, minor):");
        return new Ellipse(ScannerUtils.readDouble(scanner), ScannerUtils.readDouble(scanner));
    }

    @Override
    public String getName() {
        return "Ellipse";
    }
}
