/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.mediator;

/**
 * @author Stefan Letzner
 *
 */
public class TestMediator {

	public static void test() {
		User robert = new User("Robert");
		User john = new User("John");
		
		robert.sendMessage("Hi! John!"); 
		john.sendMessage("Hello! Robert!");
	}
	
}
