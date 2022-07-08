package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		
		for(int i = 0; i < list.size(); i++) {
			String str = (String)list.get(i);
			System.out.println(str);
		}
		
		for (Object str : list) {
			System.out.println(str);
		}

	}

}
