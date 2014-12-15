/**
 * 
 */
package fr.letzner.patterns.gof.structural.decorator;

/**
 * @author Stefan Letzner
 *
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}
