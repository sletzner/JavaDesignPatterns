/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.memento;

/**
 * @author Stefan Letzner
 *
 */
public class Memento {

	private String state; 
	
	public Memento(String state){ 
		this.state = state; 
	} 
	
	public String getState(){ 
		return state; 
	}
	
}
