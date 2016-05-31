package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A04;

/**
 * Klasse "Strecke", die eine Hochgeschwindigkeits-Bahnstrecke zwischen
 * Hauptbahnhof Mannheim und Hochschule Mannheim darstellt. Eine Strecke besteht
 * aus mehreren Blöcken.
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */

public class Strecke {

	protected int laenge; // Laenge der Strecke
	protected char[] strecke; // Strecke als Array, damit Laenge beruecksichtigt
								// werden kann
	protected Block[] streckeInBloecken;
	private int blockPos = 0; // Zum positionieren der Bloecke
	private int pruefer = 0; // Zum pruefen der tatsaechlichen Blockanzahl
	private int anzahlBloecke;
	// private boolean[] sperren;

	/**
	 * Konstruktor der Klasse "Strecke".
	 * 
	 * @param laenge
	 *            - Laenge der Strecke in Kilometern
	 * @param anzahlBloecke
	 *            - Anzahl der Bloecke, aus denen die Strecke besteht
	 */

	public Strecke(int laenge, int anzahlBloecke) {
		this.laenge = laenge + anzahlBloecke;
		this.anzahlBloecke = anzahlBloecke;
		strecke = new char[this.laenge];
		for (int i = 0; i < strecke.length; i++) {
			strecke[i] = '-';
		}
		streckeInBloecken = new Block[anzahlBloecke];
		try {
			if (laenge < 1) {
				throw new SimulationException("Strecke muss mindestens eine Laenge von 1 haben");
			}
		} catch (SimulationException se) {
			se.printStackTrace();
		}
		try {
			if (anzahlBloecke < 1) {
				throw new SimulationException("Strecke muss mindestens einen Block haben");
			}
		} catch (SimulationException se) {
			se.printStackTrace();
		}
	}

	/**
	 * Methode, die die Strecke als Array aus Bloecken zurueckgibt
	 * 
	 * @return streckeIbBloecken
	 * 
	 */

	public Block[] getStreckeInBloecken() {
		return this.streckeInBloecken;
	}

	/**
	 * Methode, die einen Block zu einer Strecke hinzufuegt.
	 * 
	 * @param block
	 *            - Block, der hinzugefuegt werden soll
	 */

	public void addBlock(Block block) {
		try {
			if (pruefer >= anzahlBloecke) {
				throw new SimulationException("Die Strecke kann keine weiteren Bloecke haben");
			}
		} catch (SimulationException se) {
			se.printStackTrace();
		}
		streckeInBloecken[pruefer] = block;
		pruefer++;
		block.setAnfang(blockPos);
		block.setEnde(blockPos + block.getLaenge() - 1);
		blockPos = blockPos + block.getLaenge();
	}

	/**
	 * Methode, die die Strecke in einen String umwandelt, so dass sie
	 * ausgegeben werden kann.
	 * 
	 * @return Strecke als String
	 */

	@Override
	public String toString() {
		try {
			if (pruefer < streckeInBloecken.length) {
				throw new SimulationException("Es fehlen noch Bleocke.");
			}
		} catch (SimulationException se) {
			se.printStackTrace();
		}
		try {
			if (pruefer > streckeInBloecken.length) {
				throw new SimulationException("Es gibt zu viele Bloecke");
			}
		} catch (SimulationException se) {
			se.printStackTrace();
		}

		for (int j = 0; j < streckeInBloecken.length; j++) {
			if (streckeInBloecken[j].isSperre()) {
				strecke[streckeInBloecken[j].getAnfang()] = '|';
			} else {
				strecke[streckeInBloecken[j].getAnfang()] = '_';
			}

		}

		String s = String.valueOf(strecke);
		return s;
	}

	/**
	 * Methode, die den naechsten Block einer Strecke zurueckgibt
	 * 
	 * @param block
	 *            - der aktuelle Blog, dessen Nachfolger bestimmt werden soll
	 * @return nachfolgender Block
	 */

	public Block nextBlock(Block block) {
		int i = 0;
		while (streckeInBloecken[i] != block) {
			i++;
		}
		if (i == streckeInBloecken.length - 1) {
			return null;
		}
		if (i < streckeInBloecken.length - 1) {
			return streckeInBloecken[i + 1];
		}
		return null;
	}

	/**
	 * * Methode, die den Hash Code einer Strecke ermittelt
	 * 
	 * @return result - der Hash Code der Strecke
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anzahlBloecke;
		result = prime * result + laenge;
		return result;
	}

	/**
	 * Methode, die zwei Strecken miteinander vergleicht
	 * 
	 * @return true, wenn die Strecken gleich sind; false, wenn die Strecken
	 *         nicht gleich sind
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Strecke other = (Strecke) obj;
		if (anzahlBloecke != other.anzahlBloecke)
			return false;
		if (laenge != other.laenge)
			return false;
		return true;
	}

}