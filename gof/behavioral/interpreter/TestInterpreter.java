/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.interpreter;

/**
 * @author Stefan Letzner
 *
 */
public class TestInterpreter {

	//Rule: Robert and John are male 
	public static Expression getMaleExpression(){ 
		Expression robert = new TerminalExpression("Robert"); 
		Expression john = new TerminalExpression("John"); 
		
		return new OrExpression(robert, john); 
	} 
	
	//Rule: Julie is a married women 
	public static Expression getMarriedWomanExpression(){ 
		Expression julie = new TerminalExpression("Julie"); 
		Expression married = new TerminalExpression("Married"); 
		
		return new AndExpression(julie, married); 
	}
	
	public static void test() {
		
		Expression isMale = getMaleExpression(); 
		Expression isMarriedWoman = getMarriedWomanExpression(); 
		
		System.out.println("John is male? " + isMale.interpret("John")); 
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
		
	}
	
}
