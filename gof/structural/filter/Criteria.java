/**
 * 
 */
package fr.letzner.patterns.gof.structural.filter;

import java.util.List;

/**
 * @author Stefan Letzner
 *
 */
public interface Criteria {
	
	public List<Person> meetCriteria(List<Person> persons);
}
