/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.visitor;

/**
 * @author Stefan Letzner
 *
 */
public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
