/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.visitor;

/**
 * @author Stefan Letzner
 *
 */
public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);
	
}
