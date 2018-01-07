package pl.yameo.internship.assignment;

import pl.yameo.internship.assignment.factory.*;

import java.util.*;

public class GeometryApp {
	private Scanner scanner;
	private List<Shape> shapes = new ArrayList<>();
    private List<ShapeFactory> allFactories;
	private List<ShapeFactory> usedFactories = new ArrayList<>();

	GeometryApp(Scanner scanner, List<ShapeFactory> allFactories) {
		this.scanner = scanner;
		this.allFactories = allFactories;
	}

	public void start() {
		boolean run = true;
		while (run) {
			run = run();
		}
	}

	private boolean run() {
		System.out.println("Choose action:");
		System.out.println("1) Create new shape");
		System.out.println("2) List existing shapes");
		System.out.println("3) Modify one of the shapes from the list");
		System.out.println("0) Exit");

		int option = readInteger();
		if (option == 0) {
			return false;
		} else if (option == 1) {
			Shape newShape = createNewShape();
			if (newShape != null) {
				shapes.add(newShape);
			}
		} else if (option == 2) {
			listShapes();
		} else if (option == 3) {
			modifyShape();
		}
		return true;
	}

	private Shape createNewShape() {
		System.out.println("Choose shape to create:");

        for(int i = 0; i < allFactories.size(); i++){
            System.out.println(i+1 + ") " + allFactories.get(i).getName());
        }
		System.out.println("0) Back");
		int option = readInteger();

		ShapeFactory shapeFactory;
        shapeFactory = allFactories.get(option - 1);
        usedFactories.add(shapeFactory);
        try {
			return shapeFactory.createNewShape(scanner);
		} catch (Exception exception) {
			System.out.println("Invalid value: " + exception.getMessage());
			return null;
		}
    }

	private void listShapes() {
		System.out.println("====== LIST OF SHAPES ======");
		for (int i = 0; i < shapes.size();i++){
            System.out.print(usedFactories.get(i).getName() + " with dimensions: ");
            System.out.print(shapes.get(i).listDimensions() + "; ");
            System.out.print("Area: " + shapes.get(i).calculateArea() + "; ");
            System.out.println("Perimeter: " + shapes.get(i).calculatePerimeter());
        }
	}

	private void modifyShape() {
		listShapes();
		System.out.println("Please choose the index of the shape you want to modify (1-" + shapes.size() + "): ");
		int index = readInteger();
		Shape oldShape = shapes.get(index - 1);
		ShapeFactory factory = usedFactories.get(index - 1);

		System.out.print(factory.getName() + " with dimensions: ");
		System.out.print(oldShape.listDimensions() + "; ");
		System.out.print("Area: " + oldShape.calculateArea() + "; ");
		System.out.println("Perimeter: " + oldShape.calculatePerimeter());

		Shape newShape = factory.createNewShape(scanner);
		shapes.remove(index -1 );
		shapes.add(index - 1, newShape);

		System.out.println("Old shape: ");
		System.out.print(factory.getName() + " with dimensions: ");
		System.out.print(oldShape.listDimensions() + "; ");
		System.out.print("Area: " + oldShape.calculateArea() + "; ");
		System.out.println("Perimeter: " + oldShape.calculatePerimeter());
		System.out.println("============================");
		System.out.println("New shape: ");
		System.out.print(factory.getName() + " with dimensions: ");
		System.out.print(newShape.listDimensions() + "; ");
		System.out.print("Area: " + newShape.calculateArea() + "; ");
		System.out.println("Perimeter: " + newShape.calculatePerimeter());
		System.out.println("============================");

	}

	private Integer readInteger() {
		Integer value = null;
		while (value == null) {
			if (scanner.hasNextInt()) {
				value = scanner.nextInt();
			} else {
				scanner.next();
			}
		}
		return value;
	}
}
