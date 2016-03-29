package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A01;

import static org.junit.Assert.*;

import org.junit.Test;

public class BetragTest {

	@Test
	public void testHashCode() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b1 = new Betrag(12, w);
		Betrag b2 = new Betrag(12, w);
		assertEquals(b1.hashCode(), b2.hashCode());
	}

	@Test
	public void testBetragLongWaehrung() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b1 = new Betrag(12, w);
		Betrag b2 = new Betrag(12, w);
		assertEquals(b1, b2);
	}

	@Test
	public void testBetragDoubleWaehrung() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b1 = new Betrag(12.3, w);
		Betrag b2 = new Betrag(12.3, w);
		assertEquals(b1, b2);
	}

	@Test
	public void testBetragBetrag() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b1 = new Betrag(12.3, w);
		Betrag b2 = new Betrag(12.3, w);
		Betrag b3 = new Betrag(b1);
		assertEquals(b3, b2);
	}

	@Test
	public void testGetWaehrung() {

		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b = new Betrag(12.3, w);
		assertEquals(w, b.getWaehrung());
	}

	@Test
	public void testGetMenge() {
		long l = 12;
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b = new Betrag(12, w);
		assertEquals(l, b.getMenge());
	}

	@Test
	public void testGetVorzeichen() {
		int i1 = 1;
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b = new Betrag(12, w);
		int i2 = b.getVorzeichen();
		assertEquals(i1, i2);
	}

	@Test
	public void testAddiere() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b1 = new Betrag(12, w);
		Betrag b2 = new Betrag(12, w);
		long l = 24;
		assertEquals(l, b1.addiere(b2));

	}

	@Test
	public void testSubtrahiere() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b1 = new Betrag(12, w);
		Betrag b2 = new Betrag(12, w);
		long l = 0;
		assertEquals(l, b1.subtrahiere(b2));
	}

	@Test
	public void testMultipliziereLongDouble() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b1 = new Betrag(1, w);
		long l = 10;
		assertEquals(l, b1.multipliziere(10.0));
	}

	@Test
	public void testMultipliziereLongInt() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b1 = new Betrag(1, w);
		long l = 10;
		assertEquals(l, b1.multipliziere(10));
	}

	@Test
	public void testProzent() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b = new Betrag(100, w);
		double temp = 10.0;
		assertEquals(temp, b.prozent(10.0), 0.01);
	}

	@Test
	public void testPromille() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b = new Betrag(100, w);
		double temp = 1.0;
		assertEquals(temp, b.promille(10.0), 0.01);
	}

	@Test
	public void testGetVorkomma() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b = new Betrag(1250, w);
		long l = 12;
		assertEquals(l, b.getVorkomma());
	}

	@Test
	public void testGetNachkomma() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b = new Betrag(1250, w);
		double d = 0.5;
		assertEquals(d, b.getNachkomma(), 0.01);
	}

	@Test
	public void testToString() {
		String s = "12.5 â‚¬";
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b = new Betrag(1250, w);
		assertEquals(s, b.toString());
	}

	@Test
	public void testGetAsDouble() {
		double d = 12.5;
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b = new Betrag(1250, w);
		assertEquals(d, b.getAsDouble(), 0.01);

	}

	@Test
	public void testEqualsObject() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Betrag b1 = new Betrag(1250, w);
		Betrag b2 = new Betrag(1250, w);
		assertTrue(b1.equals(b2));
	}

}
