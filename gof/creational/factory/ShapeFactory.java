/**
 * 
 */
package fr.letzner.patterns.gof.creational.factory;

/**
 * @author Stefan Letzner
 *
 */
public class ShapeFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String type) {
		switch (type) {
			case "Circle":
				return new Circle();
			case "Rectangle":
				return new Rectangle();
			case "Triangle":
				return new Triangle();
			default:
				return null;
		}
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}
