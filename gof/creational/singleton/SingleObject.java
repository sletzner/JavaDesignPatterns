/**
 * 
 */
package fr.letzner.patterns.gof.creational.singleton;

/**
 * @author Stefan Letzner
 *
 */
public class SingleObject {
	
	// Private constructor
	private SingleObject(){}
	
	// Current instance
	private static SingleObject instance = null;
	
	public static SingleObject getInstance() {
		// Check if is instanciated
		if (instance == null) instance = new SingleObject(); 
		
		// Return instance
		return instance;
	}
	
	public void showMessage(){ 
		System.out.println("Hello Singleton !"); 
	}
}
