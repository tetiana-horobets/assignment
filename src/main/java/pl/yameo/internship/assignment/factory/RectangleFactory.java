package pl.yameo.internship.assignment.factory;

import pl.yameo.internship.assignment.ScannerUtils;
import pl.yameo.internship.assignment.geometryShape.Rectangle;
import pl.yameo.internship.assignment.Shape;

import java.util.Scanner;

public class RectangleFactory implements ShapeFactory {

    @Override
    public Shape createNewShape(Scanner scanner) {
        System.out.println("Please provide two edge lengths (height, width):");
        return new Rectangle(ScannerUtils.readDouble(scanner), ScannerUtils.readDouble(scanner));
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
