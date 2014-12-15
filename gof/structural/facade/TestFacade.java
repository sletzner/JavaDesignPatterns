/**
 * 
 */
package fr.letzner.patterns.gof.structural.facade;

/**
 * @author Stefan Letzner
 *
 */
public class TestFacade {

	public static void test() {
		ShapeMaker shapeMaker = new ShapeMaker(); 
		shapeMaker.drawCircle(); 
		shapeMaker.drawRectangle(); 
		shapeMaker.drawSquare();
	}
}
