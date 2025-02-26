package ch08.first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> test = new ArrayList<>();
		
		System.out.println(test.size());
		
		test.add("Hanyong");
		test.add("Hanyong");
		test.add("Hanyong");
		test.add("Hanyong");
		test.add("Hanyong");
		test.add("Hanyong");
		test.add("Hanyong");
		test.add("Hanyong");

		System.out.println(test.size());
		
		for (String a : test) {
			System.out.println(a);
		}
		
//		test.remove(test.size() - 1);			
//		test.remove(test.size() - 1);			
//		test.remove(test.size() - 1);			
//		test.remove(test.size() - 1);
//		
//		System.out.println(test.size());
	}

}
