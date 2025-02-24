package ch04.fourth;

public class People {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		user.showMyName("gksdyd009");
		
		Admin admin = new Admin();
		admin.showMyName("gksdyd009");
		
		Member member = new User();
		member.showMyName("gksdyd009");
		
		member = new Admin();
		member.showMyName("gksdyd009");
	}

}
