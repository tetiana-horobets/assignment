package pl.yameo.internship.assignment.Factory;

import pl.yameo.internship.assignment.Circle;
import pl.yameo.internship.assignment.ReadDouble;
import pl.yameo.internship.assignment.Shape;

import java.util.Scanner;

public class CircleFactory implements ShapeFactory {

    @Override
    public Shape createNewShape(Scanner scanner) {
        System.out.println("Please provide the radius for the circle:");
        return new Circle(ReadDouble.readDouble(scanner));
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
