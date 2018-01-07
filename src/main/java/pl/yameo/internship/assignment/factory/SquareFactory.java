package pl.yameo.internship.assignment.factory;

import pl.yameo.internship.assignment.ScannerUtils;
import pl.yameo.internship.assignment.Shape;
import pl.yameo.internship.assignment.shape.Square;

import java.util.Scanner;

public class SquareFactory implements ShapeFactory {

    @Override
    public Shape createNewShape(Scanner scanner) {
        System.out.println("Please provide the edge length:");
        return new Square(ScannerUtils.readDouble(scanner));
    }

    @Override
    public String getName() {
        return "Square";
    }
}
