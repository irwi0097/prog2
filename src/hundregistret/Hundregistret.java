package hundregistret;
import java.util.Scanner;
import java.util.ArrayList;

public class Hundregistret {
	
	private Scanner tangentbord = new Scanner(System.in);
	private ArrayList<Hund> hund = new ArrayList<Hund>();
	
	private String inläsningText (String ledtext) {
		System.out.print(ledtext);
		
		return tangentbord.nextLine();
	}
	
	private int inläsningTal (String ledtext) {
		System.out.print(ledtext);
		int tal = tangentbord.nextInt();
		tangentbord.nextLine();
		return tal;
	}
	
	private double inläsningDecimaltal (String ledtext) {
		System.out.print(ledtext);
		double decimaltal = tangentbord.nextDouble();
		tangentbord.nextLine();
		return decimaltal;
	}
	
	private Hund registreraHund() {
		System.out.println("\n Registrera hund: ");
		String namn = inläsningText("Hundens namn: ");
		String ras = inläsningText("Ras: ");
		int ålder = inläsningTal("Ålder: ");
		double vikt = inläsningDecimaltal("Vikt: ");
		
		Hund h = new Hund(namn, ras, ålder, vikt);
		
		return h;
	}
	
	private void listaRegistreradeHundar() {
		System.out.println("\nLista på registrerade hundar");
		for (int x = 0; x < hund.size(); x++) {
			System.out.println(hund.get(x));
		}
	}
	
	private void listaHundarEfterSvanslängd() {
		System.out.println("Visa lista på hundar beroende på svanslängd");
		System.out.print("Skriv in en svanslängd: ");
		double svanslängd = tangentbord.nextDouble();
		for (int x = 0; x < hund.size(); x++) {
			if (hund.get(x).getSvanslängd() > svanslängd) {
				System.out.println(hund.get(x));
			}
		}
	}
	
	private void taBortHund() {
		System.out.println("Radera hund från hundregistret");
		String namn = inläsningText("Skriv namnet på hunden som vu vill ta bort: ");
		System.out.println();
		int hundindex = -1;
		for (int i = 0; i < hund.size(); i++) {
			if (namn.equalsIgnoreCase(hund.get(i).getNamn())) {
				hundindex = -1;
			}
		}
		if (hundindex == 1) {
			System.out.print("Hunden med det angivna namnet finns inte");
		} else {
			hund.remove(hundindex);
			System.out.print("Hunden med det angivna namnet är nu borttagen");
		}
	}
	
	private void avsluta() {
		System.out.println("\nProgrammet avslutat");
		System.exit(0);
	}
	
	private void kommando() {
		int alternativ = 0;
		while (alternativ !=4) {
			alternativ =  inläsningTal("Välj följande:\n 1.Registrera hund\n 2.Visa lista på hundar\n 3.Ta bort hund\n 4.Avsluta programmet\n Välj: ");
		switch (alternativ) {
		case 1: 
			hund.add(registreraHund());
			System.out.println();
			break;
		case 2: 
			listaRegistreradeHundar();
			System.out.println();
			listaHundarEfterSvanslängd();
			System.out.println();
			break;
		case 3: 
			taBortHund();
			System.out.println();
			break;
		case 4:
			avsluta();
			break;
		default:
			System.out.println("Felaktivt alternativ! Skriv en siffra mellan 1-4");
			}
		}
	}
	public static void main(String args[]) {
		Hundregistret program = new Hundregistret();
		program.kommando();
	}

}
