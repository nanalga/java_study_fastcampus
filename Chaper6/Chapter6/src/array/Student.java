package array;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}

	public void addSubject(String subjectName, int score) {
		Subject subject = new Subject(subjectName, score);
		
		subjectList.add(subject);
	}

	public void showStudentInfo() {
		int total = 0;
		
		for (Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "학생의 " + subject.getSubjectName() + "과목의 성적은 " + subject.getScore() + "입니다.");
		}
		System.out.println(studentName + "학생의 총 점수는 " + total + "입니다.");
		
	}
	
	
	

}
