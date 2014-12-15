/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.template;

/**
 * @author Stefan Letzner
 * 
 */
public class TestTemplate {

	public static void test() {

		Game game = new Cricket();
		game.play();
		System.out.println();
		
		game = new Football();
		game.play();

	}

}
