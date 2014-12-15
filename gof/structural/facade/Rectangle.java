/**
 * 
 */
package fr.letzner.patterns.gof.structural.facade;

/**
 * @author Stefan Letzner
 *
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}

}
