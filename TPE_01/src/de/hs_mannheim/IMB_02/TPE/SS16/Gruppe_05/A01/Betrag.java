package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A01;

/**
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */

public class Betrag {

	long menge;
	double prozentwert;
	Waehrung w;
	double promillewert;
	long vorkomma;

	/**
	 * Konstruktor der Klasse Betrag für menge als long
	 * 
	 * @param menge
	 *            - Geldbetrag
	 * @param w
	 *            - Waehrung des Geldbetrags
	 */
	Betrag(long menge, Waehrung w) {
		this.menge = menge;
		this.w = w;
	}

	/**
	 * Konstruktor der Klasse Betrag für menge als double
	 * 
	 * @param menge
	 *            - Geldbetrag
	 * @param w
	 *            - Waehrung des Geldbetrags
	 */

	Betrag(double menge, Waehrung w) {
		this.menge = (long) menge * 100;
		this.w = w;
	}

	/**
	 * Konstruktor der Klasse Betrag
	 * 
	 * @param a
	 *            - Betrag, der übergeben wird
	 */
	public Betrag(Betrag a) {
		this.menge = a.getMenge();
		this.w = a.getWaehrung();
	}

	/**
	 * Methode, die die Waehrung zurückgibt
	 * 
	 * @return Waehrung
	 */
	public Waehrung getWaehrung() {
		return w;
	}

	/**
	 * Methode, die den Geldbetrag zurückgibt
	 * 
	 * @return Geldbetrag
	 */
	public long getMenge() {
		return menge;
	}

	/**
	 * Methode, die zurückgibt, ob der Geldbetrag positiv, negativ oder gleich
	 * Null ist
	 * 
	 * @return -1, wenn negativer Betrag; 1, wenn positiver Betrag; 0, wenn
	 *         Betrag gleich Null ist
	 */
	public int getVorzeichen() {

		if (menge < 0) {
			return -1;
		} else if (menge > 0) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * Methode, die einen Betrag zu einen anderen Betrag aufaddiert
	 * 
	 * @param b
	 *            - Betrag, der addiert werden soll
	 * @return this.menge - Ergebnis der Addition
	 */
	public long addiere(Betrag b) {

		if (this.getWaehrung() == b.getWaehrung()) {
			this.menge = this.menge + b.menge;
		} else {
			this.menge = this.menge + b.getWaehrung().umrechnen(b, this.getWaehrung());
		}
		return this.menge;
	}

	/**
	 * Methode, die von einem Betrag einen anderen Betrag abzieht
	 * 
	 * @param b
	 *            - Betrag der abgezogen werden soll
	 * @return this.menge - Ergebnis der Subtraktion
	 */
	public long subtrahiere(Betrag b) {

		if (this.getWaehrung() == b.getWaehrung()) {
			this.menge = this.menge - b.menge;
		} else {
			this.menge = this.menge - b.getWaehrung().umrechnen(b, this.getWaehrung());
		}
		return this.menge;
	}

	/**
	 * Methode, die einen Betrag mit einer double Zahl multipliziert
	 * 
	 * @param m
	 *            - Zahl, mit der der Betrag multipliziert werden soll
	 * @return this.menge - Ergebnis der Mutiplikation
	 */
	public long multipliziere(double m) {
		this.menge = (long) (this.menge * m);
		return this.menge;
	}

	/**
	 * Methode, die einen Betrag mit eine int Zahl multipliziert
	 * 
	 * @param m
	 *            - Zahl, mit der der Betrag multipliziert werden soll
	 * @return this.menge - Ergebnis der Multiplikation
	 */
	public long multipliziere(int m) {
		this.menge = this.menge * m;
		return this.menge;
	}

	/**
	 * Methode, die einen Prozentwert eines Betrags ermittelt
	 * 
	 * @param prozent
	 *            - gibt an wie viel Prozent von einem Betrag berechnet werden
	 *            sollen
	 * @return prozentwert - Prozentwert des Betrags
	 */
	public double prozent(double prozent) {
		prozentwert = (this.menge / 100) * prozent;
		return prozentwert;
	}

	/**
	 * Methode, die eine Promillewert eines Betrags ermittelt
	 * 
	 * @param promille
	 *            - gibt an wie viel Promille von einem Betrag berechnet werden
	 *            sollen
	 * @return Promillewert des Betrags
	 */
	public double promille(double promille) {
		double temp = (double) this.menge;
		promillewert = (temp / 1000) * promille;
		return promillewert;
	}

	/**
	 * Methode, die den Betrag vor dem Komma liefert
	 * 
	 * @return Vorkommabetrag
	 */
	public long getVorkomma() {
		return vorkomma = (long) (menge / 100.0);
	}

	/**
	 * Methode, die den Betrag nach dem Komma liefert
	 * 
	 * @return Nachkommabetrag
	 */
	public double getNachkomma() {

		double temp1 = this.getAsDouble();
		double temp2 = (temp1 - this.getVorkomma());
		return temp2;
	}

	/**
	 * Methode, die Informationen zu einem Betrag als String zurückgibt
	 * 
	 * @return s - String, der die Menge als double, die Weahrung und das Krzel
	 *         eines Betrags beinhaltet
	 */
	@Override
	public String toString() {
		String s = this.getAsDouble() + " " + this.getWaehrung().getKuerzel();
		return s;
	}

	/**
	 * Methode, die den Betrag als double zurückliefert
	 * 
	 * @param a
	 *            - Betrag a
	 * @return Betrag a als double-Zahl
	 */
	public double getAsDouble() {
		double temp1 = (double) this.getMenge();
		double temp2 = (temp1 / 100);
		return temp2;
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
		result = prime * result + (int) (menge ^ (menge >>> 32));
		result = prime * result + ((w == null) ? 0 : w.hashCode());
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
		Betrag other = (Betrag) obj;
		if (menge != other.menge)
			return false;
		if (w == null) {
			if (other.w != null)
				return false;
		} else if (!w.equals(other.w))
			return false;
		return true;
	}

}