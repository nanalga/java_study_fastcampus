package practice;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(1001, "Lee");
		Student studentkim = new Student(1002, "Kim");
		Student studentCho = new Student(1003, "Cho");
		
		studentLee.readBook("태백산맥1");
		studentLee.readBook("태백산맥2");
		studentLee.readBook("태백산맥3");
		
		studentkim.readBook("토지1");
		studentkim.readBook("토지2");
		studentkim.readBook("토지3");
		
		studentCho.readBook("해리포터1");
		studentCho.readBook("해리포터2");
		studentCho.readBook("해리포터3");
		studentCho.readBook("해리포터4");
		studentCho.readBook("해리포터5");
		studentCho.readBook("해리포터6");
		
		studentLee.showInfo();
		studentkim.showInfo();
		studentCho.showInfo();

	}

}
