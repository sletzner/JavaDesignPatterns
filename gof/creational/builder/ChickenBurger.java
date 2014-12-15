/**
 * 
 */
package fr.letzner.patterns.gof.creational.builder;

/**
 * @author Stefan Letzner
 *
 */
public class ChickenBurger extends Burger {

	@Override 
	public float price() { 
		return 50.5f; 
	} 
	
	@Override 
	public String name() { 
		return "Chicken Burger"; 
	}

}
