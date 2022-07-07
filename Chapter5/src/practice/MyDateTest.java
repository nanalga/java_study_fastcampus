package practice;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate data1 = new MyDate(7, 7, 2022);
		System.out.println(data1.isValid());
		MyDate data2 = new MyDate(2, 10, 2006);
		System.out.println(data2.isValid());

	}

}
