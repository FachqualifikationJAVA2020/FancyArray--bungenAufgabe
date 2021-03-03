package mitarbeiter;

import java.util.Scanner;

/*
 * Legen Sie ein Extra-Package mitarbeiter an, in dem Sie eine Klasse Mitarbeiter anlegen.
 * Ein Mitarbeiter hat vorname, nachname und alter. Um einen Mitarbeiter anzulegen gibt
 * es eine Methode anlegen(), die einen Scanner zum Einlesen benutzt 
 * und zum Anzeigen eine Methode anzeigen(), die den Mitarbeiter auf der Konsole ausgibt
 * benutzt.
 */
public class Mitarbeiter {
	private String vorname;
	private String nachname;
	private int alter;
	
	private Scanner sc = new Scanner(System.in);
	
	public Mitarbeiter anlegen() {
		Mitarbeiter neu = new Mitarbeiter();
		
		System.out.print("Bitte Vornamen eingeben: ");
		neu.vorname = sc.nextLine();
		System.out.print("Bitte Nachnamen eingeben: ");
		neu.nachname = sc.nextLine();
		System.out.print("Bitte das Alter eingeben: ");
		neu.alter = sc.nextInt();
		sc.nextLine();
//		sc.close();
		/*
		 *	Vorsicht, bei Schlieﬂen des Scanners wird auch der InputStream
 		 * geschlossen, also System.in! Dann kann ich nichts mehr von der 
 		 * Tastatur einlesen :(
		 */
		return neu;
	}
	
	public void ausgabe() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return nachname+", "+vorname+" ("+alter+")";
	}
	
}
