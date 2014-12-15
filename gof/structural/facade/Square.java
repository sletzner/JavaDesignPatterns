/**
 * 
 */
package fr.letzner.patterns.gof.structural.facade;

/**
 * @author Stefan Letzner
 *
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}

}
