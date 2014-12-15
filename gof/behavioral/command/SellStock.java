/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.command;

/**
 * @author Stefan Letzner
 *
 */
public class SellStock implements Order {

	private Stock abcStock; 
	
	public SellStock(Stock abcStock){ 
		this.abcStock = abcStock; 
	} 
	
	public void execute() { 
		abcStock.sell(); 
	}

}
