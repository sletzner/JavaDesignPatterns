/**
 * 
 */
package fr.letzner.patterns.businessDelegate;

/**
 * @author Stefan Letzner
 * 
 */
public class TestBusinessDelegate {

	public static void test() {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType("JMS");
		client.doTask();
	}

}
