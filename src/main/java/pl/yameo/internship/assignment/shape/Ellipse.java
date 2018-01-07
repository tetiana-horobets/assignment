package pl.yameo.internship.assignment.shape;

import pl.yameo.internship.assignment.Shape;

import java.util.Arrays;
import java.util.List;

public class Ellipse implements Shape {
	private Double semiMajorAxis;
	private Double semiMinorAxis;

	public Ellipse(Double semiMajorAxis, Double semiMinorAxis) {
		this.semiMajorAxis = semiMajorAxis;
		this.semiMinorAxis = semiMinorAxis;

		if (semiMajorAxis < semiMinorAxis){
			throw new IllegalArgumentException("Major axis can’t be less than minor");
		}
	}

	@Override
	public final List<Double> listDimensions() {
		return Arrays.asList(semiMajorAxis, semiMinorAxis);
	}

	@Override
	public final Double calculateArea() {
		return Math.PI * semiMajorAxis * semiMinorAxis;
	}

	@Override
	public final Double calculatePerimeter() {
		return Math.PI * (3 * (semiMajorAxis + semiMinorAxis)
				/ 2 - Math.sqrt(semiMajorAxis * semiMinorAxis));
	}
}
