package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A01;

/**
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */
public class Waehrung extends Waehrungen {
	private String name;
	private String kuerzel;
	private double kurs;

	/**
	 * Konstruktor der Klasse Waehrung
	 ** 
	 * @param name
	 *            - Name der Waehrung
	 * @param kuerzel
	 *            - Kuerzel der Waehrung
	 * @param kurs
	 *            - Wechselkurs in Dollar
	 */
	public Waehrung(String name, String kuerzel, double kurs) {
		this.name = name;
		this.kuerzel = kuerzel;
		this.kurs = kurs;
	}

	/**
	 * Methode, die den Namen der Waehrung liefert
	 * 
	 * @return Name der Waehrung
	 */
	public String getName() {
		return name;
	}

	/**
	 * Methode, die das Kuerzel der Waehrung liefert
	 * 
	 * @return Kuerzel der Waehrung
	 */
	public String getKuerzel() {
		return this.kuerzel;
	}

	/**
	 * Methode, die den Kurs der Waehrung liefert
	 * 
	 * @return Kurs der Waehrung
	 */
	public double getKurs() {
		return kurs;
	}

	/**
	 * Methode, die Informationen zu eine Waehrung als String zurück gibt
	 * 
	 * @return s - String, der den Namen einer Waehrung, deren Kuerzel und den
	 *         Wechselkurs zum Dollarangibt
	 */
	@Override
	public String toString() {
		String s = this.getName() + " " + "[" + this.getKuerzel() + "] 1 $ =" + " " + this.getKurs() + " "
				+ this.getKuerzel();
		return s;
	}

	/**
	 * Methode, die einen Betrag in eine andere Währung umrechnet
	 * 
	 * @param b
	 *            - der Betrag, der umgerechnet werden soll
	 * @param z
	 *            - die Währung, in die umgerechnet werden soll
	 * @return neu - der umgerechnete Wert des Betrags
	 */
	public long umrechnen(Betrag b, Waehrung z) {
		double temp1 = (double) (b.menge / 100.0);
		double temp2 = this.kurs;
		double temp3 = z.kurs;
		double temp4 = temp1 / temp2;
		long neu = (long) (temp4 * temp3);
		return neu;
	}

	/**
	 * Methode, die den Hash Code eines Objekts ermittelt
	 * 
	 * @return result - der Hash Code des Objekts
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * Methode, die zwei Objetkte miteinander vergleicht
	 * 
	 * @return ture, wenn die Objekte gleich sind; false, wenn die Objekte nicht
	 *         gleich sind
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Waehrung other = (Waehrung) obj;
		if (kuerzel == null) {
			if (other.kuerzel != null)
				return false;
		} else if (!kuerzel.equals(other.kuerzel))
			return false;
		if (Double.doubleToLongBits(kurs) != Double.doubleToLongBits(other.kurs))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}