package ch02.third;

public class ArithmeticEx {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 8;
		
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " + " + b + " = " + sum(a, b));
		
		Arithmetic ar = new Arithmetic(a, b);
		ar.print();
	}
	
	static int sum(int a, int b) {
		return a + b;
	}
}
