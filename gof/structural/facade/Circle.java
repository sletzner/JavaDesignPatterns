/**
 * 
 */
package fr.letzner.patterns.gof.structural.facade;

/**
 * @author Stefan Letzner
 *
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}

}
