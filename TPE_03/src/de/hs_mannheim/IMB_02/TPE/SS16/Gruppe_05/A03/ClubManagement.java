package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A03;

/**
 * Klasse "ClubManagement" als Testumgebung fuer die erstellte Vereinssoftware,
 * um die Verwendung zu demonstrieren.
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */

public class ClubManagement {
		
	public static void main(String[] args) {

		//neue Vereinliste anlegen
		MembershipList liste1 = new MembershipList();
		
		//Mitglieder erzeugen
		Member mustermannH = new Member(2, "Mustermann", "Heinz", 16);
		Member kochA = new Member(6, "Koch", "Anette", 15);
		Member simpsonB = new Member(5, "Simpson", "Bart", 9);
		Member simpsonL = new Member(3, "Simpson", "Lisa", 5);
		
		//Mitglieder in Vereinsliste einfügen
		liste1.put(kochA);
		liste1.put(mustermannH);
		liste1.put(simpsonB);
		liste1.put(simpsonL);
		
		//Länge der Vereinsliste und Mitglieder ausgeben
		System.out.println("Länge der ersten Liste: " + liste1.size() + "\n");
		System.out.println("Inhalt der ersten Liste: \n " + liste1 + "\n");
	
		//Mitglied mit ID 2 löschen
		liste1.remove(2);
		
		//neue Vereinsliste (Vereinsliste 2) erstellen
		MembershipList liste2 = new MembershipList();	
		
		//Kopieren der alten Liste	
		liste2 = (MembershipList) liste1.clone();
		
		//neues Mitglied erstellen und in Liste 2 einfügen
		Member simpsonLi = new Member(2, "Simpson", "Lisa", 5);
		liste2.put(simpsonLi);
		
		//Prüfen der Existenz von Mitglied mit ID 2 in beiden Listen
		System.out.println("Erste Liste - Mitglied mit Nummer 2: " + liste1.get(2));
		System.out.println("Zweite Liste - Mitglied mit Nummer 2: " + liste2.get(2));
		
		//Mitglied mit ID 5 in Vereinsliste 2
		System.out.println("Zweite Liste - Mitglied mit Nummer 5: " + liste2.get(5));
		
		//Änderung des Vornames in Günter
		liste1.get(5).setVorname("Günter");
		System.out.println(liste2.get(5));
		
		//Mitglieder aus Vereinsliste 1 und 2 ausgeben
		System.out.println("Erste Liste: " + liste1 + "\n");
		System.out.println("Zweite Liste: " + liste2 + "\n");
		
		//Mitglied mit ID 5 aus Vereinsliste 2 löschen
		liste2.remove(5);
		
		//Mitglieder der 1. und 2. Liste ausgeben
		System.out.println("Erste Liste: " + liste1 + "\n");
		System.out.println("Zweite Liste: " + liste2 + "\n");
		
		//Beide Listen leeren und Länge ausgeben
		liste1.clear();
		liste2.clear();
		System.out.println("Länge der ersten Liste: " + liste1.size());
		System.out.println("Länge der zweiten Liste: " + liste2.size());
	}
}
