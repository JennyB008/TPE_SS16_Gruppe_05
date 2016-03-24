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
		super(name, kuerzel, kurs);
	}

	/**
	 * Methode, die das Kuerzel der Waehrugn liefert
	 * 
	 * @return Kuerzel der Waehrung
	 */
	public String getKuerzel() {
		return kuerzel;
	}

	/**
	 * Methode, die den Kurs der Waehrugn liefert
	 * 
	 * @return Kurs der Waehrung
	 */
	public double getKurs() {
		return kurs;
	}

	/**
	 * Methode, die den Namen der Waehrugn liefert
	 * 
	 * @return Name der Waehrung
	 */
	public String getName() {
		return name;
	}

	/**
	 * Methode, die einen Betrag in eine andere Waehrugn umrechnet und diesen
	 * dann zurückliefert
	 * 
	 * @param b
	 *            - Betrag b, der umgerechent wird
	 * @param z
	 *            - Waehrung z, in die umgerechnet wird
	 * @return umgerechneter Betrag
	 */
	public long umrechnen(Betrag b, Waehrung z) {
		long neu = (long) ((b.menge * (double) this.kurs) / z.kurs);
		return neu;
	}

	@Override
	public String toString() {
		return this.getName() + " " + "[" + this.getKuerzel() + "] 1 $ =" + " " + this.getKurs();
	}

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