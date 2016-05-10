package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A03;

import java.util.HashMap;
import java.util.Map;

/**
 * Klasse "MembershipList", in der die Mitgliedsdaten abgelegt sind.
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */
public class MembershipList extends HashMap<Integer, Member>implements Map<Integer, Member> {

	/**
	 * Konstuktor der Klasse MembershipList
	 */
	public MembershipList() {
		super();
	}

	/**
	 * Methode, die ein neues Mitglied in die Liste einfuegt
	 * 
	 * @param member
	 *            - Mitglied, das eingefuegt werden soll
	 * @return
	 */
	public Member put(Member member) {
		return put(member.getMitgliederID(), member);
	}

	/**
	 * Methode, die die Liste iteriert
	 * 
	 * @return liste - die Liste als String
	 */
	public String iterieren() {
		String liste = "";
		for (Entry<Integer, Member> eintrag : this.entrySet()) {
			liste = liste + eintrag.getKey() + " " + eintrag.getValue() + "\n";
		}
		return liste;
	}

	/**
	 * Methode, die die Liste als String wiedergibt
	 */
	public String toString() {
		return this.iterieren();
	}

}