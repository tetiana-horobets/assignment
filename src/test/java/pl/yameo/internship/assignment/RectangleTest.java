package pl.yameo.internship.assignment;

import org.junit.Assert;
import org.junit.Test;
import pl.yameo.internship.assignment.factory.RectangleFactory;
import pl.yameo.internship.assignment.geometryShape.Rectangle;

public class RectangleTest {

    private static final double initialHeight = 6.0;
    private static final double initialWidth = 4.0;
    private static final double DELTA = 0.001;
    private static final String SHAPE_NAME = "Rectangle";
    private static final double INITIAL_AREA = 24.0;
    private static final double INITIAL_PERIMETER = 20.0;

    @Test
    public void when_rectangle_created_then_it_has_proper_name() {
        RectangleFactory rectangle = new RectangleFactory();
        Assert.assertEquals(rectangle.getName(), SHAPE_NAME);
    }

    @Test
    public void when_rectangle_is_created_then_proper_dimensions_are_returned() {
        Rectangle rectangle = new Rectangle(initialHeight, initialWidth);
        Assert.assertEquals(rectangle.listDimensions().get(0), initialHeight, DELTA);
        Assert.assertEquals(rectangle.listDimensions().get(1), initialWidth, DELTA);
    }

    @Test
    public void when_rectangle_is_created_then_area_are_returned() {
        Rectangle rectangle = new Rectangle(initialHeight, initialWidth);
        Assert.assertEquals(rectangle.calculateArea(), INITIAL_AREA, DELTA);
    }

    @Test
    public void when_rectangle_is_created_then_perimeter_are_returned() {
        Rectangle rectangle = new Rectangle(initialHeight, initialWidth);
        Assert.assertEquals(rectangle.calculatePerimeter(), INITIAL_PERIMETER, DELTA);
    }
}
