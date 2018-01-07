package pl.yameo.internship.assignment.shape;

import pl.yameo.internship.assignment.Shape;

import java.util.Collections;
import java.util.List;

public class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public List<Double> listDimensions() {
		return Collections.singletonList(radius);
	}

	@Override
	public Double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public Double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
}
