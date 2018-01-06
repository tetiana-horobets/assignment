package pl.yameo.internship.assignment;


import org.junit.Assert;
import org.junit.Test;
import pl.yameo.internship.assignment.Factory.FactoryEllipse;

public class EllipseTest {

    private static final double DELTA = 0.001;
    private static final Double semiMajorAxis = 5.0;
    private static final Double semiMinorAxis = 4.0;
    private static final String SHAPE_NAME = "Ellipse";
    private static final double INITIAL_AREA = 28.361871361380754;
    private static final double INITIAL_PERIMETER = 62.83185307179586;

    @Test
    public void when_trapezoid_created_then_it_has_proper_name() {
        FactoryEllipse ellipse = new FactoryEllipse();
        Assert.assertEquals(ellipse.getName(), SHAPE_NAME);
    }

    @Test
    public void when_ellipse_is_created_then_proper_dimensions_are_returned() {
        Ellipse ellipse = new Ellipse(semiMajorAxis, semiMinorAxis);
        Assert.assertEquals(ellipse.listDimensions().get(0), semiMajorAxis, 0.0001);
        Assert.assertEquals(ellipse.listDimensions().get(1), semiMinorAxis, 0.0001);
    }

    @Test
    public void when_ellipse_is_created_then_area_are_returned() {
        Ellipse ellipse = new Ellipse(semiMajorAxis, semiMinorAxis);
        Assert.assertEquals(ellipse.calculateArea(), INITIAL_AREA, DELTA);
    }

    @Test
    public void when_ellipse_is_created_then_perimeter_are_returned() {
        Ellipse ellipse = new Ellipse(semiMajorAxis, semiMinorAxis);
        Assert.assertEquals(ellipse.calculatePerimeter(), INITIAL_PERIMETER, DELTA);
    }
}
