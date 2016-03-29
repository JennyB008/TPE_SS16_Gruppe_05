package de.hs_mannheim.IMB_02.TPE.SS16.Gruppe_05.A01;

import static org.junit.Assert.*;

import org.junit.Test;

public class WaehrungTest {

	@Test
	public void testHashCode() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Waehrung euro = new Waehrung("Euro", "€", 1.2690);
		assertEquals(w.hashCode(), euro.hashCode());
	}

	@Test
	public void testWaehrung() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Waehrung euro = new Waehrung("Euro", "€", 1.2690);
		assertEquals(w, euro);
	}

	@Test
	public void testGetName() {
		String s = "Euro";
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		assertEquals(s, w.getName());
	}

	@Test
	public void testGetKuerzel() {
		String s = "€";
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		assertEquals(w.getKuerzel(), s);
	}

	@Test
	public void testGetKurs() {
		long l = (long) (1.2690 * 1000);
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		assertEquals(l, w.getKurs() * 1000, 0.01);
	}

	@Test
	public void testToString() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		String s = "Euro [€] 1 $ = 1.269 €";
		assertEquals(s, w.toString());
	}

	@Test
	public void testUmrechnen() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Waehrung usDollar = new Waehrung("US-Dollar", "$", 1.0000);
		Betrag b = new Betrag(1269, w);
		long l1 = w.umrechnen(b, usDollar);
		long l2 = 10;
		assertEquals(l2, l1);
	}

	@Test
	public void testEqualsObject() {
		Waehrung w = new Waehrung("Euro", "€", 1.2690);
		Waehrung euro = new Waehrung("Euro", "€", 1.2690);
		assertTrue(w.equals(euro));
	}

}
