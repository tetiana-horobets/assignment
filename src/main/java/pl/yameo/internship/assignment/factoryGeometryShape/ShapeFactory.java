package pl.yameo.internship.assignment.factoryGeometryShape;

import pl.yameo.internship.assignment.Shape;
import java.util.Scanner;

public interface ShapeFactory {
    Shape createNewShape(Scanner scanner);
    String getName();
}
