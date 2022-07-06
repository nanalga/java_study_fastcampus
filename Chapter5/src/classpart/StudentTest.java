package classpart;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student("이순");
//		studentLee.studentName = "이순신";
		studentLee.address = "seoul";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student("john");
//		studentKim.studentName = "John";
		studentKim.address = "NY";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
	
	}

}
