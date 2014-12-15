/**
 * 
 */
package fr.letzner.patterns.businessDelegate;

/**
 * @author Stefan Letzner
 *
 */
public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}

}
