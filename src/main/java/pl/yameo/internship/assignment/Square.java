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

    public void setWidth(double width) {
        if (width != dimension){
            this.dimension = width;
        }
    }

    public void setHeight(double height) {
        if (height != dimension){
            this.dimension = height;
        }
    }

    public void setDimension(Double dimension) {
        setHeight(dimension);
        setWidth(dimension);
    }

    @Override
    public List<Double> listDimensions() {
        return Arrays.asList(dimension, dimension);
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
