/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.state;

/**
 * @author Stefan Letzner
 * 
 */
public class Context {

	private State state;

	public Context() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

}
