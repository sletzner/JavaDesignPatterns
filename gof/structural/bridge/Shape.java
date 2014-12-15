/**
 * 
 */
package fr.letzner.patterns.gof.structural.bridge;

/**
 * @author Stefan Letzner
 *
 */
public abstract class Shape {
	
	protected DrawAPI drawAPI; 
	
	protected Shape(DrawAPI drawAPI){ 
		this.drawAPI = drawAPI; 
	} 
	
	public abstract void draw();
}
