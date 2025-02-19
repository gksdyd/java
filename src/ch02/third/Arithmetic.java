package ch02.third;

public class Arithmetic {

	int a;
	int b;
	
	Arithmetic(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int sum() {
		return a + b;
	}
	
	void print() {
		System.out.println(a + " + " + b + " = " + sum());
	}
}
