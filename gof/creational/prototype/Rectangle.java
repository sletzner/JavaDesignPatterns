/**
 * 
 */
package fr.letzner.patterns.gof.creational.prototype;

/**
 * @author Stefan Letzner
 *
 */
public class Rectangle extends Shape {

	public Rectangle(){ 
		type = "Rectangle"; 
	} 
	
	@Override public void draw() { 
		System.out.println("Inside Rectangle::draw() method.");
	}
}
