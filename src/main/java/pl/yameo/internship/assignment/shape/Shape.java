package pl.yameo.internship.assignment.shape;

import java.util.List;

public interface Shape {
    List<Double> listDimensions();

    Double calculateArea();

    Double calculatePerimeter();
}
