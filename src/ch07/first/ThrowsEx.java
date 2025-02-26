package ch07.first;

import java.awt.Toolkit;

public class ThrowsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			abc();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void abc() throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			Thread.sleep(500);
		}
	}
}
