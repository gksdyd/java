package ch06.first;

public class BoxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box<Integer> box = new Box<>();
		box.a = 1;
		System.out.println(box.a);
		
		box.setT(1);
		System.out.println(box.getT());
		
		Box<String> box1 = new Box<>();
		box1.setT("Hanyong");
		System.out.println(box1.getT());
	}

}
