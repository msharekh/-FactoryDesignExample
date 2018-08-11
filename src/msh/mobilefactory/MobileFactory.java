package msh.mobilefactory;

public class MobileFactory {

	
	public static Mobile createMobile(String type) {
		// TODO Auto-generated method stub
		if(type.equals("SAMSUNG")){
			return new Samsung(2000, 2, 8);
		}else if(type.equals("IPHONE")){
			return new Iphone(0,0,0);
		}
		return null;
	}

}
