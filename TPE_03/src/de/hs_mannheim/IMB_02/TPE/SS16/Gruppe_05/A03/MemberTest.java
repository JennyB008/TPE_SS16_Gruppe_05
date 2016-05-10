package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A03;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Testklasse fuer die Klasse "Member".
 * 
 * @author Dominique Bost, Jennifer Brenner, Yjvesa Sejfijaj
 *
 */
public class MemberTest {

	@Test
	public void testMember() {
		Member m1 = new Member(1, "Schmitt", "Peter", 4);
		Member m2 = new Member(1, "Schmitt", "Peter", 4);
		assertEquals(m1, m2);
	}

	@Test
	public void testGetMitgliederID() {
		Member m1 = new Member(1, "Schmitt", "Peter", 4);
		int i = 1;
		assertEquals(i, m1.getMitgliederID());
	}

	@Test
	public void testGetNachname() {
		Member m1 = new Member(1, "Schmitt", "Peter", 4);
		assertEquals("Schmitt", m1.getNachname());
	}

	@Test
	public void testSetNachname() {
		Member m1 = new Member(1, "Mueller", "Peter", 4);
		m1.setNachname("Schmitt");
		assertEquals("Schmitt", m1.getNachname());
	}

	@Test
	public void testGetVorname() {
		Member m1 = new Member(1, "Schmitt", "Peter", 4);
		assertEquals("Peter", m1.getVorname());
	}

	@Test
	public void testSetVorname() {
		Member m1 = new Member(1, "Schmitt", "Peter", 4);
		m1.setVorname("Klaus");
		assertEquals("Klaus", m1.getVorname());
	}

	@Test
	public void testGetAnzahlMitgliedsjahre() {
		Member m1 = new Member(1, "Schmitt", "Peter", 4);
		assertEquals(4, m1.getAnzahlMitgliedsjahre());
	}

	@Test
	public void testSetAnzahlMitgliedsjahre() {
		Member m1 = new Member(1, "Schmitt", "Peter", 4);
		m1.setAnzahlMitgliedsjahre(3);
		assertEquals(3, m1.getAnzahlMitgliedsjahre());
	}

	@Test
	public void testVergleich() {
		Member m1 = new Member(1, "Schmitt", "Peter", 4);
		Member m2 = new Member(1, "Schmitt", "Peter", 4);
		assertEquals(true, m1.vergleich(m2));
	}

	@Test
	public void testToString() {
		Member m1 = new Member(1, "Schmitt", "Peter", 4);
		String s = "MitgliedsID: 1, Nachname: Schmitt, Vorname: Peter, Anzahl der Mitgliedsjahre: 4" + "\n";
		assertEquals(s, m1.toString());
	}

}
