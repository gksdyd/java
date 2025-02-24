package ch03.first;

public class DmbCellPhone extends CellPhone {

	public DmbCellPhone(String model, String color) {
		super(model, color);
	}

	@Override
	void powerOff() {
		System.out.println("DmbCellPhone.시동을 끕니다.");
	}

	@Override
	void powerOn() {
		System.out.println("DmbCellPhone.시동을 킵니다.");
	}

	
}
