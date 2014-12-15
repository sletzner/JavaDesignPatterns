/**
 * 
 */
package fr.letzner.patterns.serviceLocator;

/**
 * @author Stefan Letzner
 * 
 */
public class TestServiceLocator {

	public static void test() {

		Service service = ServiceLocator.getService("Service1");
		service.execute();
		
		service = ServiceLocator.getService("Service2");
		service.execute();
		
		service = ServiceLocator.getService("Service1");
		service.execute();
		
		service = ServiceLocator.getService("Service2");
		service.execute();

	}

}
