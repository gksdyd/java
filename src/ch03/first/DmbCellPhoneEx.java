package ch03.first;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		CellPhone cellPhone = new CellPhone();
//		cellPhone.model = "SAMSUNG";
//		cellPhone.color = "Black";
//		System.out.println(cellPhone.model);
		
//		CellPhone cellPhone1 = new CellPhone();
//		cellPhone1.model = "iPhone";
//		cellPhone1.color = "16";
//		System.out.println(cellPhone1.model);
		
//		DmbCellPhone dmbCellPhone = new DmbCellPhone();
//		dmbCellPhone.model = "SAMSUNG2";
//		dmbCellPhone.color = "Black2";
//		System.out.println(dmbCellPhone.model);
		
		CellPhone cellPhone = new CellPhone("SAMSUNG", "Black");
		CellPhone cellPhone1 = new CellPhone("iPhone", "16");
		DmbCellPhone dmbCellPhone = new DmbCellPhone("SAMSUNG2", "Black2");
		
		System.out.println(cellPhone.getModel());
		System.out.println(cellPhone1.getModel());
		System.out.println(dmbCellPhone.getModel());
		
		dmbCellPhone.powerOff();
		dmbCellPhone.powerOn();
	}

}
