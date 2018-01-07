package pl.yameo.internship.assignment.Factory;

import pl.yameo.internship.assignment.ReadDouble;
import pl.yameo.internship.assignment.Shape;
import pl.yameo.internship.assignment.Square;

import java.util.Scanner;

public class SquareFactory implements ShapeFactory {

    @Override
    public Shape createNewShape(Scanner scanner) {
        System.out.println("Please provide the edge length:");
        return new Square(ReadDouble.readDouble(scanner));
    }

    @Override
    public String getName() {
        return "Square";
    }
}
