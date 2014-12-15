/**
 * 
 */
package fr.letzner.patterns.gof.behavioral.iterator;

/**
 * @author Stefan Letzner
 *
 */
public class TestIterator {

	public static void test() {
		
		NameRepository namesRepository = new NameRepository(); 
		
		for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
			String name = (String)iter.next(); 
			System.out.println("Name : " + name); 
		}
	}
}
