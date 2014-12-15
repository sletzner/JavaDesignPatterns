/**
 * 
 */
package fr.letzner.patterns.gof.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stefan Letzner
 *
 */
public class Meal {
	private List<FoodItem> items = new ArrayList<FoodItem>(); 
	
	public void addItem(FoodItem item){ 
		items.add(item); 
	} 
	
	public float getCost(){ 
		float cost = 0.0f; 
		
		for (FoodItem item : items) { 
			cost += item.price(); 
		} 
		
		return cost; 
	} 
	
	public void showItems(){ 
		for (FoodItem item : items) { 
			System.out.print("Item : "+item.name()); 
			System.out.print(", Packing : "+item.packing().pack()); 
			System.out.println(", Price : "+item.price()); 
		} 
	}
}
