package lab7;

public class CourseTest {
	public static void main (String args[]) {
		Course test = new Course ("SD1");
		
		
		test.addStudent("chris");
		test.addStudent("andrew");
		test.addStudent("Juan");
		test.dropStudent("andrew");
		test.printStudents();
	}
}
