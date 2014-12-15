/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.state;

/**
 * @author Stefan Letzner
 * 
 */
public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}

}
