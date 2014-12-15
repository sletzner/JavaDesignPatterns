/**
 * 
 */
package fr.letzner.patterns.gof.creational.prototype;

/**
 * @author Stefan Letzner
 *
 */
public class Circle extends Shape {

	public Circle(){ 
		type = "Circle"; 
	} 
	
	@Override public void draw() { 
		System.out.println("Inside Circle::draw() method."); 
	}
}
