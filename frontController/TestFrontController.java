/**
 * 
 */
package fr.letzner.patterns.frontController;

/**
 * @author Stefan Letzner
 * 
 */
public class TestFrontController {

	public static void test() {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}

}
