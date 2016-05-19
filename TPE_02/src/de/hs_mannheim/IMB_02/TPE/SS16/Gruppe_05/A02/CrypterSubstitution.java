package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A02;

/**
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */
public class CrypterSubstitution extends CrypterBasic implements Crypter {

	private final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private String k = key.getKey();

	/**
	 * Konstruktor der Klasse "CrypterSubstitution"
	 * 
	 * @param key
	 *            - Schluessel für die Verschluesselung
	 */
	public CrypterSubstitution(Key key) {
		super(key);
	}

	/**
	 * Methode, die einen String verschluesseln nach der Subtitutions-Methode
	 * kann.
	 * 
	 * @param klartext
	 *            - Text, der verschluesselt werden soll
	 * @return verschluesselter String
	 * @throws CrypterException
	 */
	public String verschluesseln(String klartext) throws CrypterException {
		klartext = klartext.toUpperCase();
		char[] klartextZeichen = klartext.toCharArray();
		for (int i = 0; i < klartext.length(); i++)
			klartextZeichen[i] = verschluesseln(klartextZeichen[i]);
		return String.valueOf(klartextZeichen);
	}

	/**
	 * Methode, die einen Char verschluesseln nach der Subtitutions-Methode
	 * kann.
	 * 
	 * @param klartext
	 *            - Buchstabe, der verschluesselt werden soll
	 * @return verschluesselter Char
	 * @throws CrypterException
	 */
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		try {
			if (k.length() != 26) {
				throw new CrypterException();
			}

			return k.charAt(ALPHABET.indexOf(klartextZeichen));
		} catch (CrypterException e) {
			System.out.print("Der Schluessel ist falsch.");
		}
		return ' ';
	}

	/**
	 * Methode, die einen String entschluesseln nach der Subtitutions-Methode
	 * kann.
	 * 
	 * @param klartext
	 *            - Text, der entschluesselt werden soll
	 * @return entschluesselter String
	 * @throws CrypterException
	 */
	public String entschluesseln(String klartext) throws CrypterException {
		klartext = klartext.toUpperCase();
		char[] klartextZeichen = klartext.toCharArray();
		for (int i = 0; i < klartext.length(); i++)
			klartextZeichen[i] = entschluesseln(klartextZeichen[i]);
		return String.valueOf(klartextZeichen);
	}

	/**
	 * Methode, die einen Char entschluesseln nach der Subtitutions-Methode
	 * kann.
	 * 
	 * @param klartext
	 *            - Buchstabe, der entschluesselt werden soll
	 * @return entschluesselter Char
	 * @throws CrypterException
	 */
	public char entschluesseln(char klartextZeichen) throws CrypterException {

		try {
			if (k.length() != 26) {
				throw new CrypterException();
			}

			return ALPHABET.charAt(k.indexOf(klartextZeichen));
		} catch (CrypterException e) {
			System.out.print("Der Schluessel ist falsch.");
		}
		return ' ';
	}

	/**
	 * Methode, die den Schluessel und den Klartext zuruecksetzt.
	 */
	public void reset() {
		klartext = "";
		k = "";
	}
}
