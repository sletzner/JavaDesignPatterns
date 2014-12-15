/**
 * 
 */
package fr.letzner.patterns.interceptingFilter;

/**
 * @author Stefan Letzner
 *
 */
public class TestInterceptiongFilter {

	public static void test() {
		FilterManager filterManager = new FilterManager(new Target()); 
		filterManager.setFilter(new AuthenticationFilter()); 
		filterManager.setFilter(new DebugFilter()); 
		
		Client client = new Client(); 
		client.setFilterManager(filterManager); 
		client.sendRequest("HOME");
	}
	
}
