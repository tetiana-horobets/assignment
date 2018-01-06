package pl.yameo.internship.assignment;

import java.util.Arrays;
import java.util.List;

public class Trapezoid implements Shape {

    private Double baseA;
    private Double baseB;
    private Double legA;
    private Double legB;
    private Double altitude;

    public Trapezoid(Double baseA, Double baseB, Double legA, Double legB, Double altitude) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.legA = legA;
        this.legB = legB;
        this.altitude = altitude;
    }

    @Override
    public List<Double> listDimensions() {
        return Arrays.asList(baseA, baseB, legA, legB, altitude);
    }

    @Override
    public Double calculateArea() {
        return 0.5 *(baseA + baseB) * altitude ;
    }

    @Override
    public Double calculatePerimeter() {
        return baseA + baseB + legA + legB;
    }

    public void setBaseB(Double baseB) {
        this.baseB = baseB;
    }

    public void setBaseA(Double baseA) {
        this.baseA = baseA;
    }

    public void setLegA(Double legA) {
        this.legA = legA;
    }

    public void setLegB(Double legB) {
        this.legB = legB;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }
}

