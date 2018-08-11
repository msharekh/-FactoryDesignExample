package msh.mobilefactory;

public class MobileFactory {
	
	public Mobile createMobile(String type) {
		// TODO Auto-generated method stub
		if(type==null){
			return null;
		}
		
		if(type.equalsIgnoreCase("SAMSUNG")){
			return new Samsung(2000, 2, 8);
		}else if(type.equalsIgnoreCase("IPHONE")){
			return new Iphone(0,0,0);
		}
		return null;
	}

}
