package inlupp1;

public class Jewlery extends Valuable{
	
	private int weight;
	private int stone;
	private String material;

	public Jewlery(String name, int value, int weight, int stone, String material) {
	super(name, value);
	this.weight = weight;
	this.stone = stone;
	this.material = material;
	value();
	}
	
	@Override
	public int value() {
		
	if (material.equals("silver")) {
		this.value = 700;
		}
	
	if (material.equals("gold")) {
		this.value = 2000;
		}
	for (int i = 0; i<this.stone; i++) {
		this.value+=500;
	}
		return this.value;
	}
	
	public void setWeight (int weight) {
		this.weight = weight;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void setStone(int stone) {
		this.stone = stone;
	}
	
	public String toString() {
		return "Jewlery: " + name + ": " + weight + ": " + stone + ": " + material + ": " + value();
	}
}




