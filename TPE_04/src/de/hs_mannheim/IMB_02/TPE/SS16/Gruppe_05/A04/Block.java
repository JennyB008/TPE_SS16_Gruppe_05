package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A04;

/**
 * Klasse "Block", die einen Block auf der Strecke repräsentiert. Er besitzt ein
 * Signal, welches rot wird sobald ein Zug einfahert und erst nach Verlassen
 * wieder gruen und damit fuer andere Zuege freigegeben wird.
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */

public class Block {

	private int anfang;
	private int ende;
	private boolean sperre; // true-rot, false-gruen
	private int laenge;

	/**
	 * Konstruktor der Klasse "Block".
	 * 
	 * @param laenge
	 *            - Laenge des Blocks in Kilometern
	 * @param sperre
	 *            - Signnal rot (wenn schon ein Zug in den Block ist) oder gruen
	 *            (wenn sich noch kein Zug in dem Block befindet)
	 */

	public Block(int laenge, boolean sperre) {
		this.laenge = laenge + 1;
		this.sperre = sperre;
		this.ende = anfang + this.laenge;
		try {
			if (laenge < 1) {
				throw new SimulationException("Block muss mindestens eine Laenge von 1 haben");
			}
		} catch (SimulationException se) {
			se.printStackTrace();
		}
	}

	/**
	 * Methode, die den Anfang eines Blocks zurueck gibt
	 * 
	 * @return Anfang
	 */

	public int getAnfang() {
		return anfang;
	}

	/**
	 * Methode, die den Anfang eines Block auf einen bestimmten Wert setzt
	 * 
	 * @param anfang
	 *            - Anfang des Blocks
	 */

	public void setAnfang(int anfang) {
		this.anfang = anfang;
	}

	/**
	 * Methode, die das Ende eines Blocks zurueck gibt
	 * 
	 * @return Ende
	 */

	public int getEnde() {
		return ende;
	}

	/**
	 * Methode, die das Ende eines Block auf einen bestimmten Wert setzt
	 * 
	 * @param ende
	 *            - Ende des Blocks
	 */

	public void setEnde(int ende) {
		this.ende = ende;
	}

	/**
	 * Methode, die zurueck gibt, ob der Block gesperrt ist
	 * 
	 * @return true, wenn rot ; false, wenn gruen
	 */

	public boolean isSperre() {
		return sperre;
	}

	/**
	 * Methode, die das Siganl auf "rot" oder "gruen" setzt
	 * 
	 * @param sperre
	 *            - Signnal rot oder gruen
	 */

	public void setSperre(boolean sperre) {
		this.sperre = sperre;
	}

	/**
	 * Methode, die die Laenge eines Blocks in Kilometern zurueck gibt
	 * 
	 * @return Laenge
	 */

	public int getLaenge() {
		return laenge;
	}

	/**
	 * Methode, die die Laenge des Blocks auf einen bestimmten Wert setzt
	 * 
	 * @param laenge
	 *            - Laenge des Blocks in Kolimetern
	 */

	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}

	/**
	 * Methode, die einen Block sperrt. D.h. das Siganl ist "rot".
	 */

	public void sperren() {
		this.sperre = true;
	}

	/**
	 * Methode, die einen Block entsperrt. D.h. das SIgnal ist "gruen".
	 */

	public void entsperren() {

		this.sperre = false;

	}

	/**
	 * * Methode, die den Hash Code eines Blocks ermittelt
	 * 
	 * @return result - der Hash Code des Blocks
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anfang;
		result = prime * result + ende;
		result = prime * result + laenge;
		result = prime * result + (sperre ? 1231 : 1237);
		return result;
	}

	/**
	 * Methode, die zwei Bloecke miteinander vergleicht
	 * 
	 * @return true, wenn die Bloecke gleich sind; false, wenn die Bloecke nicht
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
		Block other = (Block) obj;
		if (anfang != other.anfang)
			return false;
		if (ende != other.ende)
			return false;
		if (laenge != other.laenge)
			return false;
		if (sperre != other.sperre)
			return false;
		return true;
	}

}
