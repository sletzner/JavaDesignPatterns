/**
 * 
 */
package fr.letzner.patterns.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stefan Letzner
 *
 */
public class Employee {
	
	private String name; 
	private String dept; 
	private int salary; 
	private List<Employee> subordinates; 
	
	// constructor 
	public Employee(String name,String dept, int salary) { 
		this.name = name; 
		this.dept = dept; 
		this.salary = salary; 
		subordinates = new ArrayList<Employee>();
	} 
	
	public void add(Employee e) { 
		subordinates.add(e); 
	} 
	
	public void remove(Employee e) { 
		subordinates.remove(e); 
	} 
	
	public List<Employee> getSubordinates(){ 
		return subordinates; 
	} 
	
	public String toString(){ 
		return ("Employee :[ Name : "+ name +", dept : "+ dept + ", salary :" + salary+" ]"); 
	}
}
