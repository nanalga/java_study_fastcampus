package array;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 80);
		studentLee.addSubject("수학", 90);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 90);
		studentKim.addSubject("영어", 90);

		studentKim.showStudentInfo();
		System.out.println("=============================================");
		studentLee.showStudentInfo();
	}

}
