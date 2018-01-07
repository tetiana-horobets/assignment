package pl.yameo.internship.assignment.shape;

import pl.yameo.internship.assignment.Shape;

import java.util.Collections;
import java.util.List;

public class Square implements Shape {
    private double dimension;

	public Square(Double dimension) {
		this.dimension = dimension;
	}

    @Override
    public List<Double> listDimensions() {
        return Collections.singletonList(dimension);
    }

    @Override
    public Double calculateArea() {
        return Math.pow(dimension, 2);
    }

    @Override
    public Double calculatePerimeter() {
        return dimension * 4;
    }
}
