/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.strategy;

/**
 * @author Stefan Letzner
 * 
 */
public class TestStrategy {

	public static void test() {

		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

	}

}
