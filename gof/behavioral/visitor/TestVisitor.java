/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.visitor;

/**
 * @author Stefan Letzner
 * 
 */
public class TestVisitor {

	public static void test() {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());

	}

}
