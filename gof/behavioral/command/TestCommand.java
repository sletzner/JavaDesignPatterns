/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.command;

/**
 * @author Stefan Letzner
 *
 */
public class TestCommand {

	public static void test() {
		Stock abcStock = new Stock(); 
		
		BuyStock buyStockOrder = new BuyStock(abcStock); 
		SellStock sellStockOrder = new SellStock(abcStock); 
		
		Broker broker = new Broker(); 
		broker.takeOrder(buyStockOrder); 
		broker.takeOrder(sellStockOrder); 
		broker.placeOrders();
	}
}
