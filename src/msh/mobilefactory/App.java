package msh.mobilefactory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		//Samsung object
		//Samsung samsung = new Samsung(2000, 2, 8);
		
		MobileFactory mf=new MobileFactory();
		
		Mobile samsung = mf.createMobile(Mobile.SAMSUNG);
		
		System.out.println("mobile model: "+samsung.getModel());
		
		System.out.println("end");

	}

}
