/**
 * 
 */
package fr.letzner.patterns.gof.creational.builder;

/**
 * @author Stefan Letzner
 *
 */
public interface FoodItem {
	public String name(); 
	public Packing packing(); 
	public float price();
}
