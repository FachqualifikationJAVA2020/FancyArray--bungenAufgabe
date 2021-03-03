package uebungen;

import eins.FancyArray;

public class Namensliste {
//	public void removeAll(Object o) {
//		do{
//			remove(o);
//		} while(indexOf(o)!=-1);
//	}
	
	public static void main(String[] args) {

		FancyArray test = new FancyArray();
		String[] namensliste = {"Brauer","Müller","Brauer","Schulze","Brauer","Huber","Meier","Brauer"};
		for(int i=0;i<namensliste.length;i++) {
			test.add(namensliste[i]);
		}
		System.out.println(test);
		
		int count = 0;
		while(test.indexOf("Brauer")!=-1) {
			test.remove("Brauer");
			count++;
		};
		System.out.println(test);
		System.out.println("Brauer kam "+count+"mal vor");
	}	
}
