package pl.yameo.internship.assignment;

import org.junit.Assert;
import org.junit.Test;
import pl.yameo.internship.assignment.Factory.ShapeFactory;
import pl.yameo.internship.assignment.Factory.SquareFactory;

public class SquareTest {
	private static final double DELTA = 0.001;
	private static final double INITIAL_DIMENSION = 4.0;
	private static final String SHAPE_NAME = "Square";
	private static final double INITIAL_AREA = 16.0;
	private static final double INITIAL_PERIMETER = 16.0;


	@Test
	public void when_square_created_then_it_has_proper_name() {
		ShapeFactory square = new SquareFactory();
		Assert.assertEquals(square.getName(), SHAPE_NAME);
	}

	@Test
	public void when_square_is_created_then_proper_dimensions_are_returned() {
		Square square = new Square(INITIAL_DIMENSION);
		Assert.assertEquals(square.listDimensions().get(0), INITIAL_DIMENSION, DELTA);
	}

	@Test
	public void when_square_is_created_then_area_are_returned() {
		Square square = new Square(INITIAL_DIMENSION);
		Assert.assertEquals(square.calculateArea(), INITIAL_AREA, DELTA);
	}

	@Test
	public void when_square_is_created_then_perimeter_are_returned() {
		Square square = new Square(INITIAL_DIMENSION);
		Assert.assertEquals(square.calculatePerimeter(), INITIAL_PERIMETER, DELTA);
	}
}
