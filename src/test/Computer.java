package test;

public class Computer extends Calculator {

	@Override
	double areaCal(double r) {
		// TODO Auto-generated method stub
		return r * r * Constants.PAI_2;
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
	}
}
