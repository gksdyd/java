package ch08.third;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> friends = new HashMap<>();
		
		friends.put("키", 170);
		friends.put("나이", 30);
		friends.put("몸무게", 60);
		friends.put("힙", 32);
		friends.put("키", 170);
		
		friends.remove("나이");
		
		for (String key : friends.keySet()) {
			System.out.print(key);
			System.out.println(friends.get(key));
		}
	}

}
