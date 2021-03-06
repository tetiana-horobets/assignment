package pl.yameo.internship.assignment;

import org.junit.Assert;
import org.junit.Test;
import pl.yameo.internship.assignment.factory.TriangleFactory;
import pl.yameo.internship.assignment.shape.Triangle;

public class TriangleTest {
    private static final double DELTA = 0.001;
    private static final Double initialEdgeA = 3.0;
    private static final Double initialEdgeB = 4.0;
    private static final Double initialEdgeC = 5.0;
    private static final String SHAPE_NAME = "Triangle";
    private static final double INITIAL_AREA = 6.0;
    private static final double INITIAL_PERIMETER = 12.0;

    @Test
    public void when_triangle_created_then_it_has_proper_name() {
        TriangleFactory triangle = new TriangleFactory();
        Assert.assertEquals(triangle.getName(), SHAPE_NAME);
    }

    @Test
    public void when_triangle_is_created_then_proper_dimensions_are_returned() {
        Triangle triangle = new Triangle(initialEdgeA, initialEdgeB, initialEdgeC);
        Assert.assertEquals(initialEdgeA, triangle.listDimensions().get(0), DELTA);
        Assert.assertEquals(initialEdgeB, triangle.listDimensions().get(1), DELTA);
        Assert.assertEquals(initialEdgeC, triangle.listDimensions().get(2), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_impossible_triangle_is_created_then_exception_is_thrown() {
        new Triangle(initialEdgeA, 1.0, initialEdgeC);
    }

    @Test
    public void when_triangle_is_created_then_area_are_returned() {
        Triangle triangle = new Triangle(initialEdgeA, initialEdgeB, initialEdgeC);
        Assert.assertEquals(triangle.calculateArea(), INITIAL_AREA, DELTA);
    }

    @Test
    public void when_triangle_is_created_then_perimeter_are_returned() {
        Triangle triangle = new Triangle(initialEdgeA, initialEdgeB, initialEdgeC);
        Assert.assertEquals(triangle.calculatePerimeter(), INITIAL_PERIMETER, DELTA);
    }
}
