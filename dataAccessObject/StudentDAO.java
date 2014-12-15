/**
 * 
 */
package fr.letzner.patterns.dataAccessObject;

import java.util.List;

/**
 * @author Stefan Letzner
 * 
 */
public interface StudentDAO {

	public List<Student> getAllStudents();

	public Student getStudent(int rollNo);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);

}
