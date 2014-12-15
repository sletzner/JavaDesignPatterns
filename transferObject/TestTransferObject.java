/**
 * 
 */
package fr.letzner.patterns.transferObject;

/**
 * @author Stefan Letzner
 * 
 */
public class TestTransferObject {

	public static void test() {

		StudentBO studentBusinessObject = new StudentBO();

		// print all students
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo()
					+ ", Name : " + student.getName() + " ]");
		} 
		
		// update student 
		StudentVO student = studentBusinessObject.getAllStudents().get(0);
		student.setName("Michael");
		studentBusinessObject.updateStudent(student); 
		
		//get the student
		studentBusinessObject.getStudent(0);
		System.out.println("Student: [RollNo : " 
				+ student.getRollNo()+", Name : " + student.getName()+" ]");

	}

}
