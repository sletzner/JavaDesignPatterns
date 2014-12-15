/**
 * 
 */
package fr.letzner.patterns.gof.creational.factory;

/**
 * @author Stefan Letzner
 * 
 */
public class FactoryProducer {
	
	private static final String SHAPE = "SHAPE";
	private static final String COLOR = "COLOR";
	
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase(SHAPE)) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase(COLOR)) {
			return new ColorFactory();
		}
		return null;
	}
}
