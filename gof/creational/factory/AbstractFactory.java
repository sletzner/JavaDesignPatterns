/**
 * 
 */
package fr.letzner.patterns.gof.creational.factory;

/**
 * @author Stefan Letzner
 *
 */
public abstract class AbstractFactory {
	
	public abstract Shape getShape(String shape);
	
	public abstract Color getColor(String color);
	
}
