package inlupp1;

public class Share extends Valuable {
	
	private int number;
	private int course;
	
	public Share (String name, int number, int value, int course) {
		super(name, value);
		this.number = number;	
		this.course = course;
		value();
	}
	
	@Override
	public int value() {
		return this.number * this.course;
	}
	
	public String toString() {
		return "Share: " + name + ": " + number + ": " + course + ": " + value();
	}

}
