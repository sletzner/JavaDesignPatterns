/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.interpreter;

/**
 * @author Stefan Letzner
 *
 */
public interface Expression {
	
	public boolean interpret(String context);
	
}
