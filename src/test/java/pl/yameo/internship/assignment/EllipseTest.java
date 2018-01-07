package pl.yameo.internship.assignment;

import org.junit.Assert;
import org.junit.Test;
import pl.yameo.internship.assignment.factory.EllipseFactory;
import pl.yameo.internship.assignment.geometryShape.Ellipse;

public class EllipseTest {

    private static final double DELTA = 0.001;
    private static final Double semiMajorAxis = 5.0;
    private static final Double semiMinorAxis = 4.0;
    private static final String SHAPE_NAME = "Ellipse";
    private static final double INITIAL_AREA = 62.8319;
    private static final double INITIAL_PERIMETER = 28.3617;

    @Test
    public void when_ellipse_created_then_it_has_proper_name() {
        EllipseFactory ellipse = new EllipseFactory();
        Assert.assertEquals(ellipse.getName(), SHAPE_NAME);
    }

    @Test
    public void when_ellipse_is_created_then_proper_dimensions_are_returned() {
        Ellipse ellipse = new Ellipse(semiMajorAxis, semiMinorAxis);
        Assert.assertEquals(ellipse.listDimensions().get(0), semiMajorAxis, DELTA);
        Assert.assertEquals(ellipse.listDimensions().get(1), semiMinorAxis, DELTA);
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
