package pl.yameo.internship.assignment.shape;

import pl.yameo.internship.assignment.Shape;

import java.util.Arrays;
import java.util.List;

public class Triangle implements Shape {
	private Double edgeA;
	private Double edgeB;
	private Double edgeC;


	public Triangle(Double edgeA, Double edgeB, Double edgeC) {
		this.edgeA = edgeA;
		this.edgeB = edgeB;
		this.edgeC = edgeC;

		if (edgeA + edgeB <= edgeC || edgeA + edgeC <= edgeB || edgeC + edgeB <= edgeA){
			throw new IllegalArgumentException("A Triangle With These Dimensions Cannot Exist");
		}
	}

	@Override
	public final List<Double> listDimensions() {
		return Arrays.asList(edgeA, edgeB, edgeC);
	}

	@Override
	public final Double calculateArea() {
		Double halfPerimeter = calculatePerimeter() / 2;
		return Math.sqrt(halfPerimeter * (halfPerimeter - edgeA) * (halfPerimeter - edgeB)
				* (halfPerimeter - edgeC));
	}

	@Override
	public final Double calculatePerimeter() {
		return edgeA + edgeB + edgeC;
	}
}
