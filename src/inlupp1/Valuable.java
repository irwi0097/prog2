package inlupp1;

abstract public class Valuable {
	
	public String name;
	public int value;
	
	public Valuable (String name, int value) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	abstract public int value();
}
