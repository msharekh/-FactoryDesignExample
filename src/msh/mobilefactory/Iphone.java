package msh.mobilefactory;

public class Iphone implements Mobile {
	int memory;
	int cameras;
	int model;
	public Iphone(int memory, int cameras, int model) {
 		this.memory = memory;
		this.cameras = cameras;
		this.model = model;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getCameras() {
		return cameras;
	}
	public void setCameras(int cameras) {
		this.cameras = cameras;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	 
	 

}
