package ch03.first;

public class CellPhone {

	String model;
	String color;
	
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	void powerOff() {
		System.out.println("시동을 끕니다.");
	}
	
	void powerOn() {
		System.out.println("시동을 킵니다.");
	}
}
