package pl.yameo.internship.assignment;

import org.junit.Assert;
import org.junit.Test;
import pl.yameo.internship.assignment.factory.CircleFactory;
import pl.yameo.internship.assignment.shape.Circle;

public class CircleTest {

    private static final double DELTA = 0.001;
    private static final double INITIAL_DIMENSION = 4.0;
    private static final String SHAPE_NAME = "Circle";
    private static final double INITIAL_AREA = 50.2655;
    private static final double INITIAL_PERIMETER = 25.1327;

    @Test
    public void when_circle_created_then_it_has_proper_name() {
        CircleFactory circle = new CircleFactory();
        Assert.assertEquals(circle.getName(), SHAPE_NAME);
    }

    @Test
    public void when_circle_is_created_then_proper_dimensions_are_returned() {
        Circle circle = new Circle(INITIAL_DIMENSION);
        Assert.assertEquals(circle.listDimensions().get(0), INITIAL_DIMENSION, DELTA);
    }

    @Test
    public void when_circle_is_created_then_area_are_returned() {
        Circle circle = new Circle(INITIAL_DIMENSION);
        Assert.assertEquals(circle.calculateArea(), INITIAL_AREA, DELTA);
    }

    @Test
    public void when_circle_is_created_then_perimeter_are_returned() {
        Circle circle = new Circle(INITIAL_DIMENSION);
        Assert.assertEquals(circle.calculatePerimeter(), INITIAL_PERIMETER, DELTA);
    }
}
