/**
 * 
 */
package fr.letzner.patterns.gof.structural.bridge;

/**
 * @author Stefan Letzner
 *
 */
public class TestBridge {

	public static void test() {
		Shape redCircle = new Circle(100,100, 10, new RedCircle()); 
		Shape greenCircle = new Circle(100,100, 10, new GreenCircle()); 
		
		redCircle.draw(); 
		greenCircle.draw();
	}
}
