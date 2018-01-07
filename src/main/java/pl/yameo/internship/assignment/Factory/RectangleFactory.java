package pl.yameo.internship.assignment.Factory;

import pl.yameo.internship.assignment.ReadDouble;
import pl.yameo.internship.assignment.Rectangle;
import pl.yameo.internship.assignment.Shape;

import java.util.Scanner;

public class RectangleFactory implements ShapeFactory {

    @Override
    public Shape createNewShape(Scanner scanner) {
        System.out.println("Please provide two edge lengths (height, width):");
        return new Rectangle(ReadDouble.readDouble(scanner), ReadDouble.readDouble(scanner));
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
