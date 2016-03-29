package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A01;

/**
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 * @param <String>
 *
 */
public class Konto extends Betrag {

	private String inhaber;
	private Betrag b;
	private final double PROMILL = 0.5;
	private Betrag[] konto = new Betrag[100];
	private int zeiger = 0;

	/**
	 * Konstrukter der Klasse Konto
	 * 
	 * @param <String>
	 * 
	 * @param inhaber
	 *            - Inhaber des Kontos
	 * @param a
	 *            - Betrag a (mit Geldemenge und Waehrung), der bei Eroeffnung
	 *            auf dem Konto liegt
	 */
	Konto(String inhaber, Betrag a) {
		super(a);
		this.inhaber = inhaber;
	}

	/**
	 * Konstruktor der Klasse Konto
	 * 
	 * @param inhaber
	 *            - Inhaber des Kontos
	 * @param betrag
	 *            - Betrag, der bei Eroeffnung auf dem Konto liegt
	 * @param w
	 *            - Waehrung es Betrags
	 */
	Konto(String inhaber, double menge, Waehrung w) {
		super(menge, w);
		this.inhaber = inhaber;
	}

	/**
	 * Methode, die den Namen des Kontoinhabers liefert
	 * 
	 * @return Name des Kontoinhabers
	 */
	public String getInhaber() {
		return inhaber;
	}

	/**
	 * Methode, die die Waehrung des Kontos liefert
	 * 
	 * @return Waehrung der GeldbetrÃ¤ge auf dem Konto
	 */
	public Waehrung getWaehrung() {
		return super.getWaehrung();
	}

	/**
	 * Methode, die den Betrag eines Kontos liefert
	 * 
	 * @return b - Betrag des Kontos
	 */
	public Betrag getBetrag() {
		return b;
	}

	/**
	 * Methode, die Beträge aus das Konto zu buchen bzw. Beträge abzubuchen
	 * 
	 * @param b
	 *            - Betrag, der auf oder abgebucht werden soll
	 * @return temp - Kontostand nach der Buchung
	 */
	public long buchen(Betrag b) {
		konto[zeiger] = b;
		long temp = this.addiere(b);
		this.zeiger++;
		return temp;
	}

	/**
	 * Methode, die den momentanen Kontostand liefert
	 * 
	 * @return Kontostand
	 */
	public double saldo() {
		return (double) (super.getMenge());
	}

	/**
	 * Methode, die einen gewissen Promillesatz vom Konto abzieht
	 * 
	 * @param PROMILL
	 *            - Promilleangebe, die abgezogen werden soll
	 * @return temp - Kontostand nach dem Abzug
	 */
	public double gebuehren(double PROMILL) {
		double temp = promille(PROMILL);
		temp = Math.round(temp * 100);
		Betrag b = new Betrag(-(temp / 10000), this.getWaehrung());
		buchen(b);
		return temp;

	}

	/**
	 * Methode, die einen Überblick über verschiedene Buchungen eines Kontos
	 * bietet
	 * 
	 * @return kontoauszug
	 */
	public String toString() {
		String kontoauszug = "Kontoinhaber: " + this.inhaber + "\nWÃ¤hrung: " + super.getWaehrung().getName()
				+ "\n----------\n";
		for (int i = 0; konto[i] != null; i++) {
			kontoauszug = kontoauszug + konto[i].getAsDouble() + " " + konto[i].getWaehrung().getKuerzel() + "\n";
		}
		kontoauszug = kontoauszug + "----------\n" + "Saldo: " + getAsDouble() + " " + super.getWaehrung().getKuerzel();
		return kontoauszug;
	}

}
