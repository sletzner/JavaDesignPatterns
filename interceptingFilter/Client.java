/**
 * 
 */
package fr.letzner.patterns.interceptingFilter;

/**
 * @author Stefan Letzner
 * 
 */
public class Client {

	FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}

}
