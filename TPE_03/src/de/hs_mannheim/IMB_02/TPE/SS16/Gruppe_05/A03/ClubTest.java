package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A03;

import static org.junit.Assert.*;


import org.junit.Test;

/**
 * Testklasse "ClubTest" der Klasse "MembershipList".
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */

public class ClubTest {

	@Test
	public void testMembershipList() {
		MembershipList liste1 = new MembershipList();
		MembershipList liste2 = new MembershipList();
		equals(liste1.equals(liste2));
	}

	@Test
	public void testPutMember() {
		MembershipList liste = new MembershipList();
		Member m = new Member(1, "M", "M", 1);
		liste.put(m);
		String s = "1 " + m.toString() + "\n";
		assertEquals(s, liste.toString());
		
	}

	@Test
	public void testIterieren() {
		MembershipList liste = new MembershipList();
		Member a = new Member(2, "Mustermann", "Heinz", 16);
		liste.put(a);
		String s = "2 " + a.toString() + "\n";
		assertEquals(s, liste.iterieren());
	}

	@Test
	public void testToString() {
		MembershipList liste = new MembershipList();
		Member a = new Member(2, "Mustermann", "Heinz", 16);
		liste.put(a);
		String s = "2 " + a.toString() + "\n";
		assertEquals(s, liste.toString());
	}

}