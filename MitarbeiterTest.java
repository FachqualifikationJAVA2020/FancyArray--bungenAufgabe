package mitarbeiter;

public class MitarbeiterTest {

	public static void main(String[] args) {
		Mitarbeiter eins = new Mitarbeiter();
		eins = eins.anlegen();
		
		eins.ausgabe();
		
		MitarbeiterVerwaltung ma = new MitarbeiterVerwaltung();
		ma.eintragen(eins);
		ma.eintragen(eins);
		ma.eintragen(eins.anlegen());
		
		ma.anzahl();
		
		ma.entfernen(eins);
		ma.anzahl();
		
	}

}
