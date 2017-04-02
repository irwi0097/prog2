package inlupp1;

public class Device extends Valuable {
	
	private int purchasePrice;
	private int wear;
	
	public Device (String name, int purchasePrice, int wear, int value) {
		super(name, value);
		this.purchasePrice = purchasePrice;
		this.wear = wear;
		value();
	}
	
	@Override
	public int value() {
		switch (wear) {
		case 10:
			this.value = this.purchasePrice;
			break;
		case 9: 
			this.value = (int) (0.9 * this.purchasePrice);
			break;
		case 8:
			this.value = (int) (0.8 * this.purchasePrice);
			break;
		case 7:
			this.value = (int) (0.7 *  this.purchasePrice);
			break;
		case 6:
			this.value = (int) (0.6 * this.purchasePrice);
			break;
		case 5:
			this.value = (int) (0.5 * this.purchasePrice);
			break;
		case 4: 
			this.value = (int) (0.4 * this.purchasePrice);
			break;
		case 3:
			this.value = (int) (0.3 * this.purchasePrice);
			break;
		case 2:
			this.value = (int) (0.2 * this.purchasePrice);
			break;
		case 1:
			this.value = (int) (0.1 * this.purchasePrice);
			break;
		}
		return this.value();
	}
	
	public String toString() {
		return "Device: " + name + ": " + purchasePrice + ": " + wear + ": " + value();
	}
}

