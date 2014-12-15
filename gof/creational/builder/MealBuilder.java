/**
 * 
 */
package fr.letzner.patterns.gof.creational.builder;

/**
 * @author Stefan Letzner
 *
 */
public class MealBuilder {
	public Meal prepareVegMeal (){ 
		Meal meal = new Meal(); 
		meal.addItem(new VegBurger()); 
		meal.addItem(new Coke()); 
		return meal; 
	} 
	
	public Meal prepareNonVegMeal (){ 
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger()); 
		meal.addItem(new Pepsi()); 
		return meal; 
	}
}
