package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A01;

/**
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */

public class Betrag {

	long menge;
	Waehrung w;
	double prozentwert;
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
	 * Methode, die zwei Betraege addiert
	 * 
	 * @param a
	 *            - Betrag a
	 * @param b
	 *            - Betrag b, der zu a addiert werden soll
	 * @param aw
	 *            - Waehrung von Betrag a
	 * @param bw
	 *            - Waehrung von Betrag b
	 * @return Ergebnis der Addition
	 */

	public long addiere(Betrag a, Betrag b, Waehrung aw, Waehrung bw) {
		long add = a.getMenge() + (bw.umrechnen(a, aw));
		return add;
	}

	/**
	 * Methode, die zwei Betraege subtrahiert
	 * 
	 * @param a
	 *            - Betrag a
	 * @param b
	 *            - Betrag b, der zu a addiert werden soll
	 * @param aw
	 *            - Waehrung von Betrag a
	 * @param bw
	 *            - Waehrung von Betrag b
	 * @return Ergebnis der Subtraktion
	 */

	public long subtrahiere(Betrag a, Betrag b, Waehrung aw, Waehrung bw) {
		long sub = a.getMenge() - (bw.umrechnen(a, aw));
		return sub;
	}

	/**
	 * Methode, die einen Betrag mit einer double-Zahl multipliziert
	 * 
	 * @param menge
	 *            - Betrag menge
	 * @param m
	 *            - Zahl (double), mit der multipliziert wird
	 */
	public void multipliziere(long menge, double m) {
		this.menge = (long) (menge * m);
	}

	/**
	 * Methode, die einen Betrag mit einer int-Zahl multipliziert
	 * 
	 * @param menge
	 *            - Betrag menge
	 * @param m
	 *            - Zahl (int), mit der multipliziert wird
	 */
	public void multipliziere(long menge, int m) {
		this.menge = menge * m;
	}

	/**
	 * Methode, die einen bestimmten Prozentsatz von einem Betrag zurück liefert
	 * 
	 * @param menge
	 *            - Betrag
	 * @param prozent
	 *            - Prozentsatz
	 * @return Prozentwert vom Betrag
	 */
	public double prozent(long menge, double prozent) {
		prozentwert = (menge / 100) * prozent;
		return prozentwert;
	}

	/**
	 * Methode, die einen bestimmten Promillesatz von einem Betrag zurückliefert
	 * 
	 * @param menge
	 *            - Betrag
	 * @param promille
	 *            - Promillesatz
	 * @return Promillewert vom Betrag
	 */
	public double promille(long menge, double promille) {
		promillewert = (menge / 1000) * promille;
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
	public double getNachkomma(Betrag a) {

		double temp = getAsDouble(a);
		double temp2 = temp - a.getVorzeichen();
		return temp2;
	}

	@Override
	public String toString() {
		return getAsDouble(this) + " " + this.getWaehrung().getKuerzel();
	}

	/**
	 * Methode, die den Betrag als double zurückliefert
	 * 
	 * @param a - Betrag a
	 * @return Betrag a als double-Zahl
	 */
	public double getAsDouble(Betrag a) {

		long temp2 = a.getMenge();
		double temp = (double) (temp2 / 100);
		return temp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (menge ^ (menge >>> 32));
		result = prime * result + ((w == null) ? 0 : w.hashCode());
		return result;
	}

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