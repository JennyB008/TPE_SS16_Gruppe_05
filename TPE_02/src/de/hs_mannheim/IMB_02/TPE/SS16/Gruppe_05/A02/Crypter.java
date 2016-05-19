package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A02;

/**
 * Grundlegendes Interface, um Verschluesselung durchzufuehren. Mit Hilfe dieses
 * Interfaces kann man Nachrichten verschluesseln (ueber die
 * {@link #verschluesseln(char)} Methode) und wieder entschluesseln (ueber die
 * {@link #entschluesseln(char)} Methode).
 *
 * Der Eingabetext, der Zeichenweise uebergeben wird ({@literal klarTextZeichen}
 * ) darf nur aus den Gross-Buchstaben A-Z bestehen. Kleinbuchstaben werden in
 * Grossbuchstaben umgewandelt, alle anderen Zeichen fuehren zu einer Ausnahme.
 *
 * Zwischen den beiden Methoden muss bei gleichem Schluessel folgendes gelten:
 * {@code zeichen == decrypt(encrypt(zeichen))}.
 *
 */
public interface Crypter {
	/**
	 * Setzt die Verschluesselung zurueck. Diese Methode ist bei einigen
	 * Verfahren sinnvoll, bei denen eine Position im Schluessel verwaltet wird,
	 * da diese beim Wechsel von Ver- auf Entschluesselung zurueckgesetzt werdem
	 * muss.
	 */
	public void reset();

	/**
	 * Verschluesselt das gegebene Zeichen.
	 *
	 * @param klartextZeichen
	 *            Zeichen, das verschluesselt werden soll.
	 *
	 * @return verschluesseltes Zeichen.
	 * @throws CrypterException
	 *             Wird geworfen, wenn Probleme mit der Verschlusselung
	 *             auftreten.
	 */
	public char verschluesseln(char klartextZeichen) throws CrypterException;

	/**
	 * Entschlusselt das gegebenen Zeichen.
	 *
	 * @param cypherTextZeichen
	 *            Zeichen, das entschluesselt werden soll. 1
	 *
	 * @return entschluesseltes Zeichen.
	 * @throws CrypterException
	 *             Wird geworfen, wenn Probleme mit der Verschluesselung
	 *             auftreten.
	 */
	public char entschluesseln(char cypherTextZeichen) throws CrypterException;
}
