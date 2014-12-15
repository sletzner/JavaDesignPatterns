/**
 * 
 */
package fr.letzner.patterns.gof.structural.proxy;

/**
 * @author Stefan Letzner
 *
 */
public class TestProxy {
	public static void test() {
		Image image = new ProxyImage("test_10mb.jpg"); 
		
		//image will be loaded from disk 
		image.display(); 
		System.out.println(""); 
		
		//image will not be loaded from disk 
		image.display();
	}
}
