/**
 * 
 */
package fr.letzner.patterns.gof.creational.factory;

/**
 * @author Stefan Letzner
 * 
 */
public class TestFactory {
	private static final String COLOR = "COLOR";
	private static final String SHAPE = "SHAPE";
	
	private static final String TRIANGLE = "Triangle";
	private static final String RECTANGLE = "Rectangle";
	private static final String CIRCLE = "Circle";

	public static void test() {
		// get shape factory 
		AbstractFactory shapeFactory = FactoryProducer.getFactory(SHAPE); 
		
		//get an object of Shape Circle
		Shape shape1 = shapeFactory.getShape(CIRCLE); 
		
		//call draw method of Shape Circle
		shape1.draw(); 
		
		//get an object of Shape Rectangle 
		Shape shape2 = shapeFactory.getShape(RECTANGLE); 
		
		//call draw method of Shape Rectangle
		shape2.draw(); 
		
		//get an object of Shape Square 
		Shape shape3 = shapeFactory.getShape(TRIANGLE); 
		
		//call draw method of Shape Square
		shape3.draw(); 
		
		//get color factory 
		AbstractFactory colorFactory = FactoryProducer.getFactory(COLOR);
		
		Color color = colorFactory.getColor("Red");
		color.fill();
	}
}
