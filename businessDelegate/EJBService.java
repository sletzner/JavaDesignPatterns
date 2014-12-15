/**
 * 
 */
package fr.letzner.patterns.businessDelegate;

/**
 * @author Stefan Letzner
 *
 */
public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}

}
