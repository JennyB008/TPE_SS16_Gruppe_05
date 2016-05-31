package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A04;

/**
 * Klasse "Zug", die Zuege darstellt, die auf einer Strecke fahren. Zuege
 * koennen in beide Richtungen fahren und muessen die Siganle in den Bloecken
 * beahcten.
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */

public class Zug implements Runnable {

	private int geschwindigkeit;
	private char name;
	private Strecke strecke;
	private int position;
	private Block block;
	private boolean interrupted = false;

	/**
	 * Konstruktor der Klasse "Zug".
	 * 
	 * @param geschwindigkeit
	 *            - Geschwindigkeit des Zugs
	 * @param name
	 *            - Name des Zugs; nur ein Buchstabe
	 * @param strecke
	 *            - Strecke, auf der der Zug faehrt
	 * @param block
	 *            - der Block in dem sich der Zug befindet
	 * @param position
	 *            - Position auf der Strecke, an der sich der Zug gerade
	 *            befindet
	 */

	public Zug(int geschwindigkeit, char name, Block block, Strecke strecke, int position) {
		this.geschwindigkeit = geschwindigkeit;
		this.name = name;
		this.block = block;
		this.strecke = strecke;
		int i = 0;
		while (strecke.getStreckeInBloecken()[i] != block) {
			i++;
		}
		this.position = position + i;
		this.strecke.strecke[this.position] = this.name;

		block.sperren();
		System.out.println(strecke.toString());
		try {
			if (!this.block.isSperre()) {
				throw new SimulationException("Position nicht möglich. Dieser Block ist besetzt.");
			}
		} catch (SimulationException se) {
			se.printStackTrace();
		}
	}

	/**
	 * Methode, mit der man einen Thread unterbrechen kann
	 */

	public void interrupt() {
		interrupted = true;
	}

	/**
	 * Methode, die einen Zug in einem Block fahren laesst.
	 */

	public void fahren() {

		strecke.strecke[this.position] = '-';
		position++;
		strecke.strecke[this.position] = this.name;
		System.out.println(String.valueOf(strecke));
	}

	/**
	 * Methode, die ueberprueft, ob es zu einem Unfall bekommen ist, weil zwei
	 * oder mehr Zuege in entgegengerichtete Richtungen aufeinander gefahren
	 * sind.
	 * 
	 * @return true, wenn sich ein Unfall ereigenet hat; false, wenn es keinen
	 *         Unfall gibt
	 */

	public boolean unfall() {
		if (strecke.strecke[this.position + 1] != '-' && strecke.strecke[this.position + 1] != '_'
				&& strecke.strecke[this.position + 1] != '|') {
			return true;
		}
		return false;
	}

	/**
	 * Methode, die einen Zug auf der Strecke fahren laesst und aufgerufen wird,
	 * wenn ein Thread gestartet ist.
	 */

	public void run() {
		while (!interrupted) {
			synchronized (block) {
				if (this.position == this.strecke.laenge - 1) {
					strecke.strecke[this.position] = '-';
					this.block.entsperren();
					interrupted = true;
					System.out.println(String.valueOf(strecke));
				}
				if (this.block.getEnde() == this.position) {
					if (strecke.nextBlock(this.block).isSperre()) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					} else {
						strecke.strecke[this.position] = '-';
						this.block.entsperren();

						this.position = position + 2;
						;
						strecke.nextBlock(block).sperren();
						strecke.strecke[this.position] = this.name;
						System.out.println(String.valueOf(strecke));
					}
				}
				if (this.unfall()) {
					try {
						throw new SimulationException("Es gab einen Unfall.");
					} catch (SimulationException se) {
						se.printStackTrace();
					}finally {
						this.interrupt();
					}
				}
				if (strecke.strecke[this.position + 1] == '-') {
					fahren();

				}
			}
		}

	}

	/**
	 * * Methode, die den Hash Code eines Zugs ermittelt
	 * 
	 * @return result - der Hash Code des Zugs
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + geschwindigkeit;
		result = prime * result + name;
		result = prime * result + position;
		result = prime * result + ((strecke == null) ? 0 : strecke.hashCode());
		return result;
	}

	/**
	 * Methode, die zwei Zuege miteinander vergleicht
	 * 
	 * @return true, wenn die Zuege gleich sind; false, wenn die Zuege nicht
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
		Zug other = (Zug) obj;
		if (geschwindigkeit != other.geschwindigkeit)
			return false;
		if (name != other.name)
			return false;
		if (position != other.position)
			return false;
		if (strecke == null) {
			if (other.strecke != null)
				return false;
		} else if (!strecke.equals(other.strecke))
			return false;
		return true;
	}

}