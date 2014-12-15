/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.observer;

/**
 * @author Stefan Letzner
 * 
 */
public abstract class Observer {

	protected Subject subject;

	public abstract void update();

}
