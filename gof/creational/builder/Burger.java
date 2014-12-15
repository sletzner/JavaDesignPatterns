/**
 * 
 */
package fr.letzner.patterns.gof.creational.builder;

/**
 * @author Stefan Letzner
 *
 */
public abstract class Burger implements FoodItem {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override 
	public abstract float price();

}
