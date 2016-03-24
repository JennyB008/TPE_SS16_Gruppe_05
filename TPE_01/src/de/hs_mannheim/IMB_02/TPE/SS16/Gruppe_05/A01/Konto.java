package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A01;

/**
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */
public class Konto extends Betrag {
	private String inhaber;
	Betrag a;
	private final double PROMILL = 0.5;

	/**
	 * Konstrukter der Klasse Konto
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
	Konto(String inhaber, double betrag, Waehrung w) {
		super(betrag, w);
		this.inhaber = inhaber;
	}
/**
 * Methode, die den Namen des Kontoinhabers liefert
 * @return Name des Kontoinhabers
 */
	public String getInhaber() {
		return inhaber;
	}
/**
 * Methode, die die Waehrung zurückgibt
 * @return Waehrung von a/this?????
 */
	@Override
	public Waehrung getWaehrung() {
		return this.getWaehrung();
	}
/**
 * Methode, die Betraege (positive und negative) auf ein Konto bucht
 * @param k - Konto k, auf das gebucht wird
 * @param b - Betrag b, der auf k gebucht wird
 * @return
 */
	public long buchen(Konto k, Betrag b) {
		long temp = addiere(k.getBetrag(), b, k.getWaehrung(), b.getWaehrung());
		return temp;
	}
/**
 * Methode, die den Betrag auf dem Konto zurückliefert
 * @return Betrag auf dem Konto
 */
	private Betrag getBetrag() {
		return a;
	}
/**
 * Methode, die das Saldo auf dem Konto abfragt, d.h. die Summer aller Buchungen
 * @return Saldo als double
 */
	public double saldo() {
		return (double) (this.getBetrag().getMenge());
	}
/**
 * Methode, die einen Promillesatz(von der Bank festgelegt) an Gebuehruen vom Konto abzieht
 * @return Betrag, der vom Konto abgezogen wird
 */
	public double gebuehren() {
		double temp = promille((long) (this.saldo() * 100), PROMILL);
		return temp;
	}

}

