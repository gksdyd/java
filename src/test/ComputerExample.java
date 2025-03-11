package test;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r;
		
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Computer();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원의 반지름: ");
		r = scan.nextInt();
		
		cal1.print();
		System.out.println("원면적: " + cal1.areaCal(r));
		
		cal2.print();
		System.out.println("원면적: " + cal2.areaCal(r));
	}

}
