/**
 * 
 */
package fr.letzner.patterns.gof.creational.factory;

/**
 * @author Stefan Letzner
 *
 */
public class ColorFactory extends AbstractFactory {
	@Override
	public Color getColor(String color) {
		switch (color) {
		case "Green":
			return new Green();
		case "Red":
			return new Red();
		case "Blue":
			return new Blue();
		default:
			return null;
		}
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}
}
