package staticex;

public class StudentIdTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum());
		
		Student studentKim = new Student("Kim");
		
		System.out.println(studentLee.getSerialNum());
		System.out.println(studentKim.getSerialNum());
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());

	}

}
