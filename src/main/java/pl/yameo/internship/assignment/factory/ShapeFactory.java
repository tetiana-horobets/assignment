package pl.yameo.internship.assignment.factory;

import pl.yameo.internship.assignment.shape.Shape;

import java.util.Scanner;

public interface ShapeFactory {
    Shape createNewShape(Scanner scanner);

    String getName();
}
