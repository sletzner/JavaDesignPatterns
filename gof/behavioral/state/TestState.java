/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.state;

/**
 * @author Stefan Letzner
 * 
 */
public class TestState {

	public static void test() {
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}

}
