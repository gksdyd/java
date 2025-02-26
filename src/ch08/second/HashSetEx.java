package ch08.second;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> computerLangs = new HashSet<>();
		
		computerLangs.add("JAVA");
		computerLangs.add("C");
		computerLangs.add("C#");
		computerLangs.add("C++");
		computerLangs.add("HTML");
		computerLangs.add("Matlab");
		computerLangs.add("JAVA");
		
		for(String computerLang : computerLangs) { 
			System.out.println(computerLang);			
		}
	}

}
