/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.observer;

/**
 * @author Stefan Letzner
 * 
 */
public class TestObserver {

	public static void test() {

		Subject subject = new Subject();
		
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);

	}

}
