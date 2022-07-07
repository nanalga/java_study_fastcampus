package staticex;

public class Student {
	
	private static int serialNum = 1000; 
	int studentID;
	String studentName;
	String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public static int getSerialNum() {
		int i = 0;
		
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	

}
