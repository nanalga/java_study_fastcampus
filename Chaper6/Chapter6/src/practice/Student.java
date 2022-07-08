package practice;

import java.util.ArrayList;

public class Student {
	
	public int studentNumber;
	public String studentName;
	ArrayList<Book> arrayBook;
	
	public Student(int studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		
		arrayBook = new ArrayList<Book>();
	}
	
	public void readBook(String bookName) {
		Book book = new Book(bookName);
		
		arrayBook.add(book);
	}
	
	public void showInfo() {
		System.out.print(studentName + "학생이 읽은 책은 : ");
		for (Book book : arrayBook) {
			System.out.print(book.getBookName() + " ");
		}
		System.out.println("입니다.");
	}

}
