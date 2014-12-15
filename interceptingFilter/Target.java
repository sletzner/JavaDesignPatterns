/**
 * 
 */
package fr.letzner.patterns.interceptingFilter;

/**
 * @author Stefan Letzner
 * 
 */
public class Target {

	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}

}
