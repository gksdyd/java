package ch04.third;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV 킨다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV 끔.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > 0) {
			System.out.println("TV " + volume + "볼륨 증가");
		} else if (volume < 0) {
			System.out.println("TV " + Math.abs(volume) + "볼륨 감소");
		}
	}
}
