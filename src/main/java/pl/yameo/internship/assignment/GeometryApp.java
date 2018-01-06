package pl.yameo.internship.assignment;

import pl.yameo.internship.assignment.Factory.*;

import java.util.*;

public class GeometryApp {
	private Scanner scanner;
	private List<Shape> shapes = new ArrayList<>();
    List<FactoryShape> factoryList;
	List<FactoryShape> addShape = new ArrayList<>();


	public GeometryApp(Scanner scanner, List<FactoryShape> factoryList) {
		this.scanner = scanner;
		this.factoryList = factoryList;
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

        for(int i = 0; i < factoryList.size(); i++){
            System.out.println(i+1 + ") " + factoryList.get(i).getName());
        }
		System.out.println("0) Back");
		int option = readInteger();

		FactoryShape factoryShape;
        factoryShape = factoryList.get(option - 1);
        addShape.add(factoryShape);
        return factoryShape.createNewShape(scanner);
    }

	private void listShapes() {
		System.out.println("====== LIST OF SHAPES ======");
		for (int i = 0; i < shapes.size();i++){
            System.out.print(addShape.get(i).getName() + " with dimensions: ");
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
		FactoryShape factory = addShape.get(index - 1);

		System.out.print(factory.getName() + " with dimensions: ");
		System.out.print(oldShape.listDimensions() + "; ");
		System.out.print("Area: " + oldShape.calculateArea() + "; ");
		System.out.println("Perimeter: " + oldShape.calculatePerimeter());

		Shape newShape = factory.createNewShape(scanner);

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
