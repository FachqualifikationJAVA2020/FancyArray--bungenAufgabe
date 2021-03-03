package mitarbeiter;

import eins.FancyArray;

public class MitarbeiterVerwaltung {
	FancyArray mitarbeiterliste = new FancyArray();
	
	public void eintragen(Mitarbeiter neu) {
		/*
		 * Mitarbeiter sollen nicht doppelt eingetragen werden können,
		 * also prüfen: ist der Mitarbeiter schon in der Liste?
		 */
		for(int i=0; i < mitarbeiterliste.size(); i++) {
			if (mitarbeiterliste.get(i).equals(neu)) {
				System.out.println("Mitarbeiter doppelt");
				return;
			}
		}
		mitarbeiterliste.add(neu);
	}
	
	public void entfernen(Mitarbeiter weg) {
		mitarbeiterliste.remove(weg);
	}
	
	public void anzahl() {
		System.out.println("Anzahl: "+mitarbeiterliste.size());
	}
	
	
}
