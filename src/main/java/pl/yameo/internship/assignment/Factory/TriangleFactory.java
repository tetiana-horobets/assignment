package pl.yameo.internship.assignment.Factory;

import pl.yameo.internship.assignment.ReadDouble;
import pl.yameo.internship.assignment.Shape;
import pl.yameo.internship.assignment.Triangle;

import java.util.Scanner;

public class TriangleFactory implements ShapeFactory {

    @Override
    public Shape createNewShape(Scanner scanner) {
        System.out.println("Please provide three edge lengths:");
        return new Triangle(ReadDouble.readDouble(scanner), ReadDouble.readDouble(scanner),
                ReadDouble.readDouble(scanner));
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
