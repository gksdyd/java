package ch05.first;

import java.awt.Toolkit;

public class BeepPrintThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		way1
		Runnable runnable = new BeepPrintRunnable();
		Thread thread = new Thread(runnable);
		
//		way2
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//		});
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(12);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
