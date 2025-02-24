package ch02.fourth;

public class Earth {

	static final int TOP_BUILDING = 828;
	static final int TOP_MOUNTAIN = 8848;
	
	int compare() {
		return TOP_BUILDING > TOP_MOUNTAIN ?  TOP_BUILDING : TOP_MOUNTAIN;
	}
	
	void printTopBuilding() {
		System.out.println("제일 높은 건물의 높이는 " + TOP_BUILDING + "입니다.");
	}
	
	void print() {
		System.out.println("제일 높은 건물의 높이는 " + compare() + "입니다.");
	}
}
