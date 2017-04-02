package hundregistret;

public class Hund {
	
	public static final double TAX_SVANSLÄNGD = 3.7;
	
	private String namn;
	private int ålder;
	private String ras;
	private double vikt;
	private double svanslängd;
	
	public Hund(String namn, String ras, int ålder, double vikt) {
		this.namn = namn;
		this.ålder = ålder;
		this.ras = ras;
		this.vikt = vikt;
		if (ras.equalsIgnoreCase("tax")) {
			this.svanslängd = TAX_SVANSLÄNGD;
		} else {
			this.svanslängd = (vikt * ålder) /10;
		}
	}
	
	public String getNamn() {
		return namn;
	}
	
	public int getÅlder() {
		return ålder;
	}
	
	public String getRas() {
		return ras;
	}
	
	public double getVikt() {
		return vikt;
	}
	
	public double getSvanslängd() {
		return svanslängd;
	}
	
	public String toString() {
		return String.format("%s %s %d år %.1f kg svanslängd = %.1f ", namn, ras, ålder, vikt, svanslängd);
	}
}
