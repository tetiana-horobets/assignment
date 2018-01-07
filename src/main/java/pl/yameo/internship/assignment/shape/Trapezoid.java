package pl.yameo.internship.assignment.shape;

import java.util.Arrays;
import java.util.List;

public class Trapezoid implements Shape {

    private Double baseA;
    private Double baseB;
    private Double legA;
    private Double legB;

    public Trapezoid(Double baseA, Double baseB, Double legA, Double legB) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.legA = legA;
        this.legB = legB;

        if (legA + legB < baseA - baseB) {
            throw new IllegalArgumentException("A Trapezoid With These Dimensions Cannot Exist");
        }
    }

    @Override
    public List<Double> listDimensions() {
        return Arrays.asList(baseA, baseB, legA, legB);
    }

    @Override
    public Double calculateArea() {
        double partOne = (Math.pow((baseA - baseB), 2)) + (Math.pow(legA, 2)) - (Math.pow(legB, 2));
        return (baseB + baseA) / 2 * Math.sqrt(Math.pow(legA, 2) - Math.pow((partOne / (2 * (baseB - baseA))), 2));
    }

    @Override
    public Double calculatePerimeter() {
        return baseA + baseB + legA + legB;
    }
}

