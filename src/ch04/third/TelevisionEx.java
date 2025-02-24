package ch04.third;

public class TelevisionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Television television = new Television();
		television.turnOn();
		
		SettopBox settopBox = new SettopBox();
		settopBox.turnOn();
		
		RemoteControl remoteControl = new Television();
		remoteControl.turnOn();
	}

}
