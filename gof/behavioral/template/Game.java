/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.template;

/**
 * @author Stefan Letzner
 * 
 */
public abstract class Game {

	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay(); 
	
	// template method 
	public final void play(){
		// initialize the game 
		initialize(); 
		
		//start game 
		startPlay(); 
		
		//end game 
		endPlay(); 
	}

}
