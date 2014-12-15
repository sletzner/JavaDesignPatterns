/**
 * 
 */
package fr.letzner.patterns.interceptingFilter;

/**
 * @author Stefan Letzner
 *
 */
public class AuthenticationFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}

}
