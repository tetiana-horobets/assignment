package pl.yameo.internship.assignment;

import java.util.Arrays;
import java.util.List;

public class Square implements Shape{
    private double dimension;

	public Square(Double dimension) {
		this.dimension = dimension;
	}

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public List<Double> listDimensions() {
        return Arrays.asList(dimension);
    }

    @Override
    public Double calculateArea() {
        return Math.pow(dimension, 2);
    }

    @Override
    public Double calculatePerimeter() {
        return dimension * 4;
    }

    public void setDimension(double dimension) {
        this.dimension = dimension;
    }
}
