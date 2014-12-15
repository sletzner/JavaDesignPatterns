/**
 * 
 */
package fr.letzner.patterns.businessDelegate;

/**
 * @author Stefan Letzner
 * 
 */
public class Client {
	BusinessDelegate businessService;

	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}

	public void doTask() {
		businessService.doTask();
	}
}
