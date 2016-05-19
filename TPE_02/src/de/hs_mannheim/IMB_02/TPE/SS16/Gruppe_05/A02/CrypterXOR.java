package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A02;

/**
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */

public class CrypterXOR extends CrypterBasic implements Crypter {
	private char[] klartextArray = klartext.toCharArray();
	int j = 0;
	char[] keyArray = keyInArray(klartext);
	private String k = key.getKey();

	private char[] alphabet = { '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
			'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '/', ']', '^', '_' };

	/**
	 * Konstruktor der Klasse "CrypterXOR"
	 * 
	 * @param key
	 *            - Schluessel für die Verschluesselung
	 */
	public CrypterXOR(Key k) {
		super(k);
	}

	public char[] keyInArray(String klartext) {

		if (k.length() < klartext.length()) {

			for (int i = 0; i < klartext.length(); i++) {
				keyArray[i] = k.charAt(j);
				j++;
				if (j == k.length()) {
					j = 0;
				}
			}
		}
		return keyArray;
	}

	/**
	 * Methode, die den Indexplatz eines Char im Array zurueckgibt.
	 * 
	 * @param c
	 *            - Char, von dem der Index gesucht ist
	 * @param a
	 *            - Array, in dem gesucht werden soll
	 * @return Indexplatz von Char c im Array a
	 */
	public int getIndex(char c, char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (c == a[i]) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Methode, die den Char an einem bestimmten Index im Array zurueckgibt.
	 * 
	 * @param i
	 *            - Indexposition
	 * @param a
	 *            - Array, in dem der Char steht
	 * @return Char an dem Index i im Array a
	 */
	public char getChar(int i, char[] a) {
		return a[i];
	}

	/**
	 * 
	 * Methode, die einen String verschluesseln nach der XOR-Methode kann.
	 * 
	 * @param klartextArray
	 *            - Text, der verschluesselt werden soll
	 * @return verschluesselter String
	 * @throws CrypterException
	 */
	public String verschluesseln(char[] klartextArray) throws CrypterException {
		for (int i = 0; i < klartext.length(); i++) {
			klartextArray[i] = verschluesseln(klartextArray[i]);
		}
		return String.valueOf(klartextArray);
	}

	/**
	 * Methode, die einen Char verschluesseln nach der XOR-Methode kann.
	 * 
	 * @param klartextZeichen
	 *            - Buchstabe, der verschluesselt werden soll
	 * @return verschluesselter Char
	 * @throws CrypterException
	 */
	public char verschluesseln(char klartextZeichen) throws CrypterException {
		try {
			boolean bo = false;
			for (int k = 0; k < keyArray.length; k++) {
				char c = getChar(k, keyArray);
				for (int z = 0; z < alphabet.length; z++) {
					if (c == getChar(z, alphabet)) {
						bo = true;
					}
				}
			}
			if (bo != true) {
				throw new CrypterException();
			}
			int i = getIndex(klartextZeichen, klartextArray);
			char keyChar = getChar(i, keyArray);
			int a = getIndex(keyChar, alphabet);
			int b = getIndex(klartextZeichen, alphabet);
			int erg = (a ^ b);
			char verschluesselt = getChar(erg, alphabet);
			return verschluesselt;
		} catch (CrypterException e) {
			System.out.print("Der Schluessel ist falsch");

		}
		return ' ';

	}

	/**
	 * Methode, die einen String entschluesseln nach der XOR-Methode kann.
	 * 
	 * @param klartextArray
	 *            - Text, der entschluesselt werden soll
	 * @return entschluesselter String
	 * @throws CrypterException
	 */
	public String entschluesseln(char[] klartextArray) throws CrypterException {

		return verschluesseln(klartextArray);
	}

	/**
	 * Methode, die einen Char entschluesseln nach der Caesar-Methode kann.
	 * 
	 * @param klartextZeichen
	 *            - Buchstabe, der entschluesselt werden soll
	 * @return entschluesselter Char
	 * @throws CrypterException
	 */
	public char entschluesseln(char klartextZeichen) throws CrypterException {
		try {
			boolean bo = false;
			for (int k = 0; k < keyArray.length; k++) {
				char c = getChar(k, keyArray);
				for (int z = 0; z < alphabet.length; z++) {
					if (c == getChar(z, alphabet)) {
						bo = true;
					}
				}
			}
			if (bo != true) {
				throw new CrypterException();
			}

			return verschluesseln(klartextZeichen);
		} catch (CrypterException e) {
			System.out.print("Der Schluessel ist falsch");

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
