package pl.yameo.internship.assignment.shape;

import java.util.Arrays;
import java.util.List;

public class Rectangle implements Shape {
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public final List<Double> listDimensions() {
        return Arrays.asList(height, width);
    }

    @Override
    public final Double calculateArea() {
        return height * width;
    }

    @Override
    public final Double calculatePerimeter() {
        return 2 * (height + width);
    }
}
