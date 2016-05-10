package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A03;

/**
 * Klasse "ClubManagement" als Testumgebung fuer die erstellte Vereinssoftware,
 * um die Verwendung zu demonstrieren.
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */

public class ClubManagement {

	public static MembershipList vereinsListe1 = new MembershipList();
	public static MembershipList vereinsListe2 = new MembershipList();

	public static Member mustermannH = new Member(2, "Mustermann", "Heinz", 16);
	public static Member kochA = new Member(6, "Koch", "Anette", 15);
	public static Member simpsonB = new Member(5, "Simpson", "Bart", 9);
	public static Member simpsonL = new Member(3, "Simpson", "Lisa", 5);
	public static Member simpsonLi = new Member(2, "Simpson", "Lisa", 5);

	public static void main(String[] args) {
		vereinsListe1.put(kochA);
		vereinsListe1.put(mustermannH);
		vereinsListe1.put(simpsonB);
		vereinsListe1.put(simpsonL);
		System.out.println("Länge der ersten Liste: " + vereinsListe1.size() + "\n" );
		System.out.println("Inhalt der ersten Liste: \n " + vereinsListe1 + "\n");
		vereinsListe1.remove(2);
		vereinsListe2 = (MembershipList) vereinsListe1.clone();
		vereinsListe2.put(simpsonLi);
		System.out.println("Erste Liste: " + vereinsListe2 + "\n");
		System.out.println("Erste Liste - Mitglied mit Nummer 2: " + vereinsListe1.get(2));
		System.out.println("Zweite Liste - Mitglied mit Nummer 2: " + vereinsListe2.get(2));
		//System.out.println("Erste Liste: " + vereinsListe1 + "\n");
		System.out.println("Erste Liste - Mitglied mit Nummer 5: " + vereinsListe1.get(5));
		vereinsListe1.get(5).setVorname("Günter");
		System.out.println("Erste Liste - Mitlgied mit Nummer 5: " + vereinsListe1.get(5));
		vereinsListe2.remove(5);
		System.out.println("Erste Liste: " + vereinsListe1 + "\n");
		System.out.println("Zweite Liste: " + vereinsListe2 + "\n");
		vereinsListe1.clear();
		vereinsListe2.clear();
		System.out.println("Länge der ersten Liste: " + vereinsListe1.size());
		System.out.println("Länge der zweiten Liste: " + vereinsListe2.size());
	}
}
