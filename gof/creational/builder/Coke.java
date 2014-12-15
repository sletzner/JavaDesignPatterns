/**
 * 
 */
package fr.letzner.patterns.gof.creational.builder;

/**
 * @author Stefan Letzner
 *
 */
public class Coke extends ColdDrink {

	@Override
	public float price() {
		return 30.0f;
	}

	@Override 
	public String name() { 
		return "Coke"; 
	}
}
