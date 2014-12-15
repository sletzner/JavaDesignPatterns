/**
 * 
 */
package fr.letzner.patterns.gof.creational.builder;

/**
 * @author Stefan Letzner
 *
 */
public class Pepsi extends ColdDrink {

	@Override
	public float price() {
		return 35.0f;
	}

	@Override 
	public String name() { 
		return "Pepsi"; 
	}
}
