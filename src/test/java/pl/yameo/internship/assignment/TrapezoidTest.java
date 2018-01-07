package pl.yameo.internship.assignment;

import org.junit.Assert;
import org.junit.Test;
import pl.yameo.internship.assignment.factory.TrapezoidFactory;
import pl.yameo.internship.assignment.geometryShape.Trapezoid;

public class TrapezoidTest {
    private static final double initialBaseA = 6.0;
    private static final double initialBaseB = 4.0;
    private static final double initialLegA = 5.0;
    private static final double initialLegB = 4.0;
    private static final double DELTA = 0.001;
    private static final String SHAPE_NAME = "Trapezoid";
    private static final double INITIAL_AREA = 18.998;
    private static final double INITIAL_PERIMETER = 19.0;

    @Test
    public void when_trapezoid_created_then_it_has_proper_name() {
      TrapezoidFactory trapezoid = new TrapezoidFactory();
        Assert.assertEquals(trapezoid.getName(), SHAPE_NAME);
    }

    @Test
    public void when_trapezoid_is_created_then_proper_dimensions_are_returned() {
        Trapezoid trapezoid = new Trapezoid(initialBaseA, initialBaseB, initialLegA, initialLegB);
        Assert.assertEquals(trapezoid.listDimensions().get(0), initialBaseA, DELTA);
        Assert.assertEquals(trapezoid.listDimensions().get(1), initialBaseB, DELTA);
        Assert.assertEquals(trapezoid.listDimensions().get(2), initialLegA, DELTA);
        Assert.assertEquals(trapezoid.listDimensions().get(3), initialLegB, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void when_impossible_trapezoid_is_created_then_exception_is_thrown() {
        new Trapezoid(initialBaseA, 1.0, 1.0, 2.0);
    }

    @Test
    public void when_trapezoid_is_created_then_area_are_returned() {
        Trapezoid trapezoid = new Trapezoid(initialBaseA,initialBaseB,initialLegA, initialLegB);
        Assert.assertEquals(trapezoid.calculateArea(), INITIAL_AREA, DELTA);
    }

    @Test
    public void when_trapezoid_is_created_then_perimeter_are_returned() {
        Trapezoid trapezoid = new Trapezoid(initialBaseA, initialBaseB, initialLegA, initialLegB);
        Assert.assertEquals(trapezoid.calculatePerimeter(), INITIAL_PERIMETER, DELTA);
    }
}