package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A03;

/**
 * Klasse "Member", die ein Vereinsmitlgied des Kryptoanalytiker e.V. und seine
 * persoenlichen Daten darstellt.
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */
public class Member {

	private int mitgliederID;
	private String nachname;
	private String vorname;
	private int anzahlMitgliedsjahre;

	/**
	 * Konstruktor der Klasse "Member".
	 * 
	 * @param mitgliederID
	 *            - Mitgliedsnummer, die jedes Mitglied automatisch erhaelt
	 * @param nachname
	 *            - Nachname des Mitglieds
	 * @param vorname
	 *            - Vorname des Mitglieds
	 * @param anzahlMitgliedsjahre
	 *            - Anzahl an Jahren, die eine Person Mitglied ist
	 */
	public Member(int mitgliederID, String nachname, String vorname, int anzahlMitgliedsjahre) {
		this.mitgliederID = mitgliederID;
		this.nachname = nachname;
		this.vorname = vorname;
		this.anzahlMitgliedsjahre = anzahlMitgliedsjahre;
	}

	/**
	 * Methode, die die MitggliedsID zurueck gibt
	 * 
	 * @return MitgliederID
	 */
	public int getMitgliederID() {
		return mitgliederID;
	}

	/**
	 * Methode, die den Nachnamen eines Mitglieds zurueck gibt
	 * 
	 * @return Nachname des Mitglieds
	 */

	public String getNachname() {
		return nachname;
	}

	/**
	 * Methode, die den Nachnamen eines Mitglied auf einen bestimmten Namen
	 * setzt
	 * 
	 * @param nachname
	 *            - Nachname des Mitglieds
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * Methode, die den Vornamen eines Mitglieds zurueck gibt
	 * 
	 * @return Vorname des Mitglieds
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * Methode, die den Vornamen eines Mitglied auf einen bestimmten Namen setzt
	 * 
	 * @param nachname
	 *            - Vorname des Mitglieds
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * Methode, die die Anzahl der Mitgliedsjahre zurueck gibt
	 * 
	 * @return anzahlMitgliedsjahre - Anzahl an Jahren, die eine Person Mitglied
	 *         ist
	 */
	public int getAnzahlMitgliedsjahre() {
		return anzahlMitgliedsjahre;
	}

	/**
	 * Methode, die die Mitgiedsjahre auf eine bestimmte Zahl setzt
	 * 
	 * @param anzahlMitgliedsjahre
	 *            - Anzahl an Jahren, die eine Person Mitglied ist
	 */
	public void setAnzahlMitgliedsjahre(int anzahlMitgliedsjahre) {
		this.anzahlMitgliedsjahre = anzahlMitgliedsjahre;
	}

	/**
	 * Methode, die vergleicht, ob zwei Mitglieder gleich sind. Ueber die
	 * MitgliedsID, da diese fuer jedes Mitlgied eindeutig ist.
	 * 
	 * @param member
	 *            - Mitglied, mit dem verglichen wird
	 * @return true - wenn die Mitgleider gleich sind; false - wenn die
	 *         Mitglieder nicht gleich sind
	 */
	public boolean vergleich(Member member) {
		int a = this.getMitgliederID();
		int b = member.getMitgliederID();
		if (a == b) {
			return true;
		}
		return false;
	}

	/**
	 * Methode, die Mitglieder und Informationen zu ihnen ausgibt
	 * 
	 */
	@Override
	public String toString() {
		String s = "MitgliedsID: " + mitgliederID + ", Nachname: " + nachname + ", Vorname: " + vorname
				+ ", Anzahl der Mitgliedsjahre: " + anzahlMitgliedsjahre + "\n";
		return s;
	}

	/**
	 * * Methode, die den Hash Code eines Objekts ermittelt
	 * 
	 * @return result - der Hash Code des Objekts
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anzahlMitgliedsjahre;
		result = prime * result + mitgliederID;
		result = prime * result + ((nachname == null) ? 0 : nachname.hashCode());
		result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
		return result;
	}

	/**
	 * Methode, die zwei Objetkte miteinander vergleicht
	 * 
	 * @return ture, wenn die Objekte gleich sind; false, wenn die Objekte nicht
	 *         gleich sind
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (anzahlMitgliedsjahre != other.anzahlMitgliedsjahre)
			return false;
		if (mitgliederID != other.mitgliederID)
			return false;
		if (nachname == null) {
			if (other.nachname != null)
				return false;
		} else if (!nachname.equals(other.nachname))
			return false;
		if (vorname == null) {
			if (other.vorname != null)
				return false;
		} else if (!vorname.equals(other.vorname))
			return false;
		return true;
	}

}