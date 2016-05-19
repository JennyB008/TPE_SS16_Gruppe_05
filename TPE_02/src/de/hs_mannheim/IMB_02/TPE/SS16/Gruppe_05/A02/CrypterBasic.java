package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A02;

/**
 * Klasse "CrypterBasis", von der alle anderen Crypterklassen abgeleitet sind
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */
public class CrypterBasic {

	protected Key key;
	protected String klartext;

	/**
	 * Konstruktor der Klasse CrypterBasic
	 * 
	 * @param key
	 *            - Schluessel für die Verschluesselung
	 */

	public CrypterBasic(Key key) {
		this.key = key;
	}

}
