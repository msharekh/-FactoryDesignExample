package msh.mobilefactory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		//Samsung object
//		Samsung samsung = new Samsung(2000, 2, 8);
		Mobile samsung = MobileFactory.createMobile("SAMSUNG");
		
		System.out.println("mobile model: "+samsung);
	}

}
