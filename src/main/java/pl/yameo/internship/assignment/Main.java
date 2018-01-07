package pl.yameo.internship.assignment;

import pl.yameo.internship.assignment.Factory.*;

import java.util.*;

public class Main {
	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<ShapeFactory> classesList = Arrays.asList(new CircleFactory(), new EllipseFactory(), new
				RectangleFactory(), new SquareFactory(), new TrapezoidFactory(), new TriangleFactory());

		GeometryApp app = new GeometryApp(scanner, classesList);
		app.start();
		scanner.close();
	}
}
