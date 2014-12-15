/**
 * 
 */
package fr.letzner.patterns.gof.structural.decorator;

/**
 * @author Stefan Letzner
 *
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}
