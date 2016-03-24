/**
 * Aufgabe 2:
 * 
 * Der Packetname wurde so gewählt, dass es nicht zur Kollision mit anderen Packet kommen kann, die eventuell den gleichen Namen haben.
 * 
 * de - Deutschland;
 * hs_mannheim - Hochschule Mannheim;
 * IMB_02 - Medizinische Informatik, 2.Semster;
 * TPE.SS16 - Techniken der Programmierentwicklung im Sommersemster 2016;
 * Gruppe 05;
 * 
 * So kann es nicht zu Verwechslungen mit anderen Projekten kommen und es kann eindeutig einer Gruppe und Aufgabe zugeordnet werden.
 *   
 **/

package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A01;

/**
 * 
 * 
 * 
 * @author Dominique Bost, Jennifer Brenner,  Yjvesa Sejfijaj
 *
 */


public class Waehrungen {
	
	private String name;
	private String kuerzel;
	private double kurs;
	
	
	/**
	 * Konstruktor der Klasse Waehrungen
	 * 
	 * @param name
	 *            - Name der Waehrung
	 * @param kuerzel
	 *            - Kuerzel der Waehrung
	 * @param kurs
	 *            - Wechselkurs in Dollar
	 */
	
	public Waehrungen(String name, String kuerzel, double kurs){
		this.name = " ";
		this.kuerzel = " ";
		this.kurs = 0.0;
	}
	
	Waehrungen usDollar = new Waehrungen("US-Dollar", "$" , 1.0000);
	Waehrungen euro = new Waehrungen("Euro" , "€" , 1.2690);
	Waehrungen yen = new Waehrungen("Yen" , "¥" , 0.0091);
	Waehrungen rubel = new Waehrungen ("Rubel" , "RUB" , 0.0255);
	Waehrungen schweizerFranken = new Waehrungen ("Schweizer Franken" , "CHF" , 1.0509);
	
}