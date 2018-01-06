package pl.yameo.internship.assignment;

import org.reflections.Reflections;
import pl.yameo.internship.assignment.Factory.*;

import java.util.*;

public class Main {
	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<FactoryShape> classesList = Arrays.asList(new FactoryCircle(), new FactoryEllipse(), new
				FactoryRectangle(), new FactorySqare(), new FactoryTrapezoid(), new FactoryTriangle());

		GeometryApp app = new GeometryApp(scanner, classesList);
		app.start();
		scanner.close();

	}

}
