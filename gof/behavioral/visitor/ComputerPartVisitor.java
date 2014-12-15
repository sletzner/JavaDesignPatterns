/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.visitor;

/**
 * @author Stefan Letzner
 * 
 */
public interface ComputerPartVisitor {

	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);

}
