/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.visitor;

/**
 * @author Stefan Letzner
 *
 */
public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
