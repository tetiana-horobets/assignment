package pl.yameo.internship.assignment;

import java.util.Arrays;
import java.util.List;

public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public List<Double> listDimensions() {
		return Arrays.asList(radius);
	}

	@Override
	public Double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public Double calculatePerimeter() {
		return 2.0d * Math.PI * radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
