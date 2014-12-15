/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.state;

/**
 * @author Stefan Letzner
 * 
 */
public class StartState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}

}
