package ch03.second;

public class People {

	public String name;
	public String ssn;
	
	public People() {
		// TODO Auto-generated constructor stub
	}
	
	public People(String name, String ssn) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.ssn = ssn;
	}
	
	void sayName() {
		System.out.println("People.name: " + name);
	}
}
