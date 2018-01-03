package pl.yameo.internship.assignment;


import org.junit.Assert;
import org.junit.Test;

public class TrapezoidTest {
    private static final double initialBaseA = 6.0;
    private static final double initialBaseB = 4.0;
    private static final double initialLegA = 4.0;
    private static final double initialLegB = 5.0;
    private static final double initialAltitude = 4.0;
    private static final double DELTA = 0.001;
    private static final String SHAPE_NAME = "Trapezoid";
    private static final double INITIAL_AREA = 20.0;
    private static final double INITIAL_PERIMETER = 19.0;


    @Test
    public void when_trapezoid_created_then_it_has_proper_name() {
        Trapezoid trapezoid = new Trapezoid(initialBaseA, initialBaseB, initialLegA, initialLegB, initialAltitude);
        Assert.assertEquals(trapezoid.getName(), SHAPE_NAME);
    }

    @Test
    public void when_trapezoid_is_created_then_proper_dimensions_are_returned() {
        Trapezoid trapezoid = new Trapezoid(initialBaseA, initialBaseB, initialLegA, initialLegB, initialAltitude);
        Assert.assertEquals(trapezoid.listDimensions().get(0), initialBaseA, 0.0001);
        Assert.assertEquals(trapezoid.listDimensions().get(1), initialBaseB, 0.0001);
        Assert.assertEquals(trapezoid.listDimensions().get(2), initialLegA, 0.0001);
        Assert.assertEquals(trapezoid.listDimensions().get(3), initialLegB, 0.0001);
        Assert.assertEquals(trapezoid.listDimensions().get(4), initialAltitude, 0.0001);
    }

    @Test
    public void when_trapezoid_is_created_then_area_are_returned() {
        Trapezoid trapezoid = new Trapezoid(initialBaseA, initialBaseB, initialLegA, initialLegB, initialAltitude);
        Assert.assertEquals(trapezoid.calculateArea(), INITIAL_AREA, DELTA);
    }

    @Test
    public void when_trapezoid_is_created_then_perimeter_are_returned() {
        Trapezoid trapezoid = new Trapezoid(initialBaseA, initialBaseB, initialLegA, initialLegB, initialAltitude);
        Assert.assertEquals(trapezoid.calculatePerimeter(), INITIAL_PERIMETER, DELTA);
    }
}
