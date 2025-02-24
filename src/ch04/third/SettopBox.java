package ch04.third;

public class SettopBox implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("SettopBox 킨다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("SettopBox 끔.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > 0) {
			System.out.println("SettopBox " + volume + "볼륨 증가");
		} else if (volume < 0) {
			System.out.println("SettopBox " + Math.abs(volume) + "볼륨 감소");
		}
	}

}
